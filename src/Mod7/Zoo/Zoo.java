package Mod7.Zoo;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    // Override toString here...
    Object[] objects;
    public Zoo() {
        objects = new Object[3];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
    }

    public void print() {
        for (Object a : objects) {
            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = a;
    }

    @Override
    public String toString(){
//        System.out.println(Arrays.toString(objects));
        return "Zoo: " + Arrays.toString(objects);
//        return objects.toString();
    }

}