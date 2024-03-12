import java.util.Scanner;
public class Cal {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            System.out.println("Enter a : ");
            int a = S.nextInt();
            System.out.println("Enter b : ");
            int b = S.nextInt();
            System.out.println("Enter operator : ");
            char operator = S.next().charAt(0);
            switch(operator){
                case '+' : System.out.println(a+b);
                break;
                case '-' : System.out.println(a-b);
                break;
                case '*' : System.out.println(a*b);
                break;
                case '/' : System.out.println(a/b);
                break;
                case '%' : System.out.println(a%b);
                break;
                default:System.out.println("Wrong operator");
            }
        }
    }
}
