import java.util.Comparator;
import java.lang.String;

public class Car {
    private String name;
    private String typeOfEngine;
    private int quantityOfAirBags;
    private int maxSpeed;
    private String origin;

    public String getName() {
        return name;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public int getQuantityOfAirBags() {
        return quantityOfAirBags;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getOrigin() {
        return origin;
    }

    public Car(String name, String typeofengine, int quantityofairbags, int maxspeeed, String origin) {
        this.name = name;
        this.typeOfEngine = typeofengine;
        this.quantityOfAirBags = quantityofairbags;
        this.maxSpeed = maxspeeed;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "[name = " + this.name + " type of engine = " + this.typeOfEngine + " quantity of air bags = " + this.quantityOfAirBags + " max speed = " +
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
    public static Comparator<Car> quantityOfAirBagsComparator = (e1, e2) -> (e2.getQuantityOfAirBags() - e1.getQuantityOfAirBags());

    public static Comparator<Car> maxSpeedComparator = (e1, e2) -> (e1.getMaxSpeed() - e2.getMaxSpeed());
}
