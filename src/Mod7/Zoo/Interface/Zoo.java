package Mod7.Zoo.Interface;

import java.util.Arrays;

public class Zoo {
    // Override toString here...
//    Asounding[] objects;
    Object[] objects;
    public Zoo() {
        objects = new Object[4];

        objects[0] = new Dog();
        objects[1] = new Cat();
        objects[2] = new Reptile();
        objects[3] = new PopcornStall();
    }

    public void sound() {
        for (Object a : objects) {
            if (a instanceof Asounding)
                ((Asounding)a).sound();
//            System.out.println(a);
        }
    }

    public void change(Object a, int i) {
        if (i >= 0 && i < objects.length)
            objects[i] = (Asounding) a;
    }

    @Override
    public String toString(){
//        System.out.println(Arrays.toString(objects));
        return "Zoo: " + Arrays.toString(objects);
//        return objects.toString();
    }

}
