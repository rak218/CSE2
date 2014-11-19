// Ravi Kurtz
//11-12-2014
// Tests array equivilence, adds arrays together.

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  public static boolean equals(double[]listNum,double[]numList)
  {
      if(listNum.length!=numList.length) // tests if arrays have same length
      {
          return false;
      }
      for(int i=0;i<numList.length;i++)// for loop runs through arrays
      {
         if(numList[i]!=listNum[i])// tests that arrays store same value in each location
         {
             return false;
         }
      }
      return true;
  }
  public static double[] addArrays(double[]numList,double[]listNum)
  {
      double[]sum;
      if(numList.length>listNum.length) // finds the longer array
      {
          sum=new double[numList.length];
          for(int i=0;i<listNum.length;i++)// adds the values together up until listNum has no more values and stores them in sum
          {
              sum[i]=numList[i]+listNum[i];
              
          }
          for(int i=listNum.length;i<numList.length;i++)// adds the rest of the values to sum
          {
              sum[i]=numList[i];
          }
          return sum;
      }
      else
      {
          sum= new double[listNum.length];
          for(int i=0;i<listNum.length;i++) // adds all the values from list num into sum 
          {
              sum[i]=listNum[i];
          }
          for(int i=0;i<numList.length;i++) //adds the two arrays together
          {
              sum[i]+=listNum[i];
          }
          return sum;
      }
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
