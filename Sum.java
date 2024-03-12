import java.util.*;

public class Sum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // sum of two num
            int sum = a+b;
            System.out.println(sum);

            // product of two num
            int multi = a*b;
            System.out.println(multi);
        }

    }
}
