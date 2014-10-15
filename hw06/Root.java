// Ravi Kurtz
// 10/14/2014
// Find the square root of a number
import java.util.Scanner;
public class Root
{
    public static void main(String[]args)
    {
        double x=0;
        double high=x+1;
        double low=0;
        double difference=0.0000001;
        Scanner myScanner=new Scanner(System.in);
        if (myScanner.hasNextDouble()|| myScanner.hasNextInt())
        {
            x=myScanner.nextDouble();
        }
        else
        {
            System.out.println("Did not enter a number");
            return;
        }
        while((high-low)>difference)
        {
            double middle=(high+low)/2;
            if(middle*middle>x)
            {
                high=middle;
            }
            else
            {
                low=middle;
            }
        }
        System.out.println(high+" +- "+difference+high+" "+low);
    }
}