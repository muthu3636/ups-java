import java.util.*;
import java.util.stream.Collectors;

public class Freqstream {
    public static String freqword(List<String> sentences) {
        return sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+")))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    public static void main(String[] args) {
        List<String> sentences = List.of("Hello world", "World of Java", "Hello Java world");
        System.out.println(freqword(sentences));
    }
}
