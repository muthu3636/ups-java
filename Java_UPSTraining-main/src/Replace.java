import java.util.*;
public class Replace {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ind=sc.nextInt();
        int num=sc.nextInt();
        if(ind>0 && ind<n){
            arr[ind]=num;
        }
        for(int no : arr){
            System.out.print(no +" ");
        }
    }
}
