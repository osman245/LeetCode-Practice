class Solution {
    public boolean isValid(String s) {
        //determine if the string is valid, its a stack q, if the stack is empty the that reps its a valid parenthesis...
        Stack<Character> stack = new Stack();
        if(s.length() % 2 != 0) return false;

        for(char c: s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if(c == ']' && !stack.empty() && stack.peek() == '[' ) {
                stack.pop();
            }else if(c == ')' && !stack.empty() && stack.peek() == '(' ) {
                stack.pop();
            }else if(c == '}' && !stack.empty() && stack.peek() == '{' ) {
                stack.pop();
            }else {
                stack.push(c);
            }


        }

        return stack.empty();




    }
}