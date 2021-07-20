package Mod7.Task;

class Swan extends Bird implements ICanFly, ICanRun, ICanSwim {
    protected Swan(String species, String food) {
        super(species, food);
    }

    @Override
    public void fly() {
        ICanFly.super.fly();
        super.comma();
    }

    @Override
    public void run() {
        ICanRun.super.run();
        super.comma();
    }

    @Override
    public void swim() {
        ICanSwim.super.swim();
        super.dot();
    }
}
