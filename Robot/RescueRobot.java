public class RescueRobot implements Flyable, Drivable,
        ThermalSensor, Communicable {

    private String deviceId;

    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery(100);
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }
     
  
    public String status() {
        return "ROBOT: "
                + Flyable.super.status()
                + " + "
                + Drivable.super.status();
    }


    public void takeOff() {
        battery.drain(10);
        System.out.println("Taking off...");
    }

   
    public void land() {
        battery.drain(5);
        System.out.println("Landing...");
    }

    public double maxAltitude() {
        return 5000;
    }


    public void startEngine() {
        battery.drain(5);
        System.out.println("Engine started.");
    }

 
    public void stopEngine() {
        battery.drain(2);
        System.out.println("Engine stopped.");
    }

    public double maxSpeed() {
        return 120;
    }

   
    public double readTemperatureC() {
        battery.drain(3);
        return thermal.readTemperatureC();
    }

    public boolean detectHuman(double thresholdC) {
        battery.drain(3);
        return thermal.detectHuman(thresholdC);
    }

    public void send(String message) {
        battery.drain(4);
        System.out.println("ID=" + deviceId
                + ", POS=" + gps.currentPosition()
                + ", MSG=" + message);
    }


    public String getDeviceId() {
        return deviceId;
    }

    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }

    public double batteryLevel() {
        return battery.getPercentBattery();
    }
}

