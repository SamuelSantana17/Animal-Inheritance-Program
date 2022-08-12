public class Pelican extends Animal implements Flying, Swimming {
    int value;
    protected int depth;

    public Pelican(int number, int depth) {
        super(number);
        this.depth = depth;

    }

    public void dive() {
        System.out.println("This pelican can dive " + depth + " feet deep.");

    }

    @Override
    public void showProfile() {
        System.out.println("This is a Pelican that is " + number + " feet tall.");

    }

    @Override
    public void fly() {
        value = number * 2;
        System.out.println("This pelican can fly at " + value + " miles/hour.");
    }

    @Override
    public void swim() {
        value = number / 2;
        System.out.println("This pelican can swim at " + value + " miles/hour.");
    }
}
