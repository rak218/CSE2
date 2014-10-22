// Ravi Kurtz
// 10-20-14
// Takes in number from user and creates an pattern
import java.util.Scanner;
public class NumberStacker
{
    
    public static void main(String[]args)
    {
        int x=0;
        int i;
        System.out.println("Enter an integer between 1 and 9");
        Scanner myScanner= new Scanner(System.in);
        if(myScanner.hasNextInt())
        {
            x=myScanner.nextInt();
            if(!(x>0&&x<10))
            {
                System.out.println("Did not enter a number between 1 and 9");
            }
        }
        else
        {
            System.out.println("did not enter an integer");
            return;
        }
        for(i=1;i<x+1;i++)
        {
             for(int r=1;r<i+1;r++)
             {
            for(int s=9-i;s>0;s--)
            {
                System.out.print(" ");
            }

            for(int j=1;j<2*i;j++)
            {
                
                System.out.print(i);
            }
            System.out.println();
             }
            System.out.println();
             for(int p=9-i;p>0;p--)
            {
                System.out.print(" ");
            }

            for(int d=1;d<2*i;d++)
            {
                
                System.out.print("-");
            }
            System.out.println();
             
        }
        int ii=1;
        while(ii<x+1)
        {
            int rr=1;
            while(rr<i+1)
            {
                int ss=9-ii;
                while(ss>0)
                {
                    System.out.print(" ");
                    ss--;
                }
                int jj=1;
                while(jj<2*ii)
                {
                    System.out.print(ii);
                    jj++;
                }
                rr++;
                System.out.println();
            }
            System.out.println();
            int pp=9-ii;
            while(pp>0)
             {
                System.out.print(" ");
                pp--;
            }
            int dd=1;
            while(dd<2*ii)
            {
                System.out.print("-");
                dd++;
            }
            System.out.println();
            ii++;
        }
        int iii=1;
        do {
            int rrr=1;
            do
            {
                int sss=9-iii;
                do
                {
                    System.out.print(" ");
                    sss--;
                } while(sss>1);
                int jjj=1;
                do
                {
                    System.out.print(iii);
                    jjj++;
                }while(jjj<2*iii-1);
                rrr++;
                System.out.println();
                }while(rrr<i);
                System.out.println();
                int ppp=9-iii;
                do
                {
                    System.out.print(" ");
                    ppp--;
                }
                while(ppp>1);
               int ddd=1;
                do
                {
                    System.out.print("-");
                    ddd++;
                }
                while (ddd<iii*2-1);
                System.out.println();
                iii++;
        } while (iii<x+1);
    }
}