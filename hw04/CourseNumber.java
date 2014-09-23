// Ravi Kurtz
// 9-22 2014
// returns the year and semester of a class number
import java.util.Scanner;
public class CourseNumber
{
    public static void main(String[]args)
    {   int courseNum;
        int semesterYear;
        int season;
        System.out.print("Enter the course number: ");
        Scanner myScanner= new Scanner(System.in);
        if(myScanner.hasNextInt())
        {
            courseNum=myScanner.nextInt();
            if(courseNum>=186510&&courseNum<=201440)// ensures that valid course number was entered
            {
                semesterYear=courseNum/100;// stores year of class
                season= courseNum-semesterYear*100;// stores semester/season
                 if(season==10)// prints year and semester of course number
        {
            System.out.println("The course was offered in the spring semester of "+semesterYear);
        }
        else if(season==20)
        {
            System.out.println("The course was offered in the summer 1 semester of "+semesterYear);
        }
        else if(season==30)
        {
            System.out.println("The course was offered in the summer 2 semester of "+semesterYear);
        }
        else if(season==40)
        {
             System.out.println("The course was offered in the fall semester of "+semesterYear);
        }
        else
        {
            System.out.println(season+" is an invalid semester");
        }
            }
            else
            {
                System.out.println("The number entered was not between 186510 and 201440");// informs user of error
            }
            
        }
        else
        {
            System.out.println("the number entered was not an integer");//informs user of error
        }
        
       
    }
}