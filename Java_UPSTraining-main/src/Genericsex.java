import java.util.*;
public class Genericsex {
    public static <T> boolean checkarr(T arr1[],T arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0;i< arr1.length;i++){
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        Integer arr1[] = new Integer[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        Integer arr2[] = new Integer[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean res = checkarr(arr1, arr2);
        if(res==true){
            System.out.println("Elements in the array are equal and in same order");
        }
        else{
            System.out.println("Elements in the array are not equal and not in same order");
        }
    }
}
