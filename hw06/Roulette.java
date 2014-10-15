// Ravi Kurtz
// 10/14/2014
// Test strategy for roullette game
public class Roulette
{
    public static void main(String[]args)
    {
        int myNum=(int)(Math.random()*38);
        int count=0;
        int wins=0;
        int spinNum;
        int fail=0;
        int profits=0;
        for (int j=0;j<1000;j++)
        {
        for(int i=0;i<100;i++)
        {
            spinNum=(int)(Math.random()*38);
            if(spinNum==myNum)
            {
                count++;
            }
        }
        if(count>2)
        {
            wins++;
            profits+=count*36-100;
            
        }
        else if(count==0)
        {
            fail++;
            profits-=100;
        }
        else if(count>0&&count<3)
        {
            profits-=100-(count*36);
        }
    
        count=0;
        j++;
        }
        System.out.println("wins: "+ wins+" profits: "+profits+" complete losses: "+fail);
    }
}