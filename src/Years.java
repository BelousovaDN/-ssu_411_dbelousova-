import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Пользователь on 17.01.2016.
 */
public class Years
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        int current = calendar.get(Calendar.YEAR);
        System.out.println("Current year: " + current);
        Scanner scanner = new Scanner(System.in);
        int month = -1;

        do
        {
            System.out.print("Enter number month (0-11): ");
            try
            {
                month = Integer.parseInt(scanner.next());
            }
            catch (NumberFormatException e)
            {
            }
        }
        while (month < 0 || month > 11 );

        int count = 0;
        for (int i=1800; i<current; i++)
        {
            calendar.set(i, month, 13);
            if (calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US)== "Friday")
            {
                count ++;
                System.out.println(calendar.get(Calendar.YEAR));
            }
        }
        System.out.print("Number of years: " + count);
    }
}
