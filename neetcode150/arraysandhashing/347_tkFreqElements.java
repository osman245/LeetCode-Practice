class Solution {
    /*
    Step 1: Save each element's appearance in a table(hashmap)
    Step 2: Store each element's frequence as the key
    Step 3: Get Top 'k' elements.
    Time complexity:
    Come back to this question...
    */


    public List<Integer> topKFrequent(int[] nums, int k) {

        //Step 1
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);//(get the key or default 0)+1;
        }


        //Step 2
        Map<Integer,List<Integer>> map2 = new HashMap<>();

        for(int num:map.keySet()) {
            int freq = map.get(num);
            if(!map2.containsKey(freq)) {
                map2.put(freq,new ArrayList<>());
            }
            map2.get(freq).add(num);
        }

        //Step3
        List<Integer> res = new ArrayList<>();
        for(int i = nums.length;i > 0;i--) {
            if(map2.containsKey(i)) { //you have a val with freq of i
                List<Integer> list = map2.get(i);
                for(int num:list) {
                    res.add(num);
                    k--;
                    if(k == 0) return res;
                }

            }
        }







        return res;
    }
}












//solved in linear time.... bucketsort...