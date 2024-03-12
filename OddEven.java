import java.util.Scanner;

public class OddEven {
    public static void main(String agr[]){
        try (Scanner S = new Scanner(System.in)) {
            int A = S.nextInt();
            // int B = S.nextInt();
            if(A%2==0){
                System.out.println("Number is even");
  
            }
            else{
                System.out.println("Number is odd");
            }
        }

    }
}
