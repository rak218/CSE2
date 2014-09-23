// Ravi Kurtz
// 9-10-14
// lab-03 Big Mac
// computes cost of buying big macs
import java.util.Scanner;
public class BigMac
{
    public static void main(String[]args)
    {
        // Takes number of big macs from user
        Scanner myScanner=new Scanner(System.in);
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int numBigMacs=myScanner.nextInt();
        // Takes Price per Big Mac from User
        System.out.print("Enter the price of Big Macs as a double in the form of (xx.xx): ");
        double bigMac$=myScanner.nextDouble();
        // Takes Tax as a whole number
        System.out.print("Enter percent tax as a whole number (xx)");
        double taxRate=myScanner.nextDouble();
        taxRate/=100;// converts tax to a decimal
       bigMac$*=numBigMacs;
        bigMac$+=bigMac$*taxRate;
        int dollars= (int)bigMac$; // finds whole dollars
        int dimes=(int)
        (bigMac$*10)%10;// finds number of dimes
        int pennies=(int)(bigMac$*100)%100;// finds number of pennies
        System.out.println("The total cost of " + numBigMacs + " Big Macs at "+ "a sales tax of " + (int)(taxRate*100)+("%")+(" and costs ") + dollars+"."+(dimes)+(pennies));
        
    }
    //end of main method
}
//end of class