// import java.util.*;
public class GetLargest {
    public static int GetLarge(int Number[]){
        int Largest= Integer.MIN_VALUE;
        int Smallest= Integer.MAX_VALUE;

        for(int i=0;i<Number.length;i++){
            if(Largest<Number[i]){
                Largest=Number[i];
            }
            if(Smallest>Number[i]){
                Smallest=Number[i];
            }
        // return Largest;
        }
        // for(int i=0;i<Number.length;i++){
        //     if(Smallest>Number[i]){
        //         Smallest=Number[i];
        //     }
        // // return Largest;
        // }
        System.out.println("Smallest number is : "+Smallest);
        return Largest;
    }
    public static void main(String arg[]){
        int Number[]={1,3,6,4,7,5,9};
        System.out.println("Largest number is : "+GetLarge(Number));
    }
}
