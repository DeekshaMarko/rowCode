// public class PrimeRange {
    import java.util.Scanner;
    public class PrimeRange {
        public static boolean isPrime(int n){
            boolean isPrime =true;
            for(int i = 2;i<=n-1;i++){
                if(n%i==0){
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
        }
    public static void rangeprime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    } 
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int n=S.nextInt();
            rangeprime(n);
        }

    }
}
