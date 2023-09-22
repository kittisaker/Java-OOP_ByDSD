package th.go.dsd.util;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<>();
        
        capitalCities.put("England", "London");

        for(String i : capitalCities.keySet()){
            System.out.print(i);
        }

        for(String i : capitalCities.values()){
            System.out.println(i);
        }
    }
       
}
