class Solution {
      /*
       Note that division between two integers should truncate toward (floor).
       Reverse Polish notation (RPN), also known as reverse Łukasiewicz notation, Polish postfix notation or simply postfix notation, is a mathematical notation in which operators follow their operands, in contrast to Polish notation (PN), in which operators precede their operands. It does

    seems that once we recieve a digit followed by a sign we conduct implementations..
    */



    //case 1: number followed by number,just add to back of stack
    //case 2: number followed by sign.. calculate... most immediate numbers then pop off stack using pollLast
    //case 3: sign followed by sign.... calculate with whatever numbers left...



    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        Map<String, Calculator> map = new HashMap<>();
        map.put("+", new Calculator(new AddOperator()));
        map.put("-", new Calculator(new SubOperator()));
        map.put("*", new Calculator(new MulOperator()));
        map.put("/", new Calculator(new DivOperator()));

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (!map.containsKey(token)) {
                stack.offerLast(Integer.parseInt(token));
            } else {
                int b = stack.pollLast();
                int a = stack.pollLast();
                int tmp = calculate(a, b, token, map);
                stack.offerLast(tmp);
            }
        }

        return stack.peekLast();
    }

    private int calculate(int a, int b, String oper, Map<String, Calculator> map) {
        Calculator c = map.get(oper);
        return c.execute(a, b);
    }

    interface IOperator {
        public int execute(int a, int b);
    }

    class AddOperator implements IOperator {
        public int execute(int a, int b) {
            return a + b;
        }
    }

    class SubOperator implements IOperator {
        public int execute(int a, int b) {
            return a - b;
        }
    }

    class MulOperator implements IOperator {
        public int execute(int a, int b) {
            return a * b;
        }
    }

    class DivOperator implements IOperator {
        public int execute(int a, int b) {
            return a / b;
        }
    }

    class Calculator {
        private IOperator op;

        public Calculator(IOperator op) {
            this.op = op;
        }

        public int execute(int a, int b) {
            return op.execute(a, b);
        }
    }
}