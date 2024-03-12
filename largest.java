import java.util.Scanner;
public class largest {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            int b = S.nextInt();
            int c = S.nextInt();
            if(a>=b && a>=c){
                System.out.println(a);

            }
            else if(b>=a && b>=c){
                System.out.println(b);

            }
            else{
                System.out.println(c);
            }
        }
    }
    
}
