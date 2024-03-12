public class SubArr {
    public static void Sub_Arr(int num[]){
        int curr_sum=0;
        int Max_Sum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int last=j;
                for(int k=start;k<=last;k++){
                    curr_sum+=num[k];
                    System.out.print(num[k]+" ");
                }
                System.out.print("----->"+curr_sum);
                if(Max_Sum<curr_sum){
                    Max_Sum=curr_sum;
                    
                }   
                curr_sum=0;
            System.out.println();

            }
                System.out.println();
            }
            
            System.out.println("Max_Sum of Sub_Arr is : "+Max_Sum);
            
        }

    
    public static void main(String arg[]){
        int num[]={2,4,6,8,10};
        Sub_Arr(num);

    }
}
