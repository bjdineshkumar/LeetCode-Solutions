class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        // Iterating through the array
        for(int i = 0 ; i < nums.length ; i++) {
            int remVal = target - nums[i];
            if(numMap.containsKey(remVal)) {
                return new int[] { numMap.get(remVal), i};
            } else {
                numMap.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}