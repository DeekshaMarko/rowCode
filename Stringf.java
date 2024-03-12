// import java.util.Scanner;

public class Stringf {
    public static boolean Letters(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                   return false;
            }
        }
        return true;
    }

    public static float shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }else{
                x++;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float)Math.sqrt(X+Y);
    }
    public static String substring(String str,int si,int ei){
        String subStr ="";
        for(int i=si;i<ei;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String arg[]){
        StringBuilder SC= new StringBuilder("");
        for(char i='a';i<'z';i++){
            SC.append(i);
        }
        System.out.println(SC);
        // String fruits[]={"apple","mango","bnana"};
        // String largest=fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest =fruits[i];
        //     }
        // }
        // System.out.println(largest);
    














        // System.out.println(substring(str, 2, 5));
        // System.out.println(shortestPath(str))
        //  System.out.println(Letters(str));
        // String str="abcd";
        // String str2=new String("xyz");
        // System.out.println(str);
        // System.out.println(str2);

        // // Strings are immutable

        // try (Scanner sc = new Scanner(System.in)) {
        //     // String name;
        //     String my;
        //     // name=sc.next();
        //     // System.out.println(name);
        //     my=sc.nextLine();
        //     System.out.println(my);

        // }
        // String FullName ="Deeksha Marko";
        // System.out.println(FullName.length());

        // String first ="Deeksha";
        // String Second="Marko";
        // String FullName=first+" "+Second;
        // System.out.println(FullName.charAt(4));
        // Letters(FullName);
    }
}
