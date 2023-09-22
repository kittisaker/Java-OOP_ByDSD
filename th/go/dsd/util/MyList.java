package th.go.dsd.util;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for(String c : cars){
            System.out.println(c);
        }
    }
}
