import java.util.Scanner;
public class me {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int num = S.nextInt();
            switch(num){
                case 1 :System.out.println("Samosa");
                break;
                case 2 :System.out.println("Burger");
                break;
                case 3 :System.out.println("Mango Shake");
                break;
                default:System.out.println("We wake up");
            }
        }
    }

}
