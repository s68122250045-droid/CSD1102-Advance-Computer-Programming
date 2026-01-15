public class RicePlant {
    private int id;
    private String riceVariety;
    private GrowthStage Stage;
    public static int totalPlants = 0; // ใช้เก็บจำนวนต้นข้าวทั้งหมดในระบบ
    
    public RicePlant(int id, String riceVariety, GrowthStage stage) { // เขียน constructor
        this.id = id;
        this.riceVariety = riceVariety;
        this.Stage = stage;
        totalPlants++;
    }
    public static int gettotalPlants() { // เขียน method เพื่อคืนค่าจำนวนต้นข้าวทั้งหมด
        return totalPlants;
    }
    public void displayInfo() { // เขียน method เพื่อแสดงข้อมูลต้นข้าว
        System.out.println("Plant ID: " + id);
        System.out.println("Rice Variety: " + riceVariety);
        System.out.println("Growth Stage: " + Stage);
        System.out.println("-----------------------");
    }
    public void grow() {
        switch (Stage) {
            case SEED:
                System.out.println("SEED");
                break;
            case SPROUT:
                System.out.println("SPROUT");
                break;
            case VEGETATIVE:
                System.out.println("VEGETATIVE");
                break;
            case HEADING:
                System.out.println("HEADING");
                break;
            case HARVEST:
                System.out.println("HARVEST");
                break;
    }
    }
}


