public class ScenarioTest {

    public static void main(String[] args) {

        RescueRobot robot = new RescueRobot("RR-01");

        robot.updatePosition(10.5, 20.3);

        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        robot.startEngine();
        System.out.println("Max Speed: " + robot.maxSpeed());
        robot.stopEngine();

        double temp = robot.readTemperatureC();
        System.out.println("Temperature: " + temp);

        boolean found = robot.detectHuman(36.5);
        System.out.println("Detect Human: " + found);

        robot.send("Found hotspot...");
    }
}
