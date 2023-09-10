package th.go.dsd.app;

import th.go.dsd.util.Car;

public class Application {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.hook();
        System.out.println(myCar.getModelName()); // <--
    }
}
