// Ravi Kurtz
// 10-22-14
// uses methods to order 3 integers from largest to smallest
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	if(scan.hasNextInt())
	{
	a=getInt(scan.nextInt());}
		else
	{
	    System.out.println("did not enter an integer");
	    a=0;
	    b=0;
	    c=0;
	    return;
	}
    if(scan.hasNextInt())
	{
	b=getInt(scan.nextInt());}
		else
	{
	    System.out.println("did not enter an integer");
	    a=0;
	    b=0;
	    c=0;
	    return;
	}
	if(scan.hasNextInt())
	{
	c=getInt(scan.nextInt());
	}
	else
	{
	    System.out.println("did not enter an integer");
	    a=0;
	    b=0;
	    c=0;
	    return;
	}
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
  }
 

    
    public static int getInt(int x)
    {
        int a=x;
        return a;
    }
    public static int larger(int x, int y)
    {
        if(x>y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    public static boolean ascending(int a, int b, int c)
    {
        if(a<=b&&b<=c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}