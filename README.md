# OOP : Chapter 9

## Sort an ArrayList

<details>
<summary>MyList.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;
import java.util.Collections;

public class MyList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for(String c : cars){
            System.out.println(c);
        }
    }
}
```
</details>

## LinkedList
* For many cases, the ArrayList is more efficient ad it is commion to need access to random items in the list, but the LinkedList provides serveral methods to do certain operations more efficiently.

<table>
  <tr>
    <th>Method</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>addFirst()</td>
    <td>Add an item to the beginning of list.</td>
  </tr>
  <tr>
    <td>addLast()</td>
    <td>Add an item to the end of the list</td>
  </tr>
  <tr>
    <td>removeFirst()</td>
    <td>Remove an item from the beginning of the list.</td>
  </tr>
  <tr>
    <td>removeLast()</td>
    <td>Remove an item from the end of the list</td>
  </tr>
  <tr>
    <td>getFirst()</td>
    <td>Get the item at the beginning of the list</td>
  </tr>
  <tr>
    <td>getLast()</td>
    <td>Get the item at the end of the list</td>
  </tr>
</table>

## HashMap
* A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
* One object is used as a key (index) to another object (value).
*It can store different types : String keys and Integer values, or the same type, link : String keys and String values
</br>
* Example
<details>
<summary>MyMap.java</summary>

```java
package th.go.dsd.util;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        
        Map<String, String> data = new HashMap<>();
        data.put("One", "1");
        System.out.println(data.containsKey("One")); //True
        System.out.println(data.containsKey("Two")); //False
        System.out.println(data.get("One"));
    }
}
```
</details>

* Exercise
```
String[] rawData = new String[]{"One", "Two", "Three", "One", "One", "Two"};

// One = 3, Two = 2, Three = 1
```

<details>
<summary>MyMap.java</summary>

```java
package th.go.dsd.util;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        String[] rawData = new String[]{"One", "Two", "Three", "One", "One", "Two"};
        Map<String, String> data = new HashMap<>();
        
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        
        for(int i = 0; i<rawData.length; i++){
            data.put(Integer.toString(i), rawData[i]);
        }
        
        for(int i = 0; i<data.size(); i++){
            String select = data.get(Integer.toString(i));

            switch (select){
                case "One" :
                    sum1++;
                    break;
                case "Two":
                    sum2++;
                    break;
                case "Three":
                    sum3++;
                    break;
            }
        }
        System.out.println("One = " + sum1 + " Two = " + sum2 + " Three = " + sum3);
    }
       
}
```
</details>

* Example
<details>
<summary>MyMap.java</summary>

```java
package th.go.dsd.util;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();
        
        capitalCities.put("England", "London");

        for(String i : capitalCities.keySet()){
            System.out.print(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }
    }
       
}
```
</details>

## HassSet
* A HashSet is a collection of items where every item is unique, and it is found in the java.util package.
</br>
* Example

<details>
<summary>Main.java</summary>

```java
class Main(){
  public static void main(String[] args){
    HashSet<String> cars = new HashSet<String>();
    cars.add("Valvo");
    cars.add("BMW");
    cars.add("BMW");
    cars.contains("Mazda");
    cars.size();
    cars.remove("Volvo");
    cars.clear();
    System.out.println(cars);
  }
}
```
</details>

## Iterator
* An Iterlator is an object that can be used to loop through collections, like ArrayList and HashSet.
* It is called an "iterator" because "iterating" is the technical term for looping.
* To use an Iterator, you must import it from the java.util package.
* The iterator() method can be used to get an Iterator for any collection.
</br>
* Example

<details>
<summary>Main.java</summary>

```java
class Main(){
  public static void main(String[] args){
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Valvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.contains("Mazda");
    Iterator<String> it = cars.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}
```
</details>

## Wrapper Classes
* Wrapper classes provide a way to use primitive data types (int, boolean, etc...) as objects.
* Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects).

<table>
  <tr>
    <th>Primitive Data Type</th>
    <th>Wrapper Class</th>
  </tr>
  <tr>
    <td>byte</td>
    <td>Byte</td>
  </tr>
  <tr>
    <td>short</td>
    <td>Short</td>
  </tr>
  <tr>
    <td>int</td>
    <td>Integer</td>
  </tr>
  <tr>
    <td>long</td>
    <td>Long</td>
  </tr>
  <tr>
    <td>float</td>
    <td>Float</td>
  </tr>
  <tr>
    <td>double</td>
    <td>Double</td>
  </tr>
  <tr>
    <td>boolean</td>
    <td>Boolean</td>
  </tr>
  <tr>
    <td>char</td>
    <td>Character</td>
  </tr>
</table>
</br>
* Example

<details>
<summary>Main.java</summary>

```java
class Main(){
  public static void main(String[] args){
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';

    System.out.println(myInt.inValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
```
</details>

---