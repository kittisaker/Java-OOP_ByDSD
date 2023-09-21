# OOP : Chapter 7

## User Input
* The Scanner class is used to get user input, and it is found in the java.uil package.

<table>
  <tr>
    <th>Mathod</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>nextBoolean()</td>
    <td>Reads a boolean value from the user</td>
  </tr>
  <tr>
    <td>nextByte()</td>
    <td>Reads a byte value from the user</td>
  </tr>
  <tr>
    <td>nextDouble()</td>
    <td>Reads a double value from the user</td>
  </tr>
  <tr>
    <td>nextFloat()</td>
    <td>Reads a float value from the user</td>
  </tr>
  <tr>
    <td>nextInt()</td>
    <td>Reads a int value from the user</td>
  </tr>
  <tr>
    <td>nextString()</td>
    <td>Reads a string value from the user</td>
  </tr>
  <tr>
    <td>nextLong()</td>
    <td>Reads a long value from the user</td>
  </tr>
  <tr>
    <td>nextShort()</td>
    <td>Reads a short value from the user</td>
  </tr>
</table>

---

<details>
<summary>.java</summary>

```java
package th.go.dsd.util;

import java.util.Scanner;

public class MyInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input name : ");
        String name = sc.nextLine();

        System.out.print("Please input age : ");
        int age = sc.nextInt();

        sc.close();

        System.out.println("\nName : " + name + "\nAge : " + age);
    }
}
```
</details>

## Workshop

```
// Case
> java th.go.dsd.app.Aplication myinput info
Output : 
Your Name :
Age :
Hello --, age = xx
```

<details>
<summary>MyInput.java (class MyInput implements AppRunner)</summary>

```java
package th.go.dsd.util;

import java.util.Scanner;

public class MyInput implements AppRunner {
    private String name;
    private int age;
    private String info;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch(param.getSubCommand()){
            case "info":
                Scanner sc = new Scanner(System.in);
                System.out.print("Please input name : ");
                this.setName(sc.nextLine());

                System.out.print("Please input age : ");
                this.setAge(sc.nextInt());

                this.setInfo("Hello " + name + ", age = " + age);
                resp.setValue(getInfo());

                sc.close();
                break;
            default :
                System.out.println("Not Support");
                break;
        }return resp;
    }
}
```
</details>

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import java.util.HashMap;
import java.util.Map;

import th.go.dsd.util.AppRunner;
import th.go.dsd.util.Calc;
import th.go.dsd.util.CallParam;
import th.go.dsd.util.CallResponse;
import th.go.dsd.util.Car;
import th.go.dsd.util.Echo;
import th.go.dsd.util.MyInput;
import th.go.dsd.util.Truck;

public class Application {

    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        Map<String, AppRunner> feature = new HashMap<>();
        feature.put("calc", new Calc());
        feature.put("echo", new Echo());
        feature.put("car", new Car());
        feature.put("truck", new Truck());
        feature.put("myinput", new MyInput());

        if(feature.containsKey(cmd1.getCommand())){
            AppRunner cmd = feature.get(cmd1.getCommand());
            CallResponse resp = cmd.runCommand(cmd1);
            System.out.println(resp.getValue());
        }else{
            System.out.println("Not support this command " + cmd1.getCommand());
        }
    }
}
```
</details>

---