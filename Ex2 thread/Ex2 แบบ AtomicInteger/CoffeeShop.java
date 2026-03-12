
public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();
        Counter ati = new Counter();

        new Thread(new CoffeeMaker("Espresso", machine, ati)).start();
        new Thread(new CoffeeMaker("Latte", machine, ati)).start();
        new Thread(new CoffeeMaker("Mocha", machine, ati)).start();
        new Thread(new CoffeeMaker("Chocolate", machine, ati)).start();
        new Thread(new CoffeeMaker("Cappuccino", machine, ati)).start();
        new Thread(new CoffeeMaker("Macchiato", machine, ati)).start();
        new Thread(new CoffeeMaker("Affogato", machine, ati)).start();
        new Thread(new CoffeeMaker("Flat White", machine, ati)).start();
        new Thread(new CoffeeMaker("Honey Lemon", machine, ati)).start();
        new Thread(new CoffeeMaker("Cocoa", machine, ati)).start();
        System.out.println("End main");
        
    }
}
