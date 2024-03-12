public class ArrUpdate {
    public static void ArrayUp(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String arg[]){
        int marks[]={97,98,99};
        ArrayUp(marks);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
