// Ravi Kurtz
// 9-23-14
// Takes in seconds passed in a day and returns time
import java.util.Scanner;
public class TimePadding
{
    public static void main(String[]args)
    {
        int seconds=0;
        int minutes=0;
        int hours=0;
        System.out.print("Enter number of seconds: ");
        Scanner myScanner=new Scanner(System.in);
        if(myScanner.hasNextInt())
        {
            seconds=myScanner.nextInt();
            if(seconds>0)
            {
                while(seconds>=3600) //loop that runs untill there is not enough seconds to make an hour, adds an hour each loop
                {
                    seconds-=3600;
                    hours++;
                }
                while(seconds>=60) //loop that runs untill there is not enough seconds to make a minute, adds a minute each loop
                {
                    seconds-=60;
                    minutes++;
                }
                if(hours>0)//prints hours
                {
                    System.out.print(hours+" : ");
                }
                 if (minutes>0&&minutes<10)//makes sure minutes are padded,prints minutes
                {
                    System.out.print("0"+minutes+" : ");
                }
                else if(minutes>9)
                {
                    System.out.print(minutes+" ");
                }
                if(seconds<10&&seconds>0)// makes sute seconds are padded,prints seconds
                {
                    System.out.println("0"+seconds+".");
                }
                else if(seconds>10)
                {
                    System.out.println(seconds+".");
                }
            }
            else
            {
                System.out.println("you did not enter a positive integer");// informs user of mistake
            }
        }
        else
        {
            System.out.println("you did not enter an integer");//informs user of mistake
        }
    }
}