import java.util.Scanner;
public class ternary {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            String C = ((a%2)==0)?"Even":"Odd";
            System.out.println(C);
        } 

    }
}
