package th.go.dsd.app;

public class MyException {
    void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied");
        }else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        try{
            MyException my = new MyException();
            my.checkAge(15);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }    
}