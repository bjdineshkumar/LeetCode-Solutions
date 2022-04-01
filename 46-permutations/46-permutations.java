class Solution {
    List<List<Integer>> combinations = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> decisionTree = new ArrayList<>();
        
        // Iterating through num to add the numbers
        // into the decision tree
        for(int num : nums) {
            decisionTree.add(num);
        }
        
        // Helper method to find the permutations using
        // Depth first search and Backtracking
        findPerm(new ArrayList<>(), decisionTree);
        return combinations;
    }
    
    private void findPerm(List<Integer> perm, List<Integer> dt) {
        if(dt.size() == 0) {
            combinations.add(perm);
            return;
        }
        for(Integer num : dt) {
            // Declaring temporary List for backtracking
            List<Integer> tempPerm = new ArrayList<>(perm);
            List<Integer> tempDt = new ArrayList<>(dt);
            tempPerm.add(num);
            tempDt.remove(num);
            findPerm(tempPerm,tempDt);
            }
            
        
    }
}