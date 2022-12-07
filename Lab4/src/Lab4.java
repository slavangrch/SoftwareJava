//0222
//Визначити клас автомобіль, який складається як мінімум з 5-и полів.

import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        Car[] obj = new Car[3];

        obj[0] = new Car("Mazda", "Petrol", 6, 200, "Japan");
        obj[1] = new Car("Ferrari", "Petrol", 4, 300, "Italy");
        obj[2] = new Car("Tesla", "Electric", 8, 280, "USA");

        System.out.println("Sorted by name:");
        Arrays.sort(obj, new Car.SortName());
        System.out.println(Arrays.asList(obj)+ "\n");

        System.out.println("Sorted by quantity of air bags:");
        Arrays.sort(obj, Car.quantityOfAirBagsComparator);
        System.out.println(Arrays.asList(obj)+ "\n");

        System.out.println("Sorted by max speed:");
        Arrays.sort(obj, Car.maxSpeedComparator);
        System.out.println(Arrays.asList(obj));
    }
}
