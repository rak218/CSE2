//Ravi Kurtz
//CSE2 lab 02 Cyclometer
//9/3/14
//prints time and cycles for each bike trip
//prints distance in miles both trips seperately and prints the sum
public class Cyclometer
{
    public static void main(String[]args)
    {
        int SecsTrip1=480; // records length of trip 1 in seconds 
        int SecsTrip2=3220;// recordls length of trip 2 in seconds
        int CyclesTrip1=1561;// records number of rotations of bike wheel in trip 1
        int CyclesTrip2=9037;// records number of rotations of bike wheel in trip 2
        double wheelDiameter=27.0;// diameter in inches, will be used to find circumfrence of bike wheel
       double PI=3.14159;// will be used to find circumfrence of bike wheel
       int feetPerMile=5280;// will be used to convert inches to miles
       int inchesPerFoot=12;// will be used to convert inches to miles
       int SecondsPerMinute=60;//// will be used to convert seconds to minutes
       double distanceTrip1,distanceTrip2,totalDistance;
       System.out.println("Trip 1 took "+(SecsTrip1/SecondsPerMinute)+" minutes and had "+CyclesTrip1+" counts.");
       System.out.println("Trip 2 took "+(SecsTrip2/SecondsPerMinute)+" minutes and had "+CyclesTrip2+" counds.");
       distanceTrip1=((PI*wheelDiameter*CyclesTrip1)/(inchesPerFoot*feetPerMile));//calculates trip 1 distance in miles
       distanceTrip2=((PI*wheelDiameter*CyclesTrip2)/(inchesPerFoot*feetPerMile));//calculates trip 2 distance in miles
       totalDistance= distanceTrip2+distanceTrip1;
       System.out.println("trip 1 was "+distanceTrip1+" miles");
       System.out.println("trip 2 was "+distanceTrip2+" miles");
       System.out.println("The Total Distance was "+totalDistance+"miles");
       
        
    }
}
