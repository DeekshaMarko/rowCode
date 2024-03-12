import java.util.*;

public class Elseif {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int a = S.nextInt();
            if(a>=18){
            System.out.println("You are adult");
            }
            else if(a>=13 && a<18){
                System.out.println("You are teenager");
            }
            else{
                System.out.println("You are child");
            }
        }

    }
}
