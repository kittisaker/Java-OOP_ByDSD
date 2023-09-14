# OOP : Chapter 2

## Constructor Parameters
- Constructors can also take paameters, which is used to initialize attributes.

<details>
<summary>MyClass.java</summary>

```
public class MyClass{                    // <--

    MyClass(int age){
        System.out.println("This is constructor");
        this.age = age;                             // <--
    }

    int age = 18;

    void getAge(){
        System.out.println(this.age);
    }

}
```
</details>

<details>
<summary>Second.java</summary>

```
public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass(20);
        
        int age = obj.age;
        System.out.println("age : " + age);

        obj.age = 34;
        obj.getAge();

        MyClass obj2 = new MyClass(46);
        
        String title = obj2.getTitle();
        System.out.println("title : " + title);
    }
}
```
</details>

## Modifiers
- Java divide modifiers in two group:
    - Access Modifiers      : controls the access level
    - Non-Access Modifiers  : do not control access level, but provides other functionality

### Access Modifiers
- classes

<table>
   <thead>
      <tr>
         <th>Modifier</th>
         <th>Description</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>public</td>
         <td>The class is accesseble by any <b>other class</b></td>
      </tr>
      <tr>
         <td>default</td>
         <td>The class is only accessible by classes in the <b>same package</b>. This is used when you don't specify a modfier.</td>
      </tr>
   </tbody>
</table>

- attributes, methods and constructors

<table>
   <thead>
      <tr>
         <th>Modifier</th>
         <th>Description</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>public</td>
         <td>The code is accessible for all classes.</td>
      </tr>
      <tr>
         <td>private</td>
         <td>The code is only accessible within the declared class. <b>(only own class)</b></td>
      </tr>
      <tr>
         <td>default</td>
         <td>The code is only accessible in the <b>same package</b>. This is used when you don't specify a modifier.</td>
      </tr>
      <tr>
         <td>protected</td>
         <td>The code is accessible in the <b>same package</b> and <b>subclasses</b>.</td>
      </tr>
   </tbody>
</table>

### Non-Access Modifiers
- classes

<table>
   <thead>
      <tr>
         <th>Modifier</th>
         <th>Description</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>final</td>
         <td>The class <b>cannot be Inherited</b> by other classes</td>
      </tr>
      <tr>
         <td>abstract</td>
         <td>The class <b>cannot</b> be used to <b>create objects</b> (To access an abstract class, it must be Inherited from another class).</td>
      </tr>
   </tbody>
</table>

- attributes, methodes and constructors

<table>
   <thead>
      <tr>
         <th>Modifier</th>
         <th>Description</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>final</td>
         <td>Attributes and methods cannot be overridden/modified</td>
      </tr>
      <tr>
         <td>static</td>
         <td>Attributes and methods belongs to the class, rather han an object</td>
      </tr>
      <tr>
         <td>abstract</td>
         <td>Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run(); The body is provided by the subclass (Inheited from).</td>
      </tr>
      <tr>
         <td>transient</td>
         <td><b>Attributes and methods</b> are skipped when <b>serializing</b> the object containing them.</td>
      </tr>
      <tr>
         <td>synchronized</td>
         <td><b>Metods</b> can only be accessed by one <b>thread</b> at a time</td>
      </tr>
      <tr>
         <td>volatitle</td>
         <td>The value of an <b>attribute</b> is not cached <b>thread-locally</b>, and is always read from the <b>"main memory"</b>.</td>
      </tr>
   </tbody>
</table>

## Encapsulation

### Java Bean

<details>
<summary>MyClass.java</summary>

```
public class MyClass{

    private int age = 18;
  
    public int getAge(){            // <--
        return age;
    }

    public void setAge(int age){    // <--
        this.age = age;
    }

}
```
</details>

<details>
<summary>Second.java</summary>

```
public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass(20);
        System.out.println(obj.getAge());

        MyClass obj2 = new MyClass(46);
        System.out.println(obj2.getAge());
    }
}
```
</details>

## User-defined Packages
Ex.
- root
   - th
      - go
         - dsd
            - app
               - Application.java
<details>
<summary>Application.java</summary>

```
package th.go.dsd.app;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
```
</details>

---