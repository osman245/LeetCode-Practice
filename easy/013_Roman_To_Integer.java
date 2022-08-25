class Solution {
    public int romanToInt(String s) {
   /*
   The goal of this problem is to return the integer value of a giving String roman numeral
   we will use hashmap, because of its O(1) complexity when putting and getting values

   Step 1: Put all values Character and Integer in the hashmap, Declare a result variable and initialize it to zero
   Step 2: Loop through the string
   Step 3: apart from those roman numerals with only one character, if a smaller character precedes a greater characters, the two sums together gets reduced by the smaller character..(be wary that we substract the smaller value by a factor of two to account for s.charAt(i-1) being adding once before initially.)
   Step 4: add the result num..
   step 5: return the result




  */

        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1)) ) {
                result+= map.get(s.charAt(i)) - 2*map.get(s.charAt(i-1));

            }else {

                result+= map.get(s.charAt(i));
            }



        }
        return result;









    }
}