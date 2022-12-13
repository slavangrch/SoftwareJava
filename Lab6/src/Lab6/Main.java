package Lab6;

public class Main {
    public static void main(String[] args) {

        Lollipop lollipop = new Lollipop( "lollipop",12.5, 0.75, 2.35, 0);
        Bar bar = new Bar("bar",18.90, 7.8, 3.1, 65);
        Cookie cookie = new Cookie("cookie", 8.0, 2.9, 2.0, 30);
        ChocolateBunny bunny = new ChocolateBunny("bunny",22.50, 10.8, 4.6, 100);

        Sweets[] sweets = new Sweets[]{ lollipop, bar, cookie, bunny};
        SweetPresent present = new SweetPresent(sweets);

        System.out.println(present);
        present.sortByPrice();
        System.out.println();
        System.out.println(present);
        int index = present.findByChocolateContent(50,70);
        Sweets candy = present.get(index);
        System.out.println();
        System.out.println(candy);

        double totalWeight = present.getTotalWeight();
        System.out.println("Present total weight: " + totalWeight);

    }
}
