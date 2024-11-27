import java.util.Stack;

public class countstack {
    public static void main(String[]args){
        Stack<Integer>stack=new Stack<>();
        stack.push(30);
        stack.push(60);
        stack.push(90);
        stack.push(50);
        int total=stack.size();
        System.out.println("Total elements in stack: "+total);
    }
}
