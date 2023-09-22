# OOP : Chapter 10

## Exceptions
* When executing Java code, different errors can occur: coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
* When an error occurs, Java will normally stop and generate an error message.
* The technical term for this is : Java will throw an exception(throw an error).

### Try and catch
* The try statement allows you to define a block of code to be tested for errors while it is being executed.
* The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
* The try and catch keywords come in pairs.
<b>Syntax</b>
```
try{
  // Block of code to try
}catch(Exception e){
  // Block of code to handle errors
}finally{
  // Block of code to finally
}
```

<details>
<summary>MyException.java</summary>

```java
package th.go.dsd.app;

public class MyException {
    public static void main(String[] args) {
      try{
          int[] myNumbers = {1, 2, 3};
          System.out.println(myNumbers[10]);
      }catch(IndexOutOfBoundException ie){
        System.out.println("Index error");
      }catch (Exception e) {
          e.printStackTrace();
          System.out.println("Error !!!");
      }finally{
          System.out.println("Final Step");
      }
    }    
}
```
</details>


### The throw keyword
* The throw statement allows you to create a custom error.
* The throw statement is used together with anexception type.
* There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBounndsException, SecurityException, etc.
</br>
<b>Example</b>

<details>
<summary>MyException.java</summary>

```java
package th.go.dsd.app;

public class MyException {
    void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        try{
            MyException my = new MyException();
            my.checkAge(15);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }    
}
```
</details>

## Threads
* Threads allows a program to operate more efficiently by doing multiple things at the same time.
* Threads can be used to perform coplicated tasks in the background without intrruptin the main program.
* There are tw ways to create a thread.
* It can be created by extending the Thread class and overriding its run() method.
* Another way to create a thread is to implement the Runnable interface.
</br>
<b>Example</b>

<details>
<summary>MyThread.java</summary>

```java
package th.go.dsd.util;

public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("In main method");
    }

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("In thread run method");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
```
</details>

</br>
<b>Example</b>

<details>
<summary>MyRunable.java</summary>

```java
package th.go.dsd.util;

public class MyRunable implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("In run method");
        }catch(Exception e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MyRunable myrun = new MyRunable();
        Thread thread = new Thread(myrun);
        thread.start();
        System.out.println("In main method");
    }
}
```
</details>

## Debug

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

public class MyCare {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModelName("Ford");
        c.getInfo();
        Truck t = new Truck();
        t.getInfo();
    }
}
```
</details>

---