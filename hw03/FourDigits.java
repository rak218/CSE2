//Ravi Kurtz
//9-16-14
// 4 digits
//returns the first four digits after a decimal point
import java.util.Scanner;
public class FourDigits
{
    public static void main (String[]args)
    {
        System.out.print("Enter your number :");
        Scanner myScanner=new Scanner(System.in);
        double num= myScanner.nextDouble();
        double newNum= num-((int)num);// isolated decimal
        newNum*=10000;//turns to 
        if(newNum<10)
        System.out.print("000");
        else if(newNum<100)
        System.out.print("00");
        else if(newNum<1000)
        System.out.print("0");
        System.out.print(Math.round(newNum));
    }
}