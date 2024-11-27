import java.util.*;
public class Control {
public  String mincoin(int amnt,int[]denominations){
    int arr[]=new int[amnt+1];
    Arrays.fill(arr,amnt+1);
    arr[0]=0;
    for(int coin:denominations){
        for(int i=coin;i<=amnt;i++){
            arr[i]=Math.min(arr[i],arr[i-coin]+1);
        }
    }
    return arr[amnt]>amnt ? "NOT POSSIBLE" :String.valueOf(arr[amnt]);
}
}
