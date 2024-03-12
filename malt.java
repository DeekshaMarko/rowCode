import java.util.Scanner;
public class malt {
    public static int nummalt(int a ,int b){
        int p = a*b;
        return p;
    }

    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            int b = S.nextInt();
            int prod = nummalt(a,b);
            System.out.println(prod);
        }
    }
}
