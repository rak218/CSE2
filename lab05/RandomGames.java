// Ravi Kurtz 
// 9-24-14
// Plays casino games
import java.util.Scanner;
public class RandomGames
{
    public static void main(String[]args)
    { 
        String game;
        System.out.print("Enter your game of choice (R,r C,c P,p) :");
        Scanner myScanner= new Scanner(System.in);
        if(myScanner.hasNext())
        {
            game=myScanner.next();
            if(game.equals("R")||game.equals("r"))
            {
                int rouletteNum=(int)(Math.random()*38);
                if(rouletteNum-1==-1)
                {
                    System.out.println("roulette: 00");
                }
                else
                {
                    System.out.println("roulette: "+(rouletteNum-1));
                }
            }
            else if(game.equals("c")||game.equals("C"))
            {
                int rollResult=(((int)(Math.random()*6)+1)+((int)(Math.random()*6)+1));
                System.out.println("Craps: "+rollResult);
            }
            else if(game.equals("P")||game.equals("p"))
            {
                int cardNum=(int)(Math.random()*13)+1;
                int suitNum=(int)(Math.random()*4)+1;
                String suit=null;
                String faceCard=null;
                switch(suitNum)
                {
                    case 1: suitNum=1;
                    suit="hearts";
                    break;
                    case 2: suitNum=2;
                    suit="diamond";
                    break;
                    case 3: suitNum=3;
                    suit="clubs";
                    break;
                    case 4: suitNum=4;
                    suit="spades";
                    break;
                }
                switch(cardNum)
                {
                    case 1:cardNum=13;
                    faceCard="King";
                    break;
                    case 2 : cardNum=12;
                    faceCard="Queen";
                    break;
                    case 3 : cardNum=11;
                    faceCard="Jack";
                    break;
                    case 4: cardNum=1;
                    faceCard="Ace";
                    break;
                }
                if(cardNum>1&&cardNum<11)
                {
                    System.out.println(cardNum+ " of "+suit);
                }
                else
                {
                    System.out.println(faceCard+" of "+suit);
                }
                }
                else
                {
                    System.out.println("entered invalid letter");
                }
                    
                }
            }
        }
    
