package Mod7.Zoo.Interface;

public class Main {
    public static void main(String[] args) {
/*

You have to override toString() method
in the class Zoo

*/

        Zoo zoo = new Zoo();
//        zoo.change(new Dog(), 2);
        System.out.println(zoo);
        zoo.sound();


/*
This fragment has to output

Zoo: [I am a Dog, I am a Cat, I am a Dog]

*/
    }
}
