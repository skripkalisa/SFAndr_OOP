package Mod7.Zoo.Abstract;

public class Dog extends Animal{
    public void print() {
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    public String toString() {
        return "I am a dog";
    }
}
