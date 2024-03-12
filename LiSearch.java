import java.util.Scanner;
public class LiSearch {
    public static int LinearSearch(int Number[], int key){

        for(int i =0;i<Number.length;i++){
            if(Number[i]==key){
                return i;
            }
        }
        
        return -1; 
    }
    public static void main(String arg[]){
        int Number[]={1,3,5,7,9,11,13,15,17};
        try (Scanner S = new Scanner(System.in)) {
            int key = S.nextInt();
            int index=LinearSearch(Number, key);
            if(index==-1){
                System.out.print("Not found");
            }
            else{
                System.out.print("Key is at index: "+index);
            }
        }
        
    }
}
