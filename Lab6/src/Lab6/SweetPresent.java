package Lab6;

import java.util.Arrays;


public class SweetPresent {
    private Sweets[] candies;
    private double totalWeight;

    public SweetPresent(Sweets[] candies) {
        this.candies = candies;
        this.totalWeight = countTotalWeightOf(candies);
    }

    private double countTotalWeightOf(Sweets[] candies) {
        double sum = 0.0;
        for(Sweets candy: candies){
            sum += candy.getWeight();
        }
        return sum;
    }

    public void sortByPrice(){
        Arrays.sort(candies, new SortByPrice());
    }

    public int findByChocolateContent(double a, double b){
        for(int i = 0; i < candies.length; i++){
            double chocolateContent = candies[i].getChocolate_content();
            if(a <= chocolateContent & chocolateContent <= b){
                return i;
            }
        }
        return -1;
    }

    public Sweets get(int index){
        return candies[index];
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public String toString() {
        String result = "SweetPresent{";
        for (Sweets candy: candies){
            result += '\n';
            result += candy.toString();
        }
        result += '\n';
        result += '}';
        return result;
    }
}
