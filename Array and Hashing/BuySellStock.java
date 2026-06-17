public class BuySellStock {
    public int maxProfit(int[] prices) {
     int maxpro=0,min=prices[0];
      for(int i=1;i<prices.length;i++){
        if(prices[i]>min)maxpro=Math.max(maxpro,prices[i]-min);
        else min=prices[i];
      }
        return maxpro;
    }
}
