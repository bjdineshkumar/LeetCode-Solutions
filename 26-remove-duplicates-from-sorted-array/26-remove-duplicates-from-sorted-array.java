class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 1; // Index to store 
        int k = 1;
        for(int i = 0 ; i < nums.length-1 ; i++) {
           if(nums[i] != nums[i+1]) {
               nums[index++] = nums[i+1];
               k++;
           } 
        }
        return k;
    }
}