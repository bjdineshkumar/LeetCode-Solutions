class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        subsetCalc(nums, 0, new ArrayList<Integer>());
        return result;
    }
    
    private void subsetCalc(int[] nums, int index, List<Integer> cur) {
        result.add(new ArrayList<>(cur));
        
        for(int i = index; i < nums.length ; i++) {
            cur.add(nums[i]);
            subsetCalc(nums, i+1 , cur);
            cur.remove(cur.size() -1);
        }
        
    }
}