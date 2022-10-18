class Solution {
    public int lengthOfLongestSubstring(String s) {
        //not working rn..
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int a = 0; //pointer in front
        int b = 0; //pointer in the back

        while(a < s.length()) {

            if(!set.contains(s.charAt(a))) {
                set.add(s.charAt(a));
                max = Math.max(max,set.size());
                a++;
            }else {
                set.remove(b);
                b++;

            }






        }

        return max;











    }
}
