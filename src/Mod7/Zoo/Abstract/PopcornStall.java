package Mod7.Zoo.Abstract;

public class PopcornStall {
    public void print() {
        System.out.println(this);
    }

    public void sound() {
        System.out.println("Fresh Popcorn!");
    }

    @Override
    public String toString() {
        return "It's a popcorn stall";
    }
}
