package ArrayList;
import java.util.ArrayList;

import lama.car;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("hino");
        cars.add("mini cooper");
        cars.add("innova");
        cars.add("angkot");

        System.out.println(cars);
        System.out.println(cars.get(3));
        cars.set(3,"bajaj");
        System.out.println(cars.get(3));
        System.out.println(cars.remove(2));
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }
}
