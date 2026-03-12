
class CoffeeMachine {

         public void brew(String menu) {
        System.out.println("กำลังใช้เครื่องชง: " + menu);
        try {
            Thread.sleep((int) (Math.random() * 3000));
        } catch (InterruptedException e) {
        }
        System.out.println("เครื่องดื่มเสร็จ: " + menu);
    }
}
