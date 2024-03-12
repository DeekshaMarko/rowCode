import java.util.Scanner;
public class tax {
    public static void main(String arg[]){
        try (Scanner S = new Scanner(System.in)) {
            int Salary = S.nextInt();
            int tax = 0;
            if(Salary<500000){
                tax = 0;
            }
            else if(Salary>=500000 && Salary<1000000) {
                tax = (int)(Salary*0.2);
            }
            else{
                tax = (int)(Salary*0.3);
            }
            System.out.println("Your tax is :"+tax);
        }
    }
    
}
