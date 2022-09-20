class Solution {
    public List<String> generateParenthesis(int n) {




   /*
   Important things to know: there is always 2 * n amount of parenthesis.
   there is always the same amount of open then there are closing brackets...
Thus keep a close attention on how many strings are opening and closing..
Recursion seems appriopriate with this kind of question....
   */



        List<String> list = new ArrayList<>(); //put all strings in here..
        String str = ""; //create all strings in this..
        helper(list,str,0,0,n);
        return list;


    }


    public void helper(List<String> list,String str,int open,int close,int n) {
        //base case..
        if(str.length() == 2*n) { //used up all brackets...add string to arraylist
            list.add(str.toString());
            return;
        }


        if(open < n) {
            helper(list,str+"(",open+1,close,n);
        }

        //their should not be a moment in time where there is more closed brackets then open brackets..
        if(open > close) {
            helper(list,str+")",open,close+1,n);
        }
    }








}