class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> result = new PriorityQueue<>(k+1);
        
        for(int num: nums) {
            result.add(num);
            if(result.size() > k) {
                result.poll();
            }
        }
        
        return result.poll();
    }
}