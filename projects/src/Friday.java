import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by contest on 15.01.2016.
 */
public class Friday {
   public static void main(String[]args) {
       Calendar calendar = Calendar.getInstance();
       System.out.println(calendar.getTime());
       calendar.set(Calendar.MONTH,0);
       calendar.set(Calendar.DAY_OF_MONTH, 13);
       System.out.println(calendar.getTime());
       String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);//??????? ???? ??????
       System.out.println(day);
       Scanner scanner = new Scanner(System.in);
       System.out.println("enter n:");
       int n =  Integer.parseInt(scanner.nextLine());
       System.out.println("n: " + (n-10));

    }

}
