import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int maxlen=0;
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                s.push(i);
            }
            else{
                s.pop();
                if(s.isEmpty()){
                    s.push(i);
                }
                else{
                    maxlen=Math.max(maxlen,i-s.peek());
                }
            }
        }
        System.out.println("Longest length of substring:"+maxlen);
    }
}
