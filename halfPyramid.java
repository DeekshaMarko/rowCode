import java.util.Scanner;

public class halfPyramid {
    public static void Half_Pyramid(int n){
        for(int i=1;i<n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print("*");

            } 
        System.out.println();   
        }
    } 
    public static void main(String arg[]){
       try (Scanner S = new Scanner(System.in)) {
        int n =S.nextInt();  
        Half_Pyramid(n);
    }
    
}
    
}
