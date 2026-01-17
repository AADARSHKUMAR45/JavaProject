public class BuySellStock {
    static int profit(int price[]){
        int BuyPrice=Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<price.length;i++){
            if(BuyPrice<price[i]){
                int profit=price[i]-BuyPrice;
                MaxProfit=Math.max(profit,MaxProfit);
            }
            else {
                BuyPrice=price[i];
            }
        }
       return MaxProfit;
    }
    public static void main(String[] args){
        int price[]={7,1,5,3,6,4};
        System.out.println(profit(price));
    }
}