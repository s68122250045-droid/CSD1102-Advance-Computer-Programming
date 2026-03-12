
public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();
        Counter syn = new Counter();

        new Thread(new CoffeeMaker("Espresso", machine, syn)).start();
        new Thread(new CoffeeMaker("Latte", machine, syn)).start();
        new Thread(new CoffeeMaker("Mocha", machine, syn)).start();
        new Thread(new CoffeeMaker("Chocolate", machine, syn)).start();
        new Thread(new CoffeeMaker("Cappuccino", machine, syn)).start();
        new Thread(new CoffeeMaker("Macchiato", machine, syn)).start();
        new Thread(new CoffeeMaker("Affogato", machine, syn)).start();
        new Thread(new CoffeeMaker("Flat White", machine, syn)).start();
        new Thread(new CoffeeMaker("Honey Lemon", machine, syn)).start();
        new Thread(new CoffeeMaker("Cocoa", machine, syn)).start();
        System.out.println("End main");
        
    }
}
