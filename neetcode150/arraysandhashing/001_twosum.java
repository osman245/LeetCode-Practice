class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Create a hashmap
        loop through array
        add key as val and value as index..
        if the map contains key that is (target-nums)
        return both indexes...
         [
        Time complexity: O(n)
          diff = target- nums[i];
          diff + nums[i] = target....
        */
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {
            int diff = target-nums[i];
            if(map.containsKey(diff)) {
                return new int[] {i,map.get(diff)};

            }else {
                map.put(nums[i],i);
            }
        }

        throw new IllegalArgumentException("no two sums that equal target..");




    }
}