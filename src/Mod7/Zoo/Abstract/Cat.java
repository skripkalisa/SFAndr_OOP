package Mod7.Zoo.Abstract;

public class Cat extends Animal{
    public void print() {
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "I am a cat";
    }
}
