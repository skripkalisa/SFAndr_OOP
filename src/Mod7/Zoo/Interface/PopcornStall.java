package Mod7.Zoo.Interface;

public class PopcornStall implements Asounding {
    public void print() {
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Fresh Popcorn!");
    }

    @Override
    public String toString() {
        return "It's a popcorn stall";
    }
}
