package th.go.dsd.app;

public class Main {
    enum Level{
        LOW,
        MEDIUM,
        HEIGHT
    }
    enum Status{
        ACTIVE,
        INACTIVE
    }
    public static void main(String[] args) {
        Status s = Status.ACTIVE;

        if(s == Status.ACTIVE){
            System.out.println(s);
        }
    }
}
