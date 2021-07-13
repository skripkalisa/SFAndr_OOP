package Mod7.Zoo.Interface;

public class Dog extends Animal implements Asounding{
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
