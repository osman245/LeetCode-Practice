class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window question...
         /*
       1.) Create a hashset and two pointers....
       2.) loop through string... add it if the set doesnt have it, and set max as set size..
       3) increment j pointer
       4) if set already contains a val, remove that val from set and increment i pointer....
       5) return am
       */

        HashSet<Character> set = new HashSet();
        int i = 0;
        int j = 0;
        int max = 0;

        while( j < s.length()) {

            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(),max);

            }else {
                set.remove(s.charAt(i));
                i++;



            }


        }
        return max;



    }
}


//dvdf  i-0 j-1 set:d i-0 j-0

