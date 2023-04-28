public class Sandwich {
    String name = "Placeholder name";
    double cost = 1.23;
    String meats = "Placeholder meats";
    String toppings = "Placeholder toppings";

    public Sandwich(String name, double cost, String meats, String toppings){
        this.name = name;
        this.cost = cost;
        this.meats = meats;
        this.toppings = toppings;
    }
    void display(){
        System.out.printf("Sandwich name: %s%nCost: %.2f%nMeats: %s%nToppings: %s%n", name, cost, meats, toppings);
    }
}
