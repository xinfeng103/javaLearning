import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Chapter4 {
    public static void main(String[] args) {
        date();
    }

    public static void date() {
        System.out.println(new Date());
        System.out.println(new Date().toString());
//        var birthday = new Date();
        Date birthday = new Date();
        System.out.println(birthday);

        System.out.println(LocalDate.now());
        LocalDate date = LocalDate.of(2021, 4, 15);
        int year = date.getYear();
        System.out.println(year);
        LocalDate date1=date.plusDays(10);
        System.out.println(date1.getDayOfMonth());
    }
}
