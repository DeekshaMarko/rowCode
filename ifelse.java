import java.util.Scanner;

public class ifelse {
    public static void main(String arg[]){
        try (Scanner sc = new Scanner(System.in)) {
            int Age = sc.nextInt();
            if(Age>=18){
                System.out.println("You are adult");
            }
            else{
                System.out.println("You are not adult");
            }
        }


    } 
}
