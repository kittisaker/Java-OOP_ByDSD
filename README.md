# OOP : Chapter 1

## Classes and Objects

### Class

- To Create a class, use the keyword class.

<details>
<summary>Main.java</summary>

```java
public class Main{  // <--
    int x = 5;
}

// javac Main.java
// java main
```
</details>

### Object

- In Java, an object is created from a class.
- To create an object of Main, specify the class name, follwed by the object name, and use the keyword <b>new</b>.

<details>
<summary>MyClass.java</summary>

```java
class MyClass{
    int age = 18;
    void getAge(){
        System.out.println(this.age);
    }

    public static void main(String[] args){
        MyClass obj = new MyClass();
        
        int age = obj.age;                      // <--
        System.out.println("age : " + age);

        obj.getAge();
    }
}
```
</details>

## Multiple Classes

<details>
<summary>MyClass.java</summary>

```java
class MyClass{
    int age = 18;
    void getAge(){
        System.out.println(this.age);
    }
}
```
</details>

<details>
<summary>Second.java</summary>

```java
public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        
        int age = obj.age;
        System.out.println("age : " + age);

        obj.age = 34;
        obj.getAge();
    }
}

```
</details>

## Class Attributes
- A class attributes are variables within a class.

<details>
<summary>Main.java</summary>

```java
class Main{
    int x = 5;  // <--
    int y = 3;  // <--
}
```
</details>

## Class Methods

<details>
<summary>Main.java</summary>

```java
class Main{
    void myMethod(){                        // <--
        System.out.println("Hello World!");
    }
}
```
</details>

## Constructors

<details>
<summary>MyClass.java</summary>

```java
class MyClass{

    MyClass(){                                      // <--
        System.out.println("This is constructor");
    }
}
```
</details>

<details>
<summary>Second.java</summary>

```java
public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass();
        
        int age = obj.age;
        System.out.println("age : " + age);
    }
}
```
</details>

...

---