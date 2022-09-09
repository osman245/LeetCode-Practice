class Solution {
    public int trap(int[] height) {
// In this question we need to figure out how much units of trapped rain water there is....
        //follow the formula min(max L,max R) - //hieght[i]

        int l = 0;
        int r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int res = 0;

        while(l < r) {

            if(leftMax < rightMax) {
                l++;   //since the endpoints cannot contain water.. we increment it first..
                leftMax = Math.max(leftMax,height[l]);
                res += leftMax - height[l];
                A

            }else {
                r--; //since the endpoints cannot contain water..
                rightMax = Math.max(rightMax,height[r]);
                res += rightMax - height[r];



            }
        }

        return res;







    }
}