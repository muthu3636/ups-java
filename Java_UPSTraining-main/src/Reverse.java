import java.awt.*;
import java.util.Scanner;

public class Reverse {
    public static void main(String[]args){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.print(rev);
    }
}
