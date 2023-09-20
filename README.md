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

---

## 

<details>
<summary>.java</summary>

```

```
</details>

---