class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> freq=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);
            if(!freq.containsKey(sortedString)) 
                freq.put(sortedString,new ArrayList<>());
            freq.get(sortedString).add(s);
        }
        return new ArrayList<>(freq.values());
    }
}
