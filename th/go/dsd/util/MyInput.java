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
