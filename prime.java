import java.util.Scanner;
public class prime {
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
    public static void main(String arg[]){
           try (Scanner S = new Scanner(System.in)) {
            int n = S.nextInt();
               System.out.println(isPrime(n));
        }
    }
    
}
