package Mod7.Task;

class Aircraft implements ICanFly {
    private String objectType = "plain";
    private String usage = "civil";

    protected Aircraft(String objectType, String usage) {
        this.objectType = objectType;
        this.usage = usage;
    }

    protected void info() {
        System.out.println("This is a " + usage +" " + objectType + ". ");
        fly();
    }

    @Override
    public void fly() {
        System.out.println("This " + objectType + " can fly higher and faster than birds.");
    }
}
