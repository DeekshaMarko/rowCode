public class kadanes {
    public static void Max_sum(int num[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);

    }
    public static void main(String arg[]){
        int num[]={-2,-3,4,-2,5,-2};
        Max_sum(num);
    }
}
