# OOP : Chapter 4

## Abstract Classes and Methods
- Data abstraction is the process of hiding certain details and showing only essential information to the user.
- Abstraction can be achieved with either abstract classes or interfaces.
- The abstract keyword is a non-access modifier, used for classes and methods :

<details>
<summary>Vehicle.java (Abstract class)</summary>

```java
package th.go.dsd.util;

public abstract class Vehicle {                 //  abstract class
    protected String brand = "Ford";            

    //  abstract method
    abstract public String getInfo();                  
    abstract public String sayHi();
}
```
</details>

<details>
<summary>Vehicle.java (Child class)</summary>

```java
package th.go.dsd.util;

public class Car extends Vehicle {          // exteds
    private String modelName = "Mustang";

    public String getInfo(){                // <--
        return this.modelName;
    }

    public String sayHi(){
        return "Hello";
    }
}
```
</details>

<details>
<summary>Truck.java (Child class)</summary>

```java
package th.go.dsd.util;

public class Truck extends Vehicle{
    // @Override is inotation
    @Override
    public String getInfo() {
        return "Hino";
    }

    @Override
    public String sayHi() {
        return "Hi from my truck";
    }
    
}
```
</details>

<details>
<summary>Application.java (Main)</summary>

```java
package th.go.dsd.app;

import java.util.ArrayList;
import java.util.List;

import th.go.dsd.util.Car;
import th.go.dsd.util.Truck;
import th.go.dsd.util.Vehicle;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> ver = new ArrayList<>();  // List<Car> ver --> List<Vehicle> ver
        
        Vehicle myCar = new Car();          //  Can use Vehicle myCar = new Car(); , But can't new Vehicle(); , Because It's abstract class
        // System.out.println(myCar.getInfo());
        Truck myTruck = new Truck();

        ver.add(myCar);
        ver.add(myTruck);

        showInfo(ver);
    }

    static void showInfo(List<Vehicle> verList){    // Call Abstract class
        for(Vehicle v : verList){
            System.out.println(v.getInfo());
        }
    }
}
```
</details>


## Workshow CLI(Command Line Interface)
```
> java th.go.dst.app.Application calc sum 1 2 4 5 6
```
<pre>
* th.go.dst.app.Application : main aplication
* calc                      : command
* sum                       : sub command
* 1 2 4 5 6                 : option
</pre>

Case test
```
Case 1
> java th.go.dst.app.Application calc add 1 2
output : Value = 3

Case 2
> java th.go.dst.app.Application calc sum 1 2 3 4 5 6
output : Value = 18
```

### Step 1

* Create CallParam class.
```
class CallParam {
    private String command;
    private String subCommand;
    private String[] option;

    // Space for Constructor class

    //Space for JavaBeans
}
```

<details>
<summary>CallParam.java</summary>

```java
package th.go.dsd.util;

public class CallParam {
    private String command;
    private String subCommand;
    private String[] option;

    public CallParam(String[] args){
        int len = args.length;
        this.command = len > 0 ? args[0]: "Not Support";
        this.subCommand = len > 1 ? args[1] : "No Subcommand";
        if(len > 2){
            this.option = new String[len - 2];
            System.arraycopy(args, 2, this.option, 0, len - 2);
        }
    }

    // Auto generate 
    public String getCommand() {
        return command;
    }
    public void setCommand(String command) {
        this.command = command;
    }
    public String getSubCommand() {
        return subCommand;
    }
    public void setSubCommand(String subCommand) {
        this.subCommand = subCommand;
    }
    public String[] getOption() {
        return option;
    }
    public void setOption(String[] option) {
        this.option = option;
    }
}
```
</details>

<details>
<summary>Application.java</summary>

```java
package th.go.dsd.app;

import th.go.dsd.util.CallParam;

public class Application {

    public static void main(String[] args) {
        // >java th.go.dst.app.Application calc add 1 2
        // output : Value = 3

        CallParam cmd1 = new CallParam(args);
        
        System.out.println(cmd1.getCommand());
        System.out.println(cmd1.getSubCommand());
        if(cmd1.getOption() != null){
            for(String option : cmd1.getOption()){
                System.out.println(option);
            }
        }
    }
}
```
</details>

### Step 2

* Create CallResponse class

```
class CallResponse{
    String value;

    // Space for JavaBeans
}
```

<details>
<summary>CallResponse.java</summary>

```java
package th.go.dsd.util;

public class CallResponse {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
```
</details>
</br>

* Create AppRunner abstract class

```
public abstract class AppRunner{
    public abstract CallResponse runCommand(CallParam param);
}
```

<details>
<summary>AppRunner.java</summary>

```java
package th.go.dsd.util;

public abstract class AppRunner {
    public abstract CallResponse runCommand(CallParam param);
}
```
</details>

## Step 3

* Create Calc class
<details>
<summary>Calc.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;

public class Calc extends AppRunner{
    public int add(int a, int b){   // You can change public to private
        return a + b;
    }

    public int sum(ArrayList<Integer> x){
        int sum = 0;
        for(int i = 0; i< x.size(); i++){
            sum += x.get(i);
        }
        return sum;
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        switch(param.getSubCommand()){
            case "add" :
                if(param.getOption() != null){
                    String[] opts = param.getOption();
                    int len = opts.length;
                    int a = len > 0 ? Integer.parseInt(opts[0]) : 0;
                    int b = len > 1 ? Integer.parseInt(opts[1]) : 0;
                    int c = add(a, b);
                    resp.setValue("Value = " + c);
                }
                break;
            case "sum" :
                    resp.setValue("Not implement");
                break;
            default:
            break;
        }
        return resp;
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

public class Application {

    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        Map<String, AppRunner> feature = new HashMap<>();
        feature.put("calc", new Calc());

        if(feature.containsKey(cmd1.getCommand())){
            // logic here
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

```
> javac th/go/dsd/app/Application.java

> java th.go.dsd.app.Application calc add 1 2 
Value = 3

> java th.go.dsd.app.Application calc sum 1 2 
Not implement
```

### Step 4
```
Case 2
>java th.go.dst.app.Application calc sum 1 2 3 4 5 6
output : Value = 18

Case 3
>java th.go.dst.app.Application echo say Jame
output : Hello Jame
```

<details>
<summary>Echo.java</summary>

```java
package th.go.dsd.util;

public class Echo extends AppRunner{
    public String say(String arg){
        return arg;
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
        // logic
        switch(param.getSubCommand()){
            case "say" :
                if(param.getOption() != null){
                    String[] opts = param.getOption();
                    String result = "";
                    for(String o : opts){
                        result += say(o).concat(" ");
                    }
                    resp.setValue("Hello " + result);
                }
                break;
            default :
                break;
        }
        return resp;
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
import th.go.dsd.util.Echo;

public class Application {

    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        Map<String, AppRunner> feature = new HashMap<>();
        feature.put("calc", new Calc());
        feature.put("echo", new Echo());

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