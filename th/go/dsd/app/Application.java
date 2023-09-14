package th.go.dsd.app;

import th.go.dsd.util.Car;
import th.go.dsd.util.OuterClass;
import th.go.dsd.util.Vehicle;

public class Application {
    public static void main(String[] args) {
        // Vehicle myCar = new Car();
        // myCar.honk();
        // System.out.println(myCar.brand());

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x);
        System.out.println(myInner.y);
    }
}
