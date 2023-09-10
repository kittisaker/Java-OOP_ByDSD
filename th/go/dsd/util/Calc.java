package th.go.dsd.util;

public class Calc {
    public static void add(int num_01, int num_02){
        System.out.println("Value = " + (num_01 + num_02));
    }

    public static double add(double num_01, double num_02){
        return (num_01 + num_02);
    }

    public static double add(double num_01){
        return (num_01);
    }

    public static void sum(int arr[]){
        int result = 0;
        for(int ar : arr){
            result += ar;
        }
        System.out.println("Value = " + result);
    }
    public static void main(String[] args) {

        int num_01 = 0, num_02 = 0;
        int len = args.length;
        System.out.println("Len = " + len);

        switch(args[0]){
            case "add":
                num_01 = (len >= 2) ? Integer.parseInt(args[1]) : 0;
                num_02 = (len >= 3) ? Integer.parseInt(args[2]) : 0;
                add(num_01, num_02);
                break;
            case "sum":
                int nums[] = new int[len];
                for(int i = 1; i < len; i++){
                    // System.out.println("i = " + i);
                    nums[i - 1] = Integer.parseInt(args[i]);
                    // System.out.println("Nums = " + nums[i - 1]);
                }
                sum(nums);
                break;
            default:
                System.out.println("Not Support");
        }
    }
}
