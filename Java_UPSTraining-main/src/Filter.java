import java.util.*;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(55);
        numbers.add(60);
        List<Integer> even = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());


        List<Integer> odd = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
