class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);      
        // Step 2: Create a priority queue (min-heap) to store the top K elements
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> frequencyMap.get(a) - frequencyMap.get(b));
        // Step 3: Iterate through the frequency map and maintain a heap of size k
        for (int key : frequencyMap.keySet()) {
            pq.offer(key); // Add the key to the heap
            if (pq.size() > k)  pq.poll();// If the heap grows larger than k, remove the smallest frequency element
                 // Remove the element with the smallest frequency
        }
       // Step 4: Extract the top K frequent elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++)  result[i] = pq.poll(); // Remove the elements from the heap
        return result;
    }
}
