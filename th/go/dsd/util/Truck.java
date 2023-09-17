package th.go.dsd.util;

public class Truck extends Vehicle{
    // @Override is inotation
    @Override
    public String getInfo() {
        return "Hino";
    }

    @Override
    public String sayHi() {
        return "Hi from my truck";
    }
    
}
