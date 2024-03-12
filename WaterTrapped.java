public class WaterTrapped {
    public static int Water_Trap(int Height[]){
        int LeftMax[]=new int[Height.length];
        LeftMax[0]=Height[0];
        for(int i=1;i<Height.length;i++){
            LeftMax[i]=Math.max(Height[i], LeftMax[i-1]);
        }
        int RightMax[]=new int[Height.length];
        RightMax[Height.length-1]=Height[Height.length-1];
        for(int i=Height.length-2;i>=0;i--){
            RightMax[i]=Math.max(Height[i], RightMax[i+1]);

        }
        int trapped_water =0;
        for(int i=0;i<Height.length;i++){
            int Water_Level=Math.min(LeftMax[i],RightMax[i]);
            trapped_water += Water_Level-Height[i];
        }
        return trapped_water;

    }
    public static void main(String arg[]){
        int Height[]={4,2,0,6,3,2,5};
        System.out.println(Water_Trap(Height));
    }
}
