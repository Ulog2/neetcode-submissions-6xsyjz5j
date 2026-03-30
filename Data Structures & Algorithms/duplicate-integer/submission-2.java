class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null || nums.length==0) return false;
        Set<Integer> unique=new HashSet<>();
        for(int i:nums){ if(!unique.add(i)) return true;}   
        return (unique.size()!=nums.length);
        //TC  O(n) SC O(n)
    }
}
