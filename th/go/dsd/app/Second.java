package th.go.dsd.app;
import java.util.ArrayList;
public class Second {
    public static void main(String[] args){

        // Obj 1
        MyClass obj1 = new MyClass(20);
        obj1.getAge();

        // Obj2
        MyClass obj2 = new MyClass(46);
        obj2.getAge();

        // Obj3
        MyClass obj3 = new MyClass(24, "John");
        obj3.getAge();

        ArrayList<MyClass> ls = new ArrayList<>();
        ls.add(obj1);
        ls.add(obj2);
        ls.add(obj3);
        ls.size();
    }
}
