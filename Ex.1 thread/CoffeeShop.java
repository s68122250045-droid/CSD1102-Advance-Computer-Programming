

public class CoffeeShop{
public static void main(String[] args) {

CoffeeMachine machine = new CoffeeMachine();

Thread t1 = new Thread(new CoffeeMaker("Espresso", machine));
Thread t2 = new Thread(new CoffeeMaker("Latte", machine));
Thread t3 = new Thread(new CoffeeMaker("Cappuccino", machine));

t1.run();
t2.run();
t3.run();
t1.run();
t2.run();
t3.run();

System.out.println("🛎 รับออเดอร์ครบแล้ว");
}
}