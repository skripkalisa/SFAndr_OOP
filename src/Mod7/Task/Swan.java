package Mod7.Task;

class Swan extends Bird implements ICanFly, ICanSwim, ICanRun {
    protected Swan(String species, String food) {
        super(species, food);
    }

    @Override
    public void fly() {
        ICanFly.super.fly();
    }

    @Override
    public void run() {
        ICanRun.super.run();
    }

    @Override
    public void swim() {
        ICanSwim.super.swim();
    }
}
