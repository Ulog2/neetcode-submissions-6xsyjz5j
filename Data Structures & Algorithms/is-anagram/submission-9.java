public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> hm=new HashMap<>();
        if(s.length()!=t.length()) return false;//imp
        for(char c:s.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);
        for(char c:t.toCharArray()){
            if(!hm.containsKey(c) || hm.get(c)==0) return false;//get(c) can become 0 as its being decrease when found
            hm.put(c,hm.getOrDefault(c,0)-1);
        }
        return true;
    }//tc O(N) sc O(N)
}