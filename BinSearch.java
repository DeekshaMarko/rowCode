public class BinSearch {
    public static int Getnum(int num[],int key){
        int start=0;
        int temp=num.length-1;
        while(start<=temp){
            int mid=(start+temp)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                temp=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int num[]={2,3,4,5,6,7,8};
        int key=4;
        int fo =Getnum(num,key);
        System.out.println("Index of Value in num is :");
        System.out.println(fo);
    }
}
