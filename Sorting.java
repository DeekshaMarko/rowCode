// import java.util.Arrays;
// import java.util.Collections;
public class Sorting {
    // Bubble Sort
    public static void Bubble_Sort(int Num[]){
        for(int i=0;i<Num.length-1;i++){
            int swap=0;
            for(int j=0;j<Num.length-1-i;j++){
                if(Num[j]>Num[j+1]){
                    int temp=Num[j];
                    Num[j]=Num[j+1];
                    Num[j+1]=temp;
                    swap++;
                }
                System.out.print(swap);
            }
            System.out.println();
        }

    }
    


    // Selection Sort
    public static void Selection_Sort(int Num[]){
        for(int i=0;i<Num.length-1;i++){
            int Smallest=i;
            for(int j=i+1;j<Num.length;j++){
                if(Num[Smallest]>Num[j]){
                    Smallest=j;
                }
            }
            int temp=Num[Smallest];
            Num[Smallest]=Num[i];
            Num[i]=temp;


        }
    }


    // Insertion Sort

    public static void Insertion_Sort(Integer Num[]){
        for(int i=1;i<Num.length;i++){
            int Curr =Num[i];
            int Prev=i-1;
            // finding position
            while(Prev>=0 && Num[Prev]>Curr){
                Num[Prev+1]=Num[Prev];
                Prev--;
            }
            Num[Prev+1]=Curr;
        }
    }



    // USING INBUILT METHOD
    
    

    // public static void Print_Num(Integer Num[]){
    //     for(int i=0;i<Num.length;i++){
    //         System.out.print(+Num[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String arg[]){
    //     Integer Num[]={5,4,1,3,2};
    //     // Bubble_Sort(Num);
    //     // Selection_Sort(Num);
    //     // Insertion_Sort(Num);
    //     Arrays.sort(Num,0,5);
    //     System.out.println();

    //     // Arrays.sort(Num,Collections.reverseOrder(null));

    //     // Arrays.sort(Num,0,4,Collections.reverseOrder(null));

    //     Print_Num(Num);

    
    // Counting Sort

    public static void Counting_Sort(int Num[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<Num.length;i++){
            Largest=Math.max(Largest, Num[i]);
        }
        int Count[]=new int[Largest+1];
        for(int i=0;i<Num.length;i++){
            Count[Num[i]]++;
        }
        int j=0;
        for(int i=0;i<Count.length;i++){
            while(Count[i]>0){
                Num[j]=i;
                j++;
                Count[i]--;
            }
        }
    }

    public static void Print_Num(int Num[]){
        for(int i=0;i<Num.length;i++){
            System.out.print(+Num[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int Num[]={1,4,1,3,2,4,3,7};
        // Bubble_Sort(Num);
        Counting_Sort(Num);
        Print_Num(Num);

    }
}
