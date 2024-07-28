import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
     LocalDate myObj = LocalDate.now(); //Creating a date object
        System.out.println("Current Date is: "+myObj);

        LocalTime myObj1 = LocalTime.now(); //Creating a time object
        System.out.println("Current Time is: "+myObj1);

        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println("Current Date and Time is: "+myObj3);

        System.out.println("");
        System.out.println("Formatting in Date and Time:");
        //Formatting in date and time
        LocalDateTime myObj4 = LocalDateTime.now();
        System.out.println("Before formatting: "+myObj4);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myObj4.format(myFormatObj);
        System.out.println("After formatting: "+formattedDate);
    }
}
