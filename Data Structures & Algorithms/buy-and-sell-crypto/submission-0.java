class Solution {
    public int maxProfit(int[] prices) {
       if(prices.length==0 || prices==null) return 0;
       int minP=Integer.MAX_VALUE,maxProf=0,end=0;
       for(int i=0;i<prices.length;i++){
        if(minP>prices[i]) minP=prices[i];
        else maxProf=Math.max(maxProf,prices[i]-minP);

       }
       return maxProf; 
    }
}
