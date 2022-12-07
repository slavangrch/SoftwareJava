import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Lomrem impsum vroo    rooos! Dorlor, stit tamet. Cornserctertuer agdipiscing we qwe qwe qwe .";

        System.out.println("Unsorted:\n" + text);

        Lab3[] sentences = Lab3.toSentencesArray(text);
        Arrays.sort(sentences);
        System.out.println("Sorted:");
        for (Lab3 s : sentences)
            System.out.println(s);
    }
}
