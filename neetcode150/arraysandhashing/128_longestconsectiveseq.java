class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        Create a helper that checks if the value exists thats consecutive...

        */
        int maxCurr = 0;
        HashSet<Integer> set = new HashSet();

        for(int i = 0; i < nums.length;i++) { //add all array to set.
            set.add(nums[i]);
        }

        for(int x:set) { // loop through set
            if(!set.contains(x-1)) { //if set does not contain the next val...
                int current = 1;//sequence size of 1 for 1...
                int curr_num = x;//1

                while(set.contains(curr_num+1)){ //2 -- 3 -- 4
                    current++;
                    curr_num++;
                }
                maxCurr = Math.max(maxCurr,current);
            }


        }
        return maxCurr;




    }






}




// // longest = 0
//     num_set = set(nums)

//     for num in num_set:
//         if num - 1 not in num_set:
//             current_num = num
//             current = 1

//             while current_num + 1 in num_set:
//                 current_num += 1
//                 current += 1
//             longest = max(longest, current)

//     return longest



//     int maxSeq = 0;

//         for(int i = 0; i < nums.length;i++) {
//             int current_num = nums[i]; //4
//             int current_sequence_length = 1;

//             while(booleanExists(nums,current_num+1)) {//101
//                 current_num += 1;
//                 current_sequence_length += 1;
//             }
//             maxSeq = Math.max(maxSeq,current_sequence_length);
//         }

//         return maxSeq;

//     }

//     private boolean booleanExists(int[] nums, int num) {
//         for(int i = 0; i < nums.length;i++) {

//           if(nums[i] == num) return true;

//         }
//         return false;
//     }