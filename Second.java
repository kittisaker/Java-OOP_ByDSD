public class Second {
    public static void main(String[] args){

        // Obj 1
        MyClass obj1 = new MyClass(20);
        System.out.println(obj1.age);
        obj1.age = 34;
        obj1.getAge();

        // Obj2
        MyClass obj2 = new MyClass(46);
        obj2.getAge();
    }
}
