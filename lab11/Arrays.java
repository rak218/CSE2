// Ravi Kurtz
// 11/5/2014
// Searches through an array and manipulates it
import java.util.Scanner;
public class Arrays
{
    public static void main(String[]args)
    {
        int[]numList=new int[10]; // creates an array for 10 integers
        Scanner myScanner=new Scanner(System.in);
        
        for(int i=0;i<10;i++)
        {
            System.out.println("add " +(10-i)+ " more integers to list");// prompts user to enter an int 10 times
            numList[i]=myScanner.nextInt(); // creates list of integers that the user entered
        }
        int maxVal=0;
        int sum=0;
        int minVal=numList[0];
        for(int i=0;i<numList.length;i++)
        {
            if(maxVal<numList[i]) // finds and assigns the largest integer entered
            {
                maxVal=numList[i];
            }
            if(minVal>numList[i]) // finds and assigns the smallest integer entered
            {
                minVal=numList[i];
            }
            sum+=numList[i]; // finds the sum of all the integers entered
        }
        System.out.println("The Maximum value is " +maxVal+" The minimum values is " +minVal+" The sum of the integers is "+sum); // organizes and prints information
        int[]reverseList=new int[numList.length]; // creates a new list that is the same size as numList
        for(int i=numList.length-1;i>-1;i--)
        {
            for(int j=0;j<numList.length-i;j++)
            {
                reverseList[i]=numList[j]; // initializes reverseList to be an exact replica of numList but in reverse order
            }
        }
        for(int i=0;i<numList.length;i++)
        {
            System.out.print(numList[i]+" "+reverseList[i]); // prints both lists next to eachother, vertically
            System.out.println();
        }
        
        
        
    }
}