# DSD Java OOP Part 2

## Modifiers

```
- Access Modifiers : controls the access level
- Non-Access Modifiers : do not control access level, but provides other functionality
```

### Access Modifiers

```
- classes
public : The class is accessible by any _other class_
default : The class is only accessible by classes in the _same package_. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter

- attributes
public : The code is accessible for all class (Normaly not use)
private : The code is only accessible within the declared class (Only own class)
default : The code is only accessible in the _same package_. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter
protected : The code is accessible in the _same package and subclasses_. You will learn more about subclasses and superclasses in the Inheritance chapter
```

### Non-Access Modifiers

```
- classes
final : The class _connot be inherited_ by other classes
abstract : The class _cannot be used to create objects_

- attributes
final : Attributes and method be overriden/modified
static : Attributes and methods belongs to the class, rather than an object
abstract : Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run(); The body is provided by the subclass (Inherited from).
transient : Attributes and methods are skipped when serializing the object containing them
synchronized : Methods can only be accessed by one thread at a time
volatile : The value of an attiibute is not cached thread-locally, and is always read from the "main memory"
```

## Encapsulatoin
```
- The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
    - declare class variables/attributes as private
    - provide public get and set methods to access and update the value of a private variable
- The get method returns the variable value, and the set method sets the value.
- Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case.
```

<details>
<summary>Solutoin</summary>

```
public class MyClass{

    private int age = 18;
    private String name = "";

    MyClass(int age){
        System.out.println("In constructor");
        this.age = age;
    }

    MyClass(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

</details>

## Packages & API
```
- A package in Java is used to group relaed classes.
- Think of it as a folder in a file directory.
- Java use packages to avoid name conflicts, and to write a etter maintainable code.
- Packages are divided into two categories:
    - Built-in Packages (packages from the Java API)
    - User-defined Packages (create your own packages)
```

### Built-in Packages
```
Learn more
```

## Import
```
# Syntax
import package.name.Class;  // Import a single class
import package.name.*;  // Import a whole class

# Example
import java.util.List;
import java.util.*;
```

<details>
<summary>Example</summary>

```
import java.util.ArrayList;
public class Second {
    public static void main(String[] args){

        // Obj 1
        MyClass obj1 = new MyClass(20);
        obj1.getAge();

        // Obj2
        MyClass obj2 = new MyClass(46);
        obj2.getAge();

        // Obj3
        MyClass obj3 = new MyClass(24, "John");
        obj3.getAge();

        ArrayList<MyClass> ls = new ArrayList<>();
        ls.add(obj1);
        ls.add(obj2);
        ls.add(obj3);
        ls.size();
    }
}
```

</details>

## User-defined Packages

```
# Ex
package mypack;
class MyPackageClass{
    public static void main(String[] args){
        System.out.println("This is my package!);
}
```

```
Create Folder and Move file
and Test 
Application.java
package th.go.dsd.app;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello world!!");
    }
}
```