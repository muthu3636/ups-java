import java.util.HashMap;
import java.util.Map;

public class Hashitr {
    public static void main(String[]args){
//        HashMap<Integer,Integer>map=new HashMap<>();
//        map.put(0,24);
//        map.put(1,25);
//        map.put(2,55);
//        map.put(3,89);
//        for(Map.Entry<Integer,Integer>set : map.entrySet()){
//            System.out.println("Key : " + set.getKey() + " , " + "Value :" + set.getValue());
//        }



//        int arr[]={23,22,12,22,22,43,23,67,12,22,12};
//        HashMap<Integer,Integer>freq=new HashMap<>();
//        for(int n : arr){
//            if(freq.containsKey(n)){
//                freq.put(n,freq.get(n)+1);
//            }
//            else{
//                freq.put(n,1);
//            }
//        }
//        for(Map.Entry<Integer,Integer>set : freq.entrySet()){
//            System.out.println("Value : " + set.getKey() + " Frequency : " + set.getValue());
//        }

        HashMap<Integer,Integer>map1=new HashMap<>();
        map1.put(0,2);
        map1.put(1,4);
        map1.put(2,6);
        map1.put(3,8);
        HashMap<Integer,Integer>map2=new HashMap<>();
        map2.put(2,10);
        map2.put(5,12);
        map1.putAll(map2);
        for(Map.Entry<Integer,Integer>set : map1.entrySet()){
           System.out.println("Key : " + set.getKey() + " , " + "Value :" + set.getValue());
        }
    }
}
