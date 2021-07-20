package Mod7.Task;

public class Penguin extends Bird implements ICanSwim {
    protected Penguin(String species, String food) {
        super.species = species;
        super.food = food;
    }

    @Override
    protected void info() {
        super.info();
        swim();
    }

    @Override
    public void swim() {
        super.also();
        ICanSwim.super.swim();
        super.dot();
    }
}
