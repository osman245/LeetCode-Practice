class Solution {
    public boolean checkInclusion(String s1, String s2) {
  /*
 comeback to this, some error with contains key...
  */


        HashMap<Character,Integer> map = new HashMap<>(); // create dictionary..
        int w = s1.length();

        for(int i = 0; i < w;i++) {
            map.put(s1.charAt(i),1);
        }

        for(int i = 0; i < s2.length();i++) { //ab ----  eidbaooo
            if(map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
            }

            if(i >= w && map.containsKey(s2.charAt(i-w))) { //deals with the sliding window...
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)+1);
            }




        }
        for(int x:map.values()) {

            if(x != 0) return false;
        }

        return true;

    }
}