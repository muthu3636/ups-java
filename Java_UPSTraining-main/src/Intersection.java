import java.util.ArrayList;

public class Intersection {
    public static void main(String[]args){
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(2);
        l2.add(9);
        for(int n: l1){
            if(l2.contains(n)){
                System.out.print(n);
            }
        }
    }
}
