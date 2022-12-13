package Lab6;

import java.util.Comparator;

public class SortByPrice implements Comparator<Sweets> {
    SortByPrice() {
    }

    @Override
    public int compare(Sweets a, Sweets b) {
        return Double.compare(a.getPrice(), b.getPrice());
    }
}