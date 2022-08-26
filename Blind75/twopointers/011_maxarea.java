class Solution {
    public int maxArea(int[] height) {
        /*
        use two pointers method..
        iterate coming from both sides, going towards the same direction until low is not less then high pointer...
        thats when we went through all options.
        return the highest value..

        Time complexity: O(n)

        */
        int max = 0;
        int high = height.length-1;
        int low = 0;

        while(low < high) {
            if(height[low] < height[high]) {
                max = Math.max(max, height[low] *(high - low));
                low++;
            }else {
                max = Math.max(max, height[high] *(high - low));
                high--;
            }

        }

        return max;


    }
}