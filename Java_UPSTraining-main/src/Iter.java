import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
public class Iter {
    public static void main(String[]args){
        Stack<String> list =new Stack<>();
        list.push("suji");
        list.push("world");
        list.push("hi");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
