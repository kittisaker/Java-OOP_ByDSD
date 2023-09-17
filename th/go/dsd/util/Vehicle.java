package th.go.dsd.util;

public abstract class Vehicle {                 //  abstract
    protected String brand = "Ford";            

    public void honk(){
        System.out.println("Tuut Tuut !!");
    }

    abstract public String getInfo();                  //  abstract
    abstract public String sayHi();
}
