class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*
        Create a stack
        loop through array..
        if stack not empty and prev is higher push i to stack...


        go over this more, this one requires more thinking...

        */

        int n= temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){ //start from other side of array
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }

            if(!st.isEmpty()){ //if stack is not empty and there is still a day thats coldercolder...
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }

        return ans;














    }
}