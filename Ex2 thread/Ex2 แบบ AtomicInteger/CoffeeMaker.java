
class CoffeeMaker implements Runnable {

    private String menu;
    private CoffeeMachine machine;
    private Counter ati;

    public CoffeeMaker(String menu, CoffeeMachine machine, Counter ati) {
        this.menu = menu;
        this.machine = machine;
        this.ati=ati;
    }

    @Override
    public void run() {
        machine.brew(menu);
        ati.increment();

    }
}