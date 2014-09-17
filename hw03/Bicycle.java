//Ravi Kurtz
//9-14-2014
// returns distance, time spent and average speed of trip

import java.util.Scanner;
public class Bicycle
{
    public static void main(String[] args)
    {
      double wheelDiameter=27.0; //in inches, used to calculate the distance of the trip
      double count;// number of rotations of the wheel
      int seconds;
      System.out.print("Enter the number of seconds: "); // takes in number of seconds from user
      Scanner myScanner=new Scanner(System.in);
      seconds= myScanner.nextInt();
      System.out.print("Enter the number of counts ");// takes in # of counts from user
      Scanner myScanner1= new Scanner(System.in);
      count=myScanner1.nextDouble();
      double miles= (count*Math.PI *wheelDiameter)/(12*5280);//converts count into miles traveled
      double minutes= seconds/60;// converts seconds into minutes
      double hours= minutes/60;// converts minutes to hours
      miles= ((double)(((int)(miles*100)))/100);// shortens to two decimal points
      double mph= (double)(((int)(miles/hours)*100)/100);// shortens to 100s
      System.out.println(" The number of miles is : " +(miles)+" and it took "+ minutes +"minutes" );//prints miles and minutes of trip
      System.out.println(" The average miles per hour was : " +mph + " mph" );// prints avg miles/ hour]
      
    }
}