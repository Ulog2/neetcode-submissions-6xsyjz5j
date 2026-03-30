class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){

            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);
            if (!hm.containsKey(sortedString)) hm.put(sortedString,new ArrayList<>());
            hm.get(sortedString).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
