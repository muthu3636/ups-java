import java.util.Scanner;

public class Ternary {
    public static int ternarysearch(int arr[],int left,int right,int target){
        while(left<=right) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;
            if (arr[mid1] == target) {
                return mid1;
            }
            if (arr[mid2] == target) {
                return mid2;
            }
            if (target < arr[mid1]) {
                right = mid1 - 1;
            } else if (target > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }
        return -1;
    }
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int target=sc.nextInt();
        int pos=ternarysearch(arr,0,n-1,target);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at:"+pos);
        }

    }
}
