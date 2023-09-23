# OOP : Chapter 11

## Lambda Expressions
* Lambda Expressions were added in Java 8.
* A lambda expression is a short block of code which takes in parameters and returns a value.
* Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
</br>
<b>Syntax</b>
```
parameter -> expression
(parameter1, parameter2) -> expression
(parameter1, parameter2) -> {code block}
```
</br>
<b>Example</b>

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;
import java.util.List;

public class MyLambda {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(8);

        myList.forEach((a)->{
          System.out.println(a);
        });

        myList.forEach(meth);
    }
}
```
</details>

</br>
<b>Example</b>

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyLambda {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(8);

        Consumer<Integer> meth = (a) -> {
            System.out.println(a);
        };

        myList.forEach(meth);
    }
}
```
</details>

</br>
<b>Example</b>

<details>
<summary>StringFunction.java (interface)</summary>

```java
package th.go.dsd.util;

public interface StringFunction {
    String run(String str);
}
```
</details>

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

public class MyStringFunction {
    public static void main(String[] args) {
        StringFunction s1 = (s) -> s + "!";
        printFormatted("Hello", s1);
    }

    public static void printFormatted(String str, StringFunction fnc){
        String rest = fnc.run(str);
        System.out.println(rest);
    }
}
```
</details>

---
