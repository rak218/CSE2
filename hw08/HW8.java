// Ravi Kurtz
// 10-28-2014
//  forces user to enter specific characters
import java.util.Scanner;
public class HW8
{
    
    public static void main(String[]args)
    {
      char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	if(input=='C'||input=='c')
	{
	    System.out.println("You entered '"+input+"'");
	}
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  

 
  

    public static char getInput(Scanner inp, String C)
    {
    int character=0;
    String user=inp.next();
    if(user.length()>1)
    {
        System.out.println("did not enter one character");
        return user.charAt(0);
    }
    while(character<C.length()&&user.charAt(0)!=C.charAt(character))
    {
        character++;
    }
    if(character==C.length())
    {
        System.out.println("wrong input try again");
        return user.charAt(0);
    }
    else
    {
        return user.charAt(0);
    }
    
    }
    public static char getInput(Scanner inp,String C,int x)
    {
        char input;
        int count=x;
        while(count>0)
        {
        input=getInput(inp,C);
        System.out.println(input);
        for(int i=0;i<4;i++)
        {
            if(input==C.charAt(i))
            {
                return input;
            
            
            }
            else
            {
            System.out.print("You did not enter a character from the list 'yYnN'; try again-");
            inp=new Scanner(System.in);
            System.out.println();
            
            }
            count--;
        }
        System.out.println("you failed after 5 tries");
        return ' ';
        
        }
        return ' ';
    }
    public static char getInput(Scanner inp,String prompt,String C)
    {
        System.out.print(prompt+C+" ");
        int character=0;
    String user=inp.next();
    if(user.length()>1)
    {
        System.out.println("did not enter one character");
        return user.charAt(0);
    }
    while(character<C.length()&&user.charAt(0)!=C.charAt(character))
    {
        character++;
    }
    if(character==C.length())
    {
        System.out.println("wrong input try again");
        return user.charAt(0);
    }
    else
    {
        return user.charAt(0);
    }
    
    
    }
}