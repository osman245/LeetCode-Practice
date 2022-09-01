class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        Create a helper that checks if the value exists thats consecutive...
        comeback to this...
        doesnt work rn....

        */



        int maxSeq = 0;

        for(int i = 0; i < nums.length;i++) {
            int current_num = nums[i];
            int current_sequence_length = 1;

            while(booleanExists(nums,current_num+1)) {
                current_num += 1;
                current_sequence_length += 1;
            }
            maxSeq = Math.max(maxSeq,current_sequence_length);
        }

        return maxSeq;

    }

    private boolean booleanExists(int[] nums, int num) {
        for(int i = 0; i < nums.length;i++) {

            if(nums[i] == num) return true;

        }
        return false;
    }





}