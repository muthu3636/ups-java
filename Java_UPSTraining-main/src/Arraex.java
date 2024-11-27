
import java.util.Arrays;
import java.util.List;

public class Arraex {
    public static void intersection(List<Integer>l1,List<Integer>l2){
        for(int num:l1){
            if (l2.contains(num)) {
               System.out.print(num +" ");

            }
        }
    }
    public static void main(String[]args){
        List<Integer>l1= Arrays.asList(1,2,2,3);
        List<Integer> l2=Arrays.asList(2,2,3);
       intersection(l1,l2);
    }
}
