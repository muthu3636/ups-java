import java.util.*;
public class Missing {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int res=(n*(n+1))/2;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(res-sum);

    }
}
