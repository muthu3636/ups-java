import java.util.*;
public class Stringex {

        public static void main(String[]args){
            StringBuilder sb=new StringBuilder("suji");
            Scanner sc =new Scanner(System.in);
            String str=sc.next();
            int len=str.length();
            System.out.println(len);
           System.out.println( sb.indexOf(str));
            System.out.println(sb.append("world"));
            System.out.println(sb.charAt(3));
            System.out.println(str.equals("suji"));
            System.out.println(str.toLowerCase());
            System.out.println(str.toUpperCase());
        }
    }

