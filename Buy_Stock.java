public class Buy_Stock {
    public static int Stock(int Price[]){
        int Buy_Price=Integer.MAX_VALUE;
        int Max_Profit=0;
        for(int i=0;i<Price.length;i++){
            if(Buy_Price<Price[i]){
                int Profit=Price[i]-Buy_Price;
                Max_Profit=Math.max(Max_Profit, Profit);
            }
            else{
                Buy_Price=Price[i];
            }
        }
        return Max_Profit;
    }
    public static void main(String arg[]){
        int Price[]={7,1,5,3,6,4};
        System.out.println(Stock(Price));
    }
}
