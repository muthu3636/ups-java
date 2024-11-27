import java.util.Scanner;
import java.util.Stack;

public class Balancedparanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    System.out.println(false);
                    return;

                }
                System.out.print(stack.isEmpty());
            }

        }
    }
}
