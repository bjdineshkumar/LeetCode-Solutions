class Solution {
    public int missingNumber(int[] nums) {
        
        int totalSum = 0;
        int expectedSum = 0;
        
        for(int i = 0 ; i< nums.length ;i++) {
            totalSum += nums[i];
            expectedSum += i+1;
        }
        
        return expectedSum - totalSum;
        
    }
}