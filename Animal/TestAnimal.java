public class TestAnimal {
    public static void main(String[] args) {
        Animal obj1 = new Animal();
        obj1.isMammal();
        Fish f1 = new Fish();
        f1.isMammal();
        //f1.swim();
        Zebra z1 = new Zebra();
        z1.isMammal();
        System.out.println(z1.age);
        z1.run();
        Duck d1 = new Duck();
        d1.isMammal();
        d1.Swim();
        d1.quack();
        System.out.println(d1.beackcolor);

    }
}