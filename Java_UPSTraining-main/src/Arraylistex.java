import java.util.ArrayList;

public class Arraylistex {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(20);
        list.add(45);
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i));
//        }
//        System.out.println(list.indexOf(9));
//        System.out.println(list.remove(3));
        System.out.print(list);
    }
}
