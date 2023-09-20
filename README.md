# OOP : Chapter 3

## Inheritance (Subclass and Superclass)
- In Java, it is possible to inherit attributes and methods from one class to another.
- Java group the "inhertance concept" into two categories:
   - subclass (child) : the class that inherits from another class
   - superclass (parent) : the class being inherited from
- To inherit from a class, use the <b>extends</b> keyword.

### Parent - Child

<details>
<summary>Vehicle.java</summary>

```java
package th.go.dsd.util;

public class Vehicle {
    protected String brand = "Ford";            // <--

    public void honk(){
        System.out.println("Tuut Tuut !!");
    }
}
```
</details>

<details>
<summary>Car.java</summary>

```java
package th.go.dsd.util;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String brand() {             // <--
        return this.brand;
    }
}
```
</details>

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import th.go.dsd.util.Car;

public class Application {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand());
    }
}

```
</details>

## Polymorphism
- Polymorphism means "myany forms", and t occurs when we have many classes that are related to each other by inheritance.
- Inheritance lets us inherit attributes and methods from another class.
- Polymorphism uses those methods the perform different tasks.
- This allows us to perform a single action in different ways.

### Override

<details>
<summary>Vehicle.java</summary>

```java
package th.go.dsd.util;

public class Vehicle {
    protected String brand = "Ford";            // <--

    public void honk(){
        System.out.println("Tuut Tuut !!");
    }
}
```
</details>

<details>
<summary>Car.java</summary>

```java
package th.go.dsd.util;

public class Car extends Vehicle {
    ...

    public void honk(){                // <--
        super.honk();
        System.out.println("Beep Beep !!");
    }
}
```
</details>

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import th.go.dsd.util.Car;

public class Application {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand());
    }
}
```
</details>

test

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import th.go.dsd.util.Car;
import th.go.dsd.util.Vehicle;

public class Application {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.honk();  // <-- Folow instant
    }
}
```
</details>

## Inner Classes

<details>
<summary>OuterClass.java</summary>

```java
package th.go.dsd.util;

public class OuterClass {
    public int x = 10;

    public class InnerClass{
        public int y = 5;
    }
}
```
</details>

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import th.go.dsd.util.OuterClass;

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
```
</details>

---