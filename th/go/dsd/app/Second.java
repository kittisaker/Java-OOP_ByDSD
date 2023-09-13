package th.go.dsd.app;
import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass(20);
        System.out.println(obj.getAge());

        MyClass obj2 = new MyClass(46);
        System.out.println(obj2.getAge());

        MyClass obj3 = new MyClass(4246);
        System.out.println(obj3.getAge());

        ArrayList<MyClass> ls = new ArrayList();
        ls.add(obj);
        ls.add(obj2);
        ls.add(obj3);
        ls.size();
    }
}
