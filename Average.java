import java.util.*;

public class Average {
    public static void main(String args[]){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            int b = S.nextInt();
            int c = S.nextInt();
            int sum = a+b+c;
            int average = sum/3;
            System.out.println(average);
        }

    }
}
