import java.util.Scanner;
public class binocoeff {
    public static int numbin(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bincoef(int n,int r){
        int fact_n = numbin(n);
        int fact_r = numbin(r);
        int nmr = numbin(n-r);

        int bif = fact_n/(fact_r*nmr);
        return bif;
    }
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int n = S.nextInt();
            int r = S.nextInt();
            System.out.println(bincoef(n,r));
        }

    }
}
