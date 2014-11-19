// Ravi Kurtz  
// 11-18-2014
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    //simulateOdds();
  }
  public static void showHands()
  {
      int[]deck=new int[52];
      int[]hand=new int[5];
      int count=0;
      int card;
      for(int i=0;i<hand.length;i++)
      {
          card=(int)Math.random()*(52-i);
          hand[i]=deck[card];
          count++;
          int lastCard=deck[deck.length-count];
      deck[deck.length-count]=deck[lastCard];
      deck[lastCard]=-1;
      }
   
      System.out.print("clubs : ");
      for(int j=0;j<hand.length;j++)
      {
          if(hand[j]/13==0)
          {
              if(hand[j]%13==0)
              {
                  System.out.print("A");
              }
              if(hand[j]%13==1)
              {
                  System.out.print("K");
              }
             else if(hand[j]%13==2)
              {
                  System.out.print("Q");
              }
             else if(hand[j]%13==3)
              {
                  System.out.print("J");
              }
             else if(j>3)
             {
                 System.out.println(14-hand[j]);
             }
          }
      }
      System.out.println();
      System.out.print("diamonds : ");
      for(int j=0;j<hand.length;j++)
      {
          if(hand[j]/13==1)
          {
              if(hand[j]%13==0)
              {
                  System.out.print("A");
              }
              if(hand[j]%13==1)
              {
                  System.out.print("K");
              }
             else if(hand[j]%13==2)
              {
                  System.out.print("Q");
              }
             else if(hand[j]%13==3)
              {
                  System.out.print("J");
              }
             else
             {
                 System.out.println(14-hand[j]%13);
             }
          }
      }
      System.out.println();
      System.out.print("hearts : ");
      for(int j=0;j<hand.length;j++)
      {
          if(hand[j]/13==2)
          {
              if(hand[j]%13==0)
              {
                  System.out.print("A");
              }
              if(hand[j]%13==1)
              {
                  System.out.print("K");
              }
             else if(hand[j]%13==2)
              {
                  System.out.print("Q");
              }
             else if(hand[j]%13==3)
              {
                  System.out.print("J");
              }
             else
             {
                 System.out.println(14-hand[j]%13);
             }
          }
      }
      System.out.println();
      System.out.print("spades : ");
      for(int j=0;j<hand.length;j++)
      {
          if(hand[j]/13==3)
          {
              if(hand[j]%13==0)
              {
                  System.out.print("A");
              }
              if(hand[j]%13==1)
              {
                  System.out.print("K");
              }
             else if(hand[j]%13==2)
              {
                  System.out.print("Q");
              }
             else if(hand[j]%13==3)
              {
                  System.out.print("J");
              }
             else
             {
                 System.out.println(14-hand[j]%13);
             }
          }
      }
  }
  public static void simulateOdds()
  {
      for(int t=0;t<10000;t++)
      {
       int[]deck=new int[52];
      int[]hand=new int[5];
      int count=0;
      int card;
      int onePair=0;
      int morePair=0;
      int noPair=0;
      for(int i=0;i<hand.length;i++)
      {
          card=(int)Math.random()*(52-i);
          hand[i]=deck[card];
          count++;
          int lastCard=deck[deck.length-count];
      deck[deck.length-count]=deck[lastCard];
      deck[lastCard]=-1;
      
      if(exactlyOneDup(hand))
      {
          onePair++;
      }
      else if(hasDups)
      {
          morePair++;
      }
      else
      {
          noPair++;
      }
      }
      }
      System.out.print("total one pairs " + onePair);
      System.out.println();
      System.out.print("total hands with more than one pair " + morePair);
      System.out.println();
      System.out.print("total hands with no pairs" + noPair);
      
  }
  public static boolean hasDups(int[]hand)
{
    for(int i=0;i<hand.length;i++)
    {
        for(int j=0;j<hand.length;j++)
        {
             if(i==j)
            {
                j++;
            }
            if(j==10)
            {
                break;
            }
            if (hand[j]==hand[i])
            {
                return true;
            }
        }
    }
    
    
    return false;
    
}
public static boolean exactlyOneDup(int[]hand)
{
    int count=0;
     for(int i=0;i<hand.length;i++)
    {
        for(int j=0;j<hand.length;j++)
        {
            if(i==j)
            {
                j++;
            }
             if(j==10)
            {
                break;
            }
            if (hand[j]==hand[i])
            {
                count++;
            }
            
        }
}
if (count==2)
{
    return true;
}
else
{
    return false;
}
}
  
}