import java.util.Scanner;
public class check {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int marks = S.nextInt();
            String C =(marks>=33)?"Pass":"Fail";
            System.out.println(C);
        }
    }
    
}
