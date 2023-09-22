# OOP : Chapter 8

## Date and Time
* Java does not have a built-in Date class, but we can import the java.time/ java.util package to work with the date and time API.
* The package includes many date and time classes.

<table>
  <tr>
    <th>Class</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>LocalDate</td>
    <td>Represents a date (year, month, day (yyyy-MM-dd))</td>
  </tr>
  <tr>
    <td>LocalTime</td>
    <td>Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns)</td>
  </tr>
  <tr>
    <td>LocalDateTime</td>
    <td>Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)</td>
  </tr>
  <tr>
    <td>DateTimeFormatter</td>
    <td>Formatter for displaying and parsing date-ime objects</td>
  </tr>
</table>


<details>
<summary>MyDateTime.java</summary>

```java
package th.go.dsd.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now(); // .now() : public static
        System.out.println("Before format = " + myDateObj);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateWithFormat = myDateObj.format(dtf);
        System.out.println(dateWithFormat);
    }
}
```
</details>

## ArrayList
* The ArrayList class is a resizablearray, which can be found in the java.utill package.
* The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one).
* Shile elements can be added and removed from an ArrayList whenever you want.
* The syntax is also slightly different.

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        System.out.println(cars.size()); // 1
        System.out.println(cars.get(0)); // Ford
        cars.set(0, "Volvo");
        System.out.println(cars.get(0)); // Volvo
        cars.add("Toyota");
        System.out.println(cars.size()); // 2
        cars.add("Honda");
        cars.remove(1);
        System.out.println(cars.size()); // 2
        System.out.println(cars.get(1)); // Honda
        cars.clear(); // Clear

        System.out.println(cars.get(0));
        System.out.println(cars.get(1));

    }
}
```
</details>


---