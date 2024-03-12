import java.util.Scanner;
public class ArrayCC {
    public static void main(String arg[]){
        int Arr[]=new int[10];
        try (Scanner S = new Scanner(System.in)) {
            Arr[0]=S.nextInt();
            Arr[1]=S.nextInt();
            Arr[2]=S.nextInt();
        }
        System.out.println(Arr[0]);
    }
}
