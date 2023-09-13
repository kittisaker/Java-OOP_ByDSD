package th.go.dsd.app;
public class MyClass{

    private int age = 18;
    private String name = "";

    MyClass(){
        
    }

    MyClass(int age, String name){
        this.age = age;
        this.name = name;
    }

    MyClass(int age){
        System.out.println("This is constructor");
        this.age = age;
    }

    
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

}