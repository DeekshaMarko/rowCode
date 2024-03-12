public class BitMan{
    public static void OddEven(int n){
        int bitmarks =1;
        if((n&bitmarks)==0){
             System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static int getIth(int n,int i){
        int bitmarks=1<<i;
        if((n&bitmarks)==0){
            return 0;
       }
       else{
           return 1;
       }
    }

    public static int SetIth(int n,int i){
        int bitmarks=1<<i;
        return n|bitmarks;
    }

    public static int ClearIth(int n, int i){
        int bitmarks=(~(1<<i));
        return n&bitmarks;
    }
    public static void main(String arg[]){

        System.out.println(ClearIth(10, 1));

        // System.out.println(SetIth(10, 2));

        // System.out.println(getIth(8, 3));
        // OddEven(3);
        // OddEven(4);
        // OddEven(5);
        // OddEven(6);

    }
}