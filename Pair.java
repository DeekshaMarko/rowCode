public class Pair {
    public static void Pair_Arr(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        int num[]={2,4,6,8,10};
        Pair_Arr(num);

    }
}
