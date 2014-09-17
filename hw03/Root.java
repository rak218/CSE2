// Ravi Kurtz
// 9-15-2014
// Root java
//Guesses the cubed root of a number
import java.util.Scanner;
public class Root
{
    public static void main(String [] args)
    {
        System.out.print(" Enter a number: ");
        Scanner myScanner= new Scanner(System.in);
        double num=myScanner.nextDouble();// takes in number from user
        double guess= num/3;
        for(int i=0;i<5;i++)       
        {
            guess=((2*guess*guess*guess+num)/(3*guess*guess));
        }

        
        System.out.println("the cubed root is: " + guess);
    }
}