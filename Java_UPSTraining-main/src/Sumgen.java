import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Sumgen {
    public static <T extends Number> int sumofnum(List<T>l,Predicate<T>cond){
        return l.stream().filter(cond).mapToInt(Number::intValue).sum();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            l.add(ele);
        }
        Predicate<Integer>even = num -> num%2==0;
        Predicate<Integer>odd = num -> num%2!=0;
        int evensum=sumofnum(l,even);
        int oddsum=sumofnum(l,odd);
        System.out.println("Sum of even numbers : " + evensum);
        System.out.println("Sum of odd numbers :" + oddsum);
    }
}
