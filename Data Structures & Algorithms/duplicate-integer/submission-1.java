class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums==null || nums.length==0) return false;
        Set<Integer> unique=new HashSet<>();
        for(int i:nums) unique.add(i);
        if(unique.size()!=nums.length) return true;
        return false;
    }
}
