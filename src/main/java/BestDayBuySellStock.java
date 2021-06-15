public class BestDayBuySellStock {
    public int maxProfit(int[] prices) {
        int temp = 0;
        for (int i=0; i<prices.length; i++){
            for (int j = i+1 ; j<prices.length; j++){
                if (prices[j] - prices[i] > temp){
                    temp = prices[j] - prices[i];
                }
            }
        }
        return temp;
    }
    public static void main (String[] args){
    int[] stockValues = {7,1,5,3,6,10};
    BestDayBuySellStock bestDayBuySellStock = new BestDayBuySellStock();
    System.out.println(bestDayBuySellStock.maxProfit(stockValues));


    }

}
