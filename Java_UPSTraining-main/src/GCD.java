import java.util.Scanner;

public class GCD {
    public static int findgcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return findgcd(num2,num1%num2);
    }
    public static void main (String[]args)
    {
        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.print(findgcd(n1,n2));
    }
}
