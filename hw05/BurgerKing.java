// Ravi Kurtz
// 9-28-2014
// Takes order of client
import java.util.Scanner;
public class BurgerKing
{
    public static void main(String[]args)
    {
        String order;
        String style;
        System.out.print("Indicate your choice of order : (Burger B,b), (Fries: F,f), (Soda, S,s) " );// takes users order
        Scanner myScanner= new Scanner(System.in);
        order=myScanner.next();
        if(order.length()>1)// ensures proper length
             {
                 System.out.println("Single character expected");
             }
             
        if(order.equals("B")||order.equals("b"))// specifies order
        {
            System.out.println("Enter A or a for 'all the fixins' ");
            System.out.println("C or c for cheese ");
            System.out.print(" N or n for none of the above ");
            Scanner kbReader=new Scanner(System.in);
            style=kbReader.next();
            if(style.length()>1)
             {
                 System.out.println("Single character expected");// ensures proper length
             }
            switch(style)
            {
                default:
                System.out.println("you did not enter a proper answer");
                break;
                case "A":
                System.out.println("you ordered a burger with all the fixins");
                break;
                case "C":
                case "c":
                System.out.println("you ordered a burger with cheese");
                break;
                case "N":
                case "n":
                System.out.println("you ordered a plain burger");
                break;
                
                
            }
        }
        else if(order.equals("F")||order.equals("f"))// specifies order
        {
            System.out.println("Small (s/S) or Large (l/L) ");
            String size;
            Scanner input= new Scanner(System.in);
            size=input.next();
            if(size.length()>1)
             {
                 System.out.println("Single character expected");// ensures proper length
             }
            switch(size)
            {
                default: 
                System.out.println("you did not enter a valid choice");// ensures valid answer
                break;
                case "s" :
                case "S" :
                    System.out.println("you ordered small fries");
                    break;
                case "l":
                case "L":
                    System.out.println("you ordered large fries");
                
            }
            
       
            
        }
         else if(order.equals("S")||order.equals("s")) // specifies order
         {
             String brand;
             System.out.println("Coke (C/c) Pepsi(P/p) or Mountain dew(M/m)");
             Scanner input=new Scanner(System.in);
             brand=input.next();
             if(brand.length()>1)
             {
                 System.out.println("Single character expected");// ensures proper length
             }
             switch(brand)
             {
                 default: System.out.println("Invalid order");
                 break;
                 case"C":
                 case"c":
                     System.out.println("you ordered a coke");
                     break;
                case"P":
                case"p":
                System.out.println("you ordered a pepsi");
                break;
                case "M":
                case"m":
                    System.out.println("you ordered a mountain dew");
             }
             
         }
         else
         System.out.println("invalid order");
    }
}