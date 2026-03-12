
class CoffeeMaker implements Runnable {

    private String menu;
    private CoffeeMachine machine;
    private Counter syn;

    public CoffeeMaker(String menu, CoffeeMachine machine, Counter syn) {
        this.menu = menu;
        this.machine = machine;
        this.syn=syn;
    }

    @Override
    public void run() {
        machine.brew(menu);
        syn.increment();

    }
}