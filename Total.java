import java.util.Scanner;

public class Total {
    public static void main(String args[]){
        try (Scanner S = new Scanner(System.in)) {
            float pencil = S.nextFloat();
            float pen = S.nextFloat();
            float eraser = S.nextFloat();

            float total = pencil+pen+eraser;
            System.out.println("Total : "+total);
            
            float Newtotal = total + (0.18f * total);
            System.out.println("Newtotal : "+Newtotal);
        }
    }
}
