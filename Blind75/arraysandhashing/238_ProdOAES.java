class Solution {
    public int[] productExceptSelf(int[] nums) {
//start at the second element... set first element to 1...
        //step 1:multiply together values from the left side of array val
//Step 2: multiply together values from the right side of the array...
// check sketches i got for more clarity..

        int N = nums.length;

        int[] output_arr = new int[N];

        output_arr[0]  = 1;

        for(int i = 1; i<N;i++) {
            output_arr[i] = nums[i-1] * output_arr[i-1];
        }

        int R = 1;
        for(int i = N-1;i >=0;i--) {
            output_arr[i] = output_arr[i] * R;
            R = R * nums[i];
        }

        return output_arr;
    }
}