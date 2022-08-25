class Solution {
    public boolean isPalindrome(String s) {
  /*
  We use the two pointer method for this problem.
  We make the string lowercase, we make the string only have alphanumeric values. then we use a high and low pointer at two contrasting ends of the array.

  Time complexity: O(n)

  */
        String a = s.toLowerCase();
        String characters = "";

        for(char x: a.toCharArray()) {
            if(Character.isLetterOrDigit(x)) {
                characters+=x;
            }
        }
        System.out.println(characters);

        int high = characters.length()-1;
        int low = 0;

        while(low < high) {

            if(characters.charAt(low) != characters.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }
        return true;










    }
}