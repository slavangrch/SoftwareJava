//0222
//Визначити клас автомобіль, який складається як мінімум з 5-и полів.

import java.util.Arrays;

public class Lab4 {

    public static void main(String[] args) {
        Car[] obj = new Car[3];

        obj[0] = new Car("Toyota", "RAV-4", 4, 280, "Japan");
        obj[1] = new Car("Reno", "Duster", 4, 200, "France");
        obj[2] = new Car("Tesla", "Energy", 2, 310, "USA");

        System.out.println("Sorted by name:");
        Arrays.sort(obj, new Car.SortName());
        System.out.println(Arrays.asList(obj)+ "\n");

        System.out.println("Sorted by amount of seats:");
        Arrays.sort(obj, Car.aosComparator);
        System.out.println(Arrays.asList(obj)+ "\n");

        System.out.println("Sorted by max speed:");
        Arrays.sort(obj, Car.maxSpeedComparator);
        System.out.println(Arrays.asList(obj));
    }
}
