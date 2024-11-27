//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          System.out.println("Sorted elements");
          for(int i=0;i<n-1;i++){
              for(int j=0;j<n-i-1;j++){
                  if(arr[j]>arr[j+1]) {
                      int temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }
          }
          for(int val:arr){
              System.out.print(val+" ");
          }


    }
}