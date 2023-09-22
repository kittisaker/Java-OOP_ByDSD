package th.go.dsd.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateTime {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now(); // .now() : public static
        System.out.println("Before format = " + myDateObj);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateWithFormat = myDateObj.format(dtf);
        System.out.println(dateWithFormat);
    }


}
