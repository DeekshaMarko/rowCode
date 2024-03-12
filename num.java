import java.util.Scanner;
public class num {
    public static void main(String arg[]){
        try (Scanner N = new Scanner(System.in)) {
            int n = N.nextInt();
            int a = 1;
            while(a<n){
                System.out.println(a +" ");
                a++;
            }
        }
        System.out.println();
    }
}
