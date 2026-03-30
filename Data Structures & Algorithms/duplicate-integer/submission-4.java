class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean res=false;
        Set<Integer> hs=new HashSet<>();
        for(int i:nums)
            {
                if (!hs.add(i)) return true;
            }
        return res;
    }
}