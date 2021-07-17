package Mod7.Zoo.Interface;

abstract public class Animal {
    public void print() {
        System.out.println(this);
    }



    @Override
    public String toString() {
        return "I am an animal";
    }
}
