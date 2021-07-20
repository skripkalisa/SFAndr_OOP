package Mod7.Task;

public class Ostrich extends Bird implements ICanRun {
    protected Ostrich(String species, String food) {
        super(species, food);
    }

    @Override
    protected void info() {
        super.info();
        run();
    }

    @Override
    public void run() {
        super.also();
        ICanRun.super.run();
        super.dot();
    }
}
