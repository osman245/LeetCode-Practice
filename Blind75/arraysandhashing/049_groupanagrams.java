class Solution {
    /*
    Step1: create a list that stores List<List<String>> and hashmap that stores <String,ArrayList<String>>
    Step2: Loop through the array...
    Step3: If u cant find string key in map, string convert to char array then sort it, then make it a string again using new string(char[]); then put key as the sorted string and create a new arraylisy for its value..
    Step4: add string current in sorted keys arraylist value...
    Step5: add all map values to list..

    Time Complexity : O(n)

    */
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap();

        for(String curr:strs) {
            char[] characters = curr.toCharArray();
            Arrays.sort(characters);
            String s =  new String(characters);
            if(!map.containsKey(s)) {
                map.put(s,new ArrayList<String>());
            }

            map.get(s).add(curr);

        }

        list.add(map.values()); //error over here
        return list;

    }
}

//incomplete