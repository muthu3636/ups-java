import java.util.Scanner;

public class Mergetwoarrays {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[n1+n2];
        int ind=0;
        for(int n :arr1){
           arr3[ind++]=n;

        }

        for(int n:arr2){
            arr3[ind++]=n;

        }
        for(int i=0;i<arr3.length-1;i++){
            for(int j=0;j<arr3.length-i-1;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp=arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1]=temp;
                }
            }
        }
        for(int n : arr3){
            System.out.print(n+" ");
        }

    }
}
