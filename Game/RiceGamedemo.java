public class RiceGamedemo {
    public static void main(String[] args) {
        RicePlant p1 = new RicePlant(1, "Jasmine rice" + "", GrowthStage.SEED);
        p1.displayInfo();
        RicePlant p2 = new RicePlant(2, "Sticky Rice" + "", GrowthStage.SPROUT);
        p2.displayInfo();
        RicePlant p3 = new RicePlant(3, "White rice" + "", GrowthStage.VEGETATIVE);
        p3.displayInfo();
        System.out.println("Total rice plants: " + RicePlant.gettotalPlants());
    }
}
    
