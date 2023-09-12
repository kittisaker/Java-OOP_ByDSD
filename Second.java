public class Second {
    public static void main(String[] args){
        MyClass obj = new MyClass(20);
        
        int age = obj.age;
        System.out.println("age : " + age);

        obj.age = 34;
        obj.getAge();

        MyClass obj2 = new MyClass(46);
        
        String title = obj2.getTitle();
        System.out.println("title : " + title);
    }
}
