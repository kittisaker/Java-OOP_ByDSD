package th.go.dsd.util;

public class MyStringFunction {
    public static void main(String[] args) {
        StringFunction s1 = (s) -> s + "!";
        printFormated("Hello", s1);
    }

    public static void printFormated(String str, StringFunction fnc){
        String rest = fnc.run(str);
        System.out.println(rest);
    }
}
