import java.util.Scanner;

public class Subarr {
    public static int smallsub_arr(int[]arr,int x){
        int n=arr.length;
        int min_len=Integer.MAX_VALUE;
        int sum=0,j=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>=x){
                min_len=Math.min(min_len,i-j+1);
                sum-=arr[j++];
            }
        }
        return min_len==Integer.MAX_VALUE ? 0 :min_len;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,1,2,4,3};
        int x=7;
        int res=smallsub_arr(arr,x);
        System.out.println(res);
    }
}

