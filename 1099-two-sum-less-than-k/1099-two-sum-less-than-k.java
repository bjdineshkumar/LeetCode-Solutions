class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int n = nums.length;
        
        int result = 0;
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i < n-1 ; i++) {
            
            for(int j = i+1 ; j < n ; j++) {
                if(nums[i]+nums[j] < k) {
                result = Math.max(result,nums[i]+nums[j]);
            }
            }
        }
        
        if(result == 0) {
            return -1;
        }
        
        return result;
    }
}