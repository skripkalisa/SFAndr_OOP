package Mod7.Task;

public class Ostrich extends Bird implements ICanRun {
    protected Ostrich(String species, String food) {
        super(species, food);
    }


    protected void info() {
        System.out.print("Hello, I'm " + species + " and I eat " + food + ". ");
        run();
    }

    @Override
    public void run() {
        System.out.println("Also, I can run.");
    }
}
