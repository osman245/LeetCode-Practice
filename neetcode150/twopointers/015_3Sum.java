class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        To solve this question we use the pointer method....
        We sort the array, we loop through the array with an i index...
        If the value at index i and the value at index i + 1 are equal, we skip it because we cant have duplicates.
        If  we find that i and i + 1 index array value arent equal to each other, We make two pointers(high and low), low will be i+1 and high pointer be at the end of the array.. and we make a variable sum = 0 - num[i];
 We loop through the pointers while low < high ...
      if high + low indexes array value = sum we add it to the list...
      then we loop until we get new low and high values
      if high + low index array value < sum increase the low pointer
    high + low index array value > sum  decrease the high pointer
     then we return the list...

    Time Complexity: O(n^2)

        using two pointers, while looping with an index i...


        */

        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList();
        if(nums.length < 3) return list;

        for(int i = 0; i < nums.length -2 ;i++) {
            if(i == 0 || i > 0 && nums[i] != nums[i+1]) {
                int high = nums.length - 1;
                int low = i +1;
                int sum = 0 - nums[i];
                while(low < high) {
                    if((nums[high] + nums[low]) == sum) {
                        list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++; //avoid duplicate nums for the next designated pointer...
                        while(low < high && nums[high] == nums[high-1]) high--;
                        low++;
                        high++;
                    }else if(nums[high] + nums[low] > sum) {
                        high--;
                    }else {
                        low++;
                    }
                }

            }

        }

        return list;




    }
}