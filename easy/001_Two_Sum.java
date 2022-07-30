class Solution {
/*
The problem to solve is finding two numbers in the array that add up to the target
we will do this by creating a hashmap and adding <k,v> pairs (the key being the found num, and the value being the index) for every num in the loop. if the hashmap contains the diff field then that means the current value and map of the diff field have two values that add up to the target number

Step 1: Create a hashmap <integer,integer>
Step 2: Loop through the array.
Step 2: do diff = target - value
Step 3: if map contains key diff, return new int {map.get(diff),i}
Step 4: do map.put(map.put(nums[i],i))
Step 5: throw illegalexception if doesnt exist

git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:osman245/LeetCode-Practice.git
git push -u origin main
*/




    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) {
                return new int[] {map.get(diff),i};
            }

            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("Value");
    }



}