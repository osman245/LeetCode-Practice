class Solution {
    public int search(int[] nums, int target) {
        /*
        modified version of binary search
        to get where the array is starting from
        then nomral version of binary search to get the target element index
        use an if statement to check if at start it starts incrementing or decrementing....
        set start to left or rigtht depending on this info...


        O(n)
        time exceeded
        ..come back to this one...
        */

        if(nums == null || nums.length == 0) return -1;


        int left = 0;
        int right = nums.length-1;
        int midpoint = 0;
        while(left < right) {
            midpoint = left + (right - left)/2;
            if(nums[midpoint] > nums[right]) { //pecuilar for a sorted array...
                midpoint = left +1;
            }else {
                midpoint = right;
            }
        }


        int start = left; //found the lowest value.. through the previous modified ninary search..
        left = 0;
        right = nums.length-1;

        if(target >= nums[start] && target <= nums[right] ){
            left = start;
        }else {
            right = start;
        }



        while(left <= right) {
            midpoint = left + (right - left)/2;
            if(nums[midpoint] == target) {
                return midpoint;
            }else if(nums[midpoint] < target) {
                left = midpoint +1;
            }else {
                right = midpoint-1;
            }

        }
        return -1;























    }
}