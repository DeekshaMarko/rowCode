public class tiling{
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }

        int verticaltiles = tilingProblem(n-1);


        int horitiles = tilingProblem(n-2);

        int totalWays = verticaltiles + horitiles;

        return totalWays;
    }
    public static void main(String[] args){
         System.out.println(tilingProblem(1));
         System.out.println(tilingProblem(2));
         System.out.println(tilingProblem(3));
         System.out.println(tilingProblem(4));

    }
}