import java.util.Scanner;

public class Sumdigits {
    public static int sumofdigits(int num){
        int sum=0;
        int rem=0;
        while(num>0){
           rem=num%10;
           sum+=rem;
           num/=10;
        }
        return sum;
    }
    public static void main(String[]args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(sumofdigits(n));
    }
}
