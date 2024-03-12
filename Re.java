public class Re {
    public static void main(String arg[]){
        int N = 80801;
        while(N>0){
            int lastdigit = N%10;
            System.out.print(lastdigit);
            N = N/10;
        }
    }
}
