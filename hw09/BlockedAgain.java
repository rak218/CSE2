// Ravi Kurtz
//11-4-2014
// creates pattern  using meathods
import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);
}
public static int getInt()
{
    System.out.println("enter an integer between 1 and 9, inclusive");
    Scanner myScanner=new Scanner(System.in);
    int x;
    if(!checkInt(myScanner))
    {
        System.out.println("did not enter integer, try again");
        return 0;
        
        
    }
    else
    {
        x=checkRange(myScanner);
        return x;
        
    }
}
public static boolean checkInt(Scanner reader)
{
    if (reader.hasNextInt())
    {
        return true;
    }
    else
    {
        return false;
    }
    
}
public static int checkRange(Scanner newScanner)
{
    int num=newScanner.nextInt();
    if(num>0 && num<10)
    {
        return num;
    }
    else
    {
        System.out.println("number not in range");
        return 0;
    }
}
public static void allBlocks(int var)
{
   int maxRow=var;
    for(int row=1;row<var+1;row++)
    {
        Block(row,maxRow);
    }
}
public static void Block(int x, int y)
{
    int row=x;
    int maxRow=y;
    for(int i=0;i<row;i++)
    {
        Line(row,maxRow);
    }
    Dash(row,maxRow);
}
public static void Line(int a, int b)
{
    int row=a;
    int maxRow=b;
    for(int j=maxRow-row;j>0;j--)
    {
        System.out.print(" ");
    }
    for(int i=0;i<2*row-1;i++)
    {
        System.out.print(row);
    }
    System.out.println();
    
}
public static void Dash(int a, int b)
{
    int row=a;
    int maxRow=b;
    for(int j=maxRow-row;j>0;j--)
    {
        System.out.print(" ");
    }
    for(int i=0;i<2*row-1;i++)
    {
        System.out.print("-");
    }
    System.out.println();
}


}
