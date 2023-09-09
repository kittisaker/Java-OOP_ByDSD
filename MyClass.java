public class MyClass{

    MyClass(int age){
        System.out.println("In constructor");
        this.age = age;
    }

    int age = 18;

    void getAge(){
        int age = 5;
        System.out.println(this.age);
    }

    String getName(){
        this.getAge();
        return "Name and age = ";
    }
}