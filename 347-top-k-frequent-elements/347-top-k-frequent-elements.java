class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        // Save each number in a map
        for(int num: nums) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        Queue<Integer> minHeap = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        
        for(int num: map.keySet()) {
            minHeap.add(num);
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        int[] res = new int[minHeap.size()];
        int index =0;
        while(minHeap.isEmpty() == false) {
            res[index++] = minHeap.poll();
            
        }
        
        return res;
        
    }
}