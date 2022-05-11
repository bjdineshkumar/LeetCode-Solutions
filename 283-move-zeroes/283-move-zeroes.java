class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        int indexZero = 0;
        
        for(int i=0 ; i < n ; i++) {
            
            if(nums[i] != 0) {
                nums[indexZero] = nums[i];
                indexZero++;
            }
        }
        
        for(int i = indexZero ; i < n ; i++) {
            nums[i] = 0;
        }
    }
}