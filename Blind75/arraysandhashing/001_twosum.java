class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Create a hashmap
        loop through array
        add key as val and value as index..
        if the map contains key that is (target-nums)
        return both indexes...

        Time complexity: O(n)
        */
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {

            if(map.containsKey(target-nums[i])) {
                return new int[] {i,map.get(target-nums[i])};

            }else {
                map.put(nums[i],i);
            }
        }

        throw new IllegalArgumentException("no match found");




    }
}