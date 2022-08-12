public class Crab extends Animal implements Running, Swimming {
    int value;
    protected int time;

    public Crab(int number, int time) {
        super(number);
        this.time = time;
    }

    public void pinch() {
        System.out.println("This crab can pinch for " + time + " seconds.");

    }

    @Override
    public void showProfile() {
        System.out.println("This is a Crab that is " + number + " feet tall.");

    }

    @Override
    public void run() {
        value = number / 2;
        System.out.println("This crab can run at " + value + " miles/hour.");
    }

    @Override
    public void swim() {
        value = number * 2;
        System.out.println("This crab can swim at " + value + " miles/hour.");
    }

}
