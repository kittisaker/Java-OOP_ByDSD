# OOP : Chapter 6

## Interfaces #2
* Like abstract classes, interfaces cannot be used to create objects
* Interface methods do <b>not have a body</b> - the body is provided by the "implement" class
* On implementation of an interface, you must override all its methods
* Interface methods are by default abstract and public
* Interface attributes are by default public, static and final
* An interface cannot contain a constructor (as it cannot be used to create objects)

## Interfaces #3

* Example

<details>
<summary>Aninal.java (interface)</summary>

```java
interface Animal{
    public void animalSound();
    public void sleep();
}
```
</details>

<details>
<summary>Pig.java</summary>

```java
cladd Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}
```
</details>

## Interfaces #3

* Example

<details>
<summary>FirstInterface.java (interface)</summary>

```java
interface FirstInterface{
    public void myMethod();
}
```
</details>

<details>
<summary>SecondInterface.java (interface)</summary>

```java
interface SecondInterface{
    public void myOtherMethod();
}

```
</details>

<details>
<summary>DemoClass.java (implements)</summary>

```java
class DevoClass implements FirstInterface, SecondInterface{
    public void myMethod(){
        System.out.println("Some text...");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}
```
</details>

## Emums
* An enum is a special "class" that respresents a group of constants (unchangeable variables, like final variables).
* To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
* Note that they should be in uppercase letters.
</br>
* Example
```
enum Level{
    LOW,
    MEDIUM,
    HIGH
}
```

## Enum inside a Class

* Example
<details>
<summary>Main.java</summary>

```java
package th.go.dsd.app;

public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HEIGHT
    }
    enum Status{
        ACTIVE,
        INACTIVE
    }
    public static void main(String[] args) {
        Status s = Status.ACTIVE;

        if(s == Status.ACTIVE){
            System.out.println(s);
        }
    }
}
```
</details>

---

