# OOP : Chapter 5

## Interfaces
* Another way to achieveabstractionin Java, is with interfaces.
* Aninterfaceis a <b>completely "abstract class"</b> that is used to group related mothods with empty bodies.
* To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the <b>implements</b> keyword (instead of extends).
* The body of the interface method is provide by the "implement" class.


<details>
<summary>AppRunner.java</summary>

```java
package th.go.dsd.util;

// public abstract class AppRunner {
//     public abstract CallResponse runCommand(CallParam param);
// }
public interface AppRunner {                            // < -- Interface
    public CallResponse runCommand(CallParam param);
}
```
</details>

<details>
<summary>Echo.java</summary>

```java
package th.go.dsd.util;

public class Echo implements AppRunner{            // <-- original : public class Echo extends AppRunner{
    public String say(String arg){
        return arg;
    }

    @Override               // <-- Error with : public class Echo extends AppRunner{
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();
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
<summary>Calc.java</summary>

```java
package th.go.dsd.util;

import java.util.ArrayList;

public class Calc implements AppRunner{    // <-- original : public class Calc extends AppRunner{
    public int add(int a, int b){   
        return a + b;
    }

    public int sum(ArrayList<Integer> x){
        int sum = 0;
        for(int i = 0; i< x.size(); i++){
            sum += x.get(i);
        }
        return sum;
    }

    @Override // <-- Error with : original : public class Calc extends AppRunner{
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

## Workshop (From last time) : Interface

```
Case 4
java th.go.dsd.app.Application car info
output : Mustang

Case 5
java th.go.dsd.app.Application truck info
output : Hino
```

<details>
<summary>Vehicle.java (abstract class)</summary>

```java
package th.go.dsd.util;

public abstract class Vehicle {
    protected String brand = "Ford";            

    public void honk(){
        System.out.println("Tuut Tuut !!");
    }

    abstract public String getInfo();                 
    abstract public String sayHi();
}
```
</details>

<details>
<summary>Car.java (class Car extends Vehicle implements AppRunner)</summary>

```java
package th.go.dsd.util;

public class Car extends Vehicle implements AppRunner{
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String brand() {           
        return this.brand;
    }

    public void honk(){
        super.honk();
        System.out.println("Beep Beep !!");
    }

    public String getInfo(){        // <--
        return this.modelName;
    }

    public String sayHi(){
        return "Hello";
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();     // <-- 
        switch(param.getSubCommand()){
            case "info" :
                resp.setValue(getInfo());
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
<summary>Truck.java (class Truck extends Vehicle implements AppRunner)</summary>

```java
package th.go.dsd.util;

public class Truck extends Vehicle implements AppRunner{
    @Override
    public String getInfo() {
        return "Hino";
    }

    @Override
    public String sayHi() {
        return "Hi from my truck";
    }

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse(); // <-- 
        switch(param.getSubCommand()){
            case "info" :
                resp.setValue(getInfo());
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
import th.go.dsd.util.Car;
import th.go.dsd.util.Echo;
import th.go.dsd.util.Truck;

public class Application {

    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        Map<String, AppRunner> feature = new HashMap<>();
        feature.put("calc", new Calc());
        feature.put("echo", new Echo());
        feature.put("car", new Car());
        feature.put("truck", new Truck());

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

### Test case more : Not implement at child class but implements at parent class

<details>
<summary>Vehicle.java (abstract class Vehicle implements AppRunner)</summary>

```java
package th.go.dsd.util;

public abstract class Vehicle implements AppRunner{
    protected String brand = "Ford";            

    public void honk(){
        System.out.println("Tuut Tuut !!");
    }

    abstract public String getInfo();                 
    abstract public String sayHi();

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse resp = new CallResponse();     // <-- 
        switch(param.getSubCommand()){
            case "info" :
                resp.setValue(getInfo());
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
<summary>Car.java (class Car extends Vehicle)</summary>

```
package th.go.dsd.util;

public class Car extends Vehicle{
    private String modelName = "Mustang";

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String brand() {           
        return this.brand;
    }

    public void honk(){
        super.honk();
        System.out.println("Beep Beep !!");
    }

    public String getInfo(){        // <--
        return this.modelName;
    }

    public String sayHi(){
        return "Hello";
    }
}
```
</details>

<details>
<summary>Truck.java (class Truck extends Vehicle)</summary>

```
package th.go.dsd.util;

public class Truck extends Vehicle{
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

---
