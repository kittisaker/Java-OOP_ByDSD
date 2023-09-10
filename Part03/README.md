# DSD Java OOP Part 3

## Inheritance (Subclass and Superclass)

```
- In Java, it is possible to inherit attributes and methods from one class to another.
- Java group the "inheritance concept" intto two categories:
    - subclass(child) : the class that inherits from another class
    - superclass (parent) : the class being inherited from
- To inherit from a class, se the extends keyword.
```

## Parent - Chile

<details>
<summary>Vehicle.java</summary>

```
package th.go.dsd.util;

public class Vehicle {
    protected String brand = "Ford";        // <--
    public void hook(){
        System.out.println("Tuut, tuut!");
    }
}
```
</details>

<details>
<summary>Car.java</summary>

```
package th.go.dsd.util;

public class Car extends Vehicle{
    private String modelName = "Mustang";   // <--

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // public String getBrand(){        // <--
    //     return this.brand;
    // }
    
}
```
</details>

<details>
<summary>Application.java</summary>

```
package th.go.dsd.app;

import th.go.dsd.util.Car;

public class Application {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.hook();
        System.out.println(myCar.getModelName()); // <--
    }
}
```
</details>

## Polymorphism
```
- Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
- Interitance lets us inherit attributes and methods from another class.
- Polymorphism uses those methodes to perform different tasks.
- This allows us to perform a single action in different ways.
```

### Override
```
# Ex
# Aninal.java
class Animal{
    public void animalSound(){
        System.out.prntln("The animal makes a sound");
    }
}
```

<details>
<summary>Car.java</summary>

```
package th.go.dsd.util;

public class Car extends Vehicle{
    private String modelName = "Mustang";   // <--

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void hook(){                         // <--
        // super.hook();
        System.out.println("Car Beep Beep!");
    }   
}

```
</details>

## Inner Class (Currently not commonly used But know this in case you have to encounter it.)

```
class OuterClass{
    int x = 10;
    class InerClass{
        int y = 5;
    }

    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
}
```