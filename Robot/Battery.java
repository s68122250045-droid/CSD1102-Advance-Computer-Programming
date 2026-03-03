package Robot;
public class Battery {

    private double percentBattery;
    public Battery(double percentBattery) {
        this.percentBattery = percentBattery;
    }
    public void setPercentBattery(double percent) {
        this.percentBattery = percent;
    }
     public double getPercentBattery() {
        return percentBattery;
    }
    public void drain(double percent) {
        this.percentBattery -= percent;
        if (this.percentBattery < 0) {
            this.percentBattery = 0;
        }
    }
    public void charge() {
        this.percentBattery = 100;
    if (this.percentBattery > 100) {
            this.percentBattery = 100;
        }
    }
}