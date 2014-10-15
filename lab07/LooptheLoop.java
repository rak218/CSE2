// Ravi Kurtz
// 10/8/2014
// Loop the Loop- prints a particular pattern of stars
import java.util.Scanner;
public class LooptheLoop
{
    public static void main(String[]args)
    {
        int nStars=10;
         for (int i=0;i<nStars;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<nStars;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    while(true)
    {
        System.out.print("Enter an integer between 1 and 15-");
        Scanner myScanner=new Scanner(System.in);
        if(myScanner.hasNextInt())
        {
            nStars=myScanner.nextInt();
            if(nStars>0&&nStars<16)
            {
                for (int m=0;m<nStars;m++)
                {
                    System.out.print("*");
                }
                System.out.println();
                 for(int i=0;i<nStars;i++)
                {
                    
                    for(int j=0;j<i+1;j++)
                    {
                        System.out.print("*");
                
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Your integer is not in range");
            }
            
        }
        else 
        {
            System.out.println("you did not enter an integer");
        }
        Scanner input=new Scanner(System.in);
        System.out.println(" Do you want to continue(Y/y)-");
        String answer=input.next();
        if(answer.equals("y")||answer.equals("Y"))
        {
            System.out.println();
        }
        else
        {
            break;
        }
    }
       
    }
}
