# DSD Java OOP Part 1

## Classes and Objects

### Class
```
- To create a class, use the keyword clase.

#Example
public class Main{
    int x = 5;
}
```

### Object
```
- In Java, an object is created form a class.
- To create an object of Main, specify the class name, followed by the object name, and use the keywork new.

#Example
public cladd Main{
    int x = 5;
    public static void main(String[] args){
        Main myObj = new Main()
        System.out.println(myObj.x);
    }
}
```

### Multi Class

```
# Myclass.java
public class MyClass{
    int age = 18;

    void getAge(){
        int age = 5;
        System.out.println(this.age);
    }

    String getName(){
        this.getAge();
        return "Name and age = ";
    }

    static void showMe(){       // not use static because you can use by MyClass.showMe();
        // code block
    }
}
```

```
# Second.java
public class Second {
    public static void main(String[] args){

        // Obj 1
        MyClass obj1 = new MyClass();
        System.out.println(obj1.age);
        obj1.age = 34;
        obj1.getAge();

        // Obj2
        MyClass obj2 = new MyClass();
        obj2.getAge();
    }
}
```

## Class Attributes

```
- A class attributes are variables within a class.

# Example
public class Main{
    // Class Attributes
    int x = 5;
    int y = 3;
}
```

## Class Methods
```
- Methods are declared within a class, and that they are used to perform certain actions.

# Example
public class Main{
    static void myMethod(){
        System.out.println("Hello World!");
    }
}
```

## Constructors
```
- A constructor in Java is a special method that is used to initialize objects.
- The constructor is called when an object of a class is created.
- It can used to set initial values for object attributes.

# Example
public class Main{
    int x;
    public Main(){
        x = 5;
    }

    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
```

### labs

```
# MyClass.java
public class MyClass{

    MyClass(int age){
        System.out.println("In constructor");
        this.age = age;
    }

    int age = 18;

    void getAge(){
        int age = 5;
        System.out.println(this.age);
    }

    String getName(){
        this.getAge();
        return "Name and age = ";
    }
}
```

```
# Second.java
public class Second {
    public static void main(String[] args){

        // Obj 1
        MyClass obj1 = new MyClass(20);
        System.out.println(obj1.age);
        obj1.age = 34;
        obj1.getAge();

        // Obj2
        MyClass obj2 = new MyClass(46);
        obj2.getAge();
    }
}
```