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
         <td>The class is accesseble by any other class</td>
      </tr>
      <tr>
         <td>default</td>
         <td>data12</td>
      </tr>
   </tbody>
</table>

<details>
<summary>x.java</summary>

```

```
</details>

## 
<details>
<summary>x.java</summary>

```

```
</details>
---