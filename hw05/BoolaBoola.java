// Ravi Kurtz
// 9-30-14
// makes logic practice problems
import java.util.Scanner;
public class BoolaBoola
{
    public static void main(String[]args)
    {
        String bool1 // Strings wil be used to create question for user
        String bool2;
        String bool3;
        String comp1;
        String comp2;
        boolean B1;// booleans will be used for the computer to find the correct answer
        boolean B2;
        boolean B3;
        boolean correctAnswer; // 
        if(1==(int)(Math.random()*2))// randomely creates true and false statements
        {
            bool1=" true ";
            B1=true;
            
        }
        else
        {
            bool1=" false ";
            B1=false;
        }
         if(1==(int)(Math.random()*2))
        {
            bool2=" true ";
            B2=true;
        }
        else
        {
            bool2=" false ";
            B2=false;
        }
         if(1==(int)(Math.random()*2))
        {
            bool3=" true ";
            B3=true;
        }
        else
        {
            bool3=" false ";
            B3=false;
        }
         if(1==(int)(Math.random()*2))// assigns operaters and tests first half of statement
        {
            comp1="&&";
            correctAnswer=B1&&B2;
        }
        else
        {
            comp1="||";
            correctAnswer=B1||B2;
        }
         if(1==(int)(Math.random()*2))
        {
            comp2="&&";
            correctAnswer=correctAnswer&&B3;
        }
        else
        {
            comp2="||";
            correctAnswer=correctAnswer||B3;
        }
        System.out.print("does " + bool1+comp1+bool3+comp2+bool2 +" return true(T/t) or false(F/f)?");
        Scanner myScanner=new Scanner(System.in);
        String answer=myScanner.next();
        if (answer.equals("t")||answer.equals("T"))// tests for correct answer
        {
            if(correctAnswer)
            {
                System.out.println("Correct");
            }
            else
            {
                System.out.println("Wrong, try again");
            }
        }
        else if(answer.equals("f")||answer.equals("F"))
        {
            if(correctAnswer)
            {
                System.out.println("Wrong, try again");
                
            }
            else
            {
                System.out.println("Correct");
            }
        }
        else
        {
            System.out.println("Wrong,try again");
        }
        
        
    }
}