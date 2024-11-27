import java.util.*;
import java.util.stream.Collectors;

public class Streamex {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        List<Integer> squarenum = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());


        System.out.println(squarenum);
    }
}
