public class TraapedWater {
    static int TrapWater(int height[]){
        int n=height.length;
        int LeftMax[]= new int[n];
        LeftMax[0]=height[0];
        for(int i=1;i<n;i++){
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);
        }
        int RightMax[]=new int[n];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }
        int WaterTraped=0;
        for(int i=0;i<n;i++){
           int WaterLevel=Math.min(LeftMax[i],RightMax[i]);
           WaterTraped+=WaterLevel-height[i];
        }
        return WaterTraped;

    }
    public static void main(String[] args){
        int height[]={3,2,0,4,5,4,3,0,4};
        System.out.println(TrapWater(height));
    }
}
