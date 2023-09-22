package th.go.dsd.util;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        System.out.println(cars.size()); // 1
        System.out.println(cars.get(0)); // Ford
        cars.set(0, "Volvo");
        System.out.println(cars.get(0)); // Volvo
        cars.add("Toyota");
        System.out.println(cars.size()); // 2
        cars.add("Honda");
        cars.remove(1);
        System.out.println(cars.size()); // 2
        System.out.println(cars.get(1)); // Honda
        cars.clear(); // Clear

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

    }
}
