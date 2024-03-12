import java.util.Scanner;
public class fact {
    public static int numfact(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int n = S.nextInt();
            
            System.out.println(numfact(n));
        }    

    }
}
