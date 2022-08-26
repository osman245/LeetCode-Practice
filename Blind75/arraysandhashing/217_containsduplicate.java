class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        create a hashset.
        loop through array.
        if hashset already contains val in array
        return true..
        */
        HashSet<Integer> set = new HashSet();

        for(int val: nums) {
            if(set.contains(val)) return true;
            set.add(val);
        }
        return false;



    }
}