
public class Lobster extends Crab {

    protected int food;

    public Lobster(int number, int time, int food) {
        super(number, time);
        this.food = food;
    }

    @Override
    public void showProfile() {
        super.showProfile();
        System.out.println("This is a lobster that is " + number + " feet tall.");
    }

    @Override
    public void pinch() {
        super.pinch();
        System.out.println("....except that it is actually a lobster.");
    }

    public void pinch(int extra) {
        System.out.println("this lobster can pinch for " + time + " seconds.");
        System.out.println(" Using force extends it by " + extra + " seconds.");

    }

    public void eat() {
        System.out.println("This lobster can eat " + food + " shrimp/day.");
    }
}
