import java.util.Comparator;
import java.lang.String;

public class Car {
    private String name;
    private String model;
    private int amountOfSeats;
    private int maxSpeed;
    private String origin;

    public String GetName() { return name; }

    public String GetType() {
        return model;
    }

    public int GetAos() {
        return amountOfSeats;
    }

    public int GetMaxS() {
        return maxSpeed;
    }

    public String GetOrigin() {
        return origin;
    }

    public Car(String name, String model, int aos, int maxspeeed, String origin) {
        this.name = name;
        this.model = model;
        this.amountOfSeats = aos;
        this.maxSpeed = maxspeeed;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[name = " + this.name + " model = " + this.model + " amount of seats = " + this.amountOfSeats + " max speed = " +
                this.maxSpeed + " origin = " + this.origin + "]";
    }

    static class SortName implements Comparator<Car> {
        @Override
        public int compare(Car s1, Car s2) {
            int result = s1.name.compareToIgnoreCase(s2.name);
            if (result == 0) {
                return s1.name.compareToIgnoreCase(s2.name);
            }
            return result;
        }
    }
    public static Comparator<Car> aosComparator = (e1, e2) -> (e2.GetAos() - e1.GetAos());

    public static Comparator<Car> maxSpeedComparator = (e1, e2) -> (e1.GetMaxS() - e2.GetMaxS());
}
