public class Squirrel extends Animal implements Flying, Running {

    protected int distance;
    int value;

    public Squirrel(int number, int distance) {
        super(number);
        this.distance = distance;

    }

    public void jump() {
        System.out.println("This squirrel can jump " + distance + "feet high.");

    }

    @Override
    public void showProfile() {
        System.out.println("This is a Squirrel that is " + number + " feet tall.");

    }

    @Override
    public void run() {
        value = number * 2;
        System.out.println("This squirrel can run at " + value + " miles/hour.");
    }

    @Override
    public void fly() {
        value = number / 2;
        System.out.println("this squirrel can fly at " + value + " miles/hour.");
    }
}
