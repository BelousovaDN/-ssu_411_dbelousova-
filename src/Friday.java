import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Пользователь on 17.01.2016.
 */
public class Friday
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        do
        {
            System.out.print("Enter year (1800-2020): ");
            try
            {
                year = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e)
            {
            }
        }
        while (year <= 1800 || year >= 2020 );
        Calendar calendar = Calendar.getInstance();
        for (int i=0; i<12; i++)
        {
            calendar.set(year, i, 13);
            if (calendar.getDisplayName(calendar.DAY_OF_WEEK, calendar.LONG, Locale.US)== "Friday")
            {
                System.out.println(calendar.getDisplayName(calendar.MONTH, calendar.LONG, Locale.US));
            }
        }
    }
}