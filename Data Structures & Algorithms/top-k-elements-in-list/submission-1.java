class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res =new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums) hm.put(i,hm.getOrDefault(i,0)+1);
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap=new PriorityQueue<>(
            (a,b)->a.getValue()-b.getValue()
            );
            for(Map.Entry<Integer,Integer> key:hm.entrySet()){
                minHeap.add(key);
                if(minHeap.size()>k) minHeap.poll();
            }    
        for(int i=0;i<k;i++) res[i]=minHeap.poll().getKey();
        return res;
    }
}
