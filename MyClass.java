public class MyClass{

    MyClass(int age){
        System.out.println("This is constructor");
        this.age = age;
    }

    int age = 18;
    void getAge(){
        System.out.println(this.age);
    }
    
    String getName(){
        return "Name and age : ";
    }

    String getTitle(){
        return "Hello World";
    }

}