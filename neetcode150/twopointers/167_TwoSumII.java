class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /*
        Create 2 index array
        create two pointers high and low
        loop through array while low < high..
        ...
        do question tmrw...
        */
        int ans = 0;
        int[] array = new int[2];
        int low = 0;
        int high = numbers.length - 1;

        while(low < high) {

            ans = numbers[low] + numbers[high];

            if(ans == target) {
                array[0] = low+1;
                array[1] = high+1;
                break;
            }else if(ans < target) {
                low++;
            }else if(ans > target) {
                high--;
            }
        }


        return array;


    }
}