class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        combine(candidates,0,target,new ArrayList(),result);
        return result;
        }
    
    public void combine(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result ) {
        if(target < 0) {
            return;
        }
        
        if(target == 0) {
            result.add(new ArrayList<>(list));
        }
        
        for(int i = start ; i < candidates.length ; i++) {
            list.add(candidates[i]);
            combine(candidates, i , target - candidates[i], list, result);
            list.remove(list.size() - 1);
        }
        
    }
        
    }
