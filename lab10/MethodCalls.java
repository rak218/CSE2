// Ravi Kurtz
// 10-29-14
// adds digits and joins them
public class MethodCalls
{
    public static void main(String[]args)
    {
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    public static int addDigit(int num, int dig)
    {
        int newDig=dig;
        if(dig<0||dig>9)
        {
            return num;
        }
        else if(num>-1)
        {
            while(newDig/dig<=num)
            {
                newDig*=10;
                
            }
            num+=newDig;
            return num;
        }
        else
        {
            num*=-1;
             while(newDig/dig<=num)
            {
                newDig*=10;
                
            }
            num+=newDig;
            return -1*num;
        }
            
    }
    public static int join(int a, int b)
    {
        int negative1=0;
        int negative2=0;
        if(a<0)
        {
            negative1=-1;
            a*=negative1;
        }
        else
        {
            negative1=1;
        }
        if(b<0)
        {
            negative2=-1;
            b*=negative2;
        }
        else
        {
            negative2=1;
        }
        while(a/10>0)
        {
            b=addDigit(b,a%10);
            a/=10;
            
        }
        b=addDigit(b,a);
        
        
        
        return b*negative2*negative1;
        
    }
}