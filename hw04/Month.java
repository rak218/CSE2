// Ravi Kurtz
// 9-21 14
// Returns number of days in a given month
import java.util.Scanner;
public class Month
{
    public static void main(String[]args)
    {
        int month;
        System.out.print("Enter a month(1-12)");
        Scanner myScanner=new Scanner(System.in);
        if(myScanner.hasNextInt())
        {
            month=myScanner.nextInt();
            if(month<1||month>12)// ensures valid month
            {
                System.out.print("invalid month");
            }
            else if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))// checks for months w/ 31 days
            {
                System.out.println("the month has 31 days");
            }
            else if(month==2)// prints days in febuary, accounts for leap year
            {
                int year;
                System.out.print("Enter the year: ");
                Scanner kbScanner=new Scanner(System.in);
                if(kbScanner.hasNextInt())
                {
                    year=kbScanner.nextInt();
                    if((year%100)!=0&&(year%4)==0)
                    {
                        System.out.println("The month has 29 days");
                    }
                    else if((year%100)==0&&(year%400)==0)
                    {
                        System.out.println("the month has 29 days");
                    }
                    else
                    {
                        System.out.println("the month has 28 days");
                    }
                }
                else
                {
                   System.out.println("entered invalid year");
                }
                
            }
                else// all other months have 30 days
                {
                    System.out.println("the month has 30 days");
                }
        }
        else
        {
            System.out.println("Did not enter an integer");// informs user of error
        }
        
    }
}