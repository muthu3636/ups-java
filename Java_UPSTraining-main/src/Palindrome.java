import java.util.Scanner;

public class Palindrome {
    public static boolean checkpal(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(checkpal(str));
    }
}
