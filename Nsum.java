import java.util.Scanner;
public class Nsum {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int a = 1;
            int sum =0;
            while(a<=N){
                sum = sum+a;
                a++;
            }
            System.out.print(sum);
        }
    }
}
