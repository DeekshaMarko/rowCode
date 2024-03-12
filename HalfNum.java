public class HalfNum {
    public static void Half_Num_Pyramid(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int n =5;
        Half_Num_Pyramid(n); 
    }
}
