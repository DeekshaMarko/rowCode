import java.util.*;

public class Square {
    public static void main(String args[]){
        try (Scanner s = new Scanner(System.in)) {
            float r = s.nextFloat();
            float area = r*r;
            System.out.println(area);
        }

    }
}
