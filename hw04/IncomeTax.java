// Ravi Kurtz  
// 9-21-2014
// catogorizes incomes and applies proper income tax
import java.util.Scanner;
public class IncomeTax
{
    public static void main(String[]args)
    {
        double tax;
        int income;
        System.out.print("Enter income as number of thousands of dollars greater than 0 (xx): ");
        Scanner myScanner= new Scanner(System.in);
        if(myScanner.hasNextInt())
        { 
            income=myScanner.nextInt();
            if(income<1)
                 {
                     System.out.println("you did not enter a number greater than 0");//informs user of error
                 }
            else if(income<20) // divides income into brackets and applies proper tax
                {
                    tax=.05;
                    System.out.println("the tax is " +(int)(tax*100)+ "% and the amount due is $"+ ((int)(tax*income*100000))/100.00);
                }
            else if(income<40)
                {
                    tax=.07;
                    System.out.println("the tax is " + (int)(tax*100)+ "% and the amount due is $"+ ((int)(tax*income*100000))/100.00);
                }
            else if(income<78)
                {
                    tax=.12;
                    System.out.println("the tax is " + (int)(tax*100)+ "% and the amount due is $"+ ((int)(tax*income*100000))/100.00);
                }
            else if(income>78)
                {
                    tax=.14;
                    System.out.println("the tax is " + (int)(tax*100)+ "% and the amount due is $"+ ((int)(tax*income*100000))/100.00);
                }
        
        }
        else
        System.out.println("you did not enter an integer");// informs user of error
    }
}