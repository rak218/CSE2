// Ravi Kurtz
// 9-17-14
// takes in number of burgers
import java.util.Scanner;
public class BigMacAgain
{
    public static void main(String[]args)
    {
        String answer;
        int numBigMacs;
        double BigMac$=2.22;
        double friesCost=2.15;
        System.out.print(" Enter the number of big macs you want to order as an integer greater than 0: ");
        Scanner myScanner= new Scanner(System.in);
             if(myScanner.hasNextInt())
                  {
                    numBigMacs=myScanner.nextInt();
                        if(numBigMacs>0)
                         {
                             BigMac$*=numBigMacs;
                             BigMac$=(double)((int)(BigMac$*100))/100;
                            System.out.println("You orderd " +numBigMacs+" Big Macs for a cost of $"+BigMac$);
                        
                         }
                  }
        else
        System.out.println("You need to enter a positive integer");
        
       System.out.print("Do you want fries? (Y/y or N/n) ");
       Scanner fryScanner=new Scanner(System.in);
       if(fryScanner.hasNext())
      {
          answer=fryScanner.next();
        if(answer.equals("y")|| answer.equals("Y"))
        {
            System.out.println("Your fries cost " + friesCost+".");
            System.out.println("Your total cost is " + (friesCost+BigMac$)+".");
        }
        
        
        else if(answer.equals("n")||answer.equals("N"))
             System.out.println(" Your total cost is $" + BigMac$+".");
        else 
            System.out.println ("Entered invalid answer");
        
      }
        else
            System.out.println("You did not enter a valid answer");
        
        
    }
}