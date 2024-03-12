public class ReArr {
    public static void Rev_Arr(int num[]){
        int start=0; int last=num.length-1;
        while(start<last){
            int temp=num[last];
            num[last]=num[start];
            num[start]= temp;

            start++;
            last--;
        }
    }
    public static void main(String arg[]){
        int num[]={2,4,6,8,10};
        Rev_Arr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
