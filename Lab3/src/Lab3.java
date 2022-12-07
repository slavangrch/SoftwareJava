//0222
//Вивести всі речення заданого тексту в порядку зростання кількості слів у них.
//StringBuilder

import java.util.ArrayList;
import java.util.List;

public class Lab3 implements Comparable<Lab3> {
    private String text;
    private int words;
    public static final String sentenceEnds = ".!?";

    public Lab3(String t) {
        text = t;
        words = t.replaceAll("\\p{Punct}", " ").trim().split("\\s+").length;;
        System.out.println(words);
    }

    public String toString() {
        return text;
    }

    public int compareTo(Lab3 another) {
        return another.words - words;
    }

    public static Lab3[] toSentencesArray(String input) {
        StringBuilder buf = new StringBuilder();
        List<Lab3> list = new ArrayList<Lab3>();

        for (char c : input.toCharArray() ) {
            buf.append(c);
            if (sentenceEnds.indexOf(c) > -1 ) {
                list.add(new Lab3(buf.toString().trim()));
                buf = new StringBuilder();
            }
        }

        return list.toArray(new Lab3[list.size()]);
    }
}

