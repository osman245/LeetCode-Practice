class Solution {
    /*
    We create one array sized 26, for each lettter in the alphabet..
    We loop string s
    for string s, we increment an array element depending on what char the string s is iterating at ; would increment count[3] if char was a 'c'.
    for string t, we decrement an array element depending on what char the string t is iterating at ; would increment count[3] if char was a 'c'.
    the whole array needs to have all its elements 0 or return false...
    else return truue..

    Time complexity: O(n)

    */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;


        int[] counts = new int[26];

        for(int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }


        for(int count:counts) {
            if(count != 0) return false;
        }

        return true;




    }
}