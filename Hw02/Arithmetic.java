// Ravi Kurtz
// Hw02 
// 9-8-14
// Returns cost of items at walmart including tax

public class Arithmetic
{
    public static void main(String[] args)
    {
        int numSocks;
    double sockPrice;
    int numGlass;
    double glassPrice;
    int numEnvelopes;
    double envelopePrice;
    double totalSockCost$,totalGlassCost$,totalCostNoTax$,totalCost$,totalEnvelopeCost$;
    double taxPercent=.06;
       //number of socks purchesed and  price per unit
        numSocks=3;
        sockPrice=2.58;
        //cost of all the socks
        totalSockCost$=numSocks*sockPrice;
        //tax on socks
        double sockTax=taxPercent*totalSockCost$;
        System.out.println("there were "+ numSocks+"socks bought.");
        System.out.println("each sock costs $"+ sockPrice);
        System.out.println("the total cost of the socks was $"+(double)(((int)(totalSockCost$*100))/100.0) );
        System.out.println("the totas sales tax was $"+(double)(((int)(sockTax*100))/100.0)) ;
        //number of glasses and price per unit
        numGlass=6;
        glassPrice=2.29;
        //cost of all the glasses
        totalGlassCost$=numGlass*glassPrice;
        //tax on glass
        double glassTax=taxPercent*totalGlassCost$;
        System.out.println("Number: "+numGlass);
        System.out.println("cost : "+glassPrice);
        System.out.println("total cost: "+(double)(((int)(totalGlassCost$*100))/100.0));
        System.out.println("sales tax: "+(double)(((int)(glassTax*100))/100.0));
        //number of envelopes and price per unit
        numEnvelopes=1;
        envelopePrice=3.25;
        //cost of all the envelopes
        totalEnvelopeCost$=numEnvelopes*envelopePrice;
        double envelopeTax=taxPercent*totalEnvelopeCost$;
        System.out.println("Number: "+numEnvelopes);
        System.out.println("cost : "+glassPrice);
        System.out.println("total cost "+ (double)(((int)(totalEnvelopeCost$*100))/100.0)) ;
        System.out.println("sales tax: " +(double)(((int)(envelopeTax*100))/100.0));
        //finds total w/out tax
        totalCostNoTax$=totalGlassCost$+totalEnvelopeCost$+totalSockCost$;
        System.out.println("Total Cost without tax: "+(double)(((int)(totalCostNoTax$*100))/100.0));
        totalCost$=totalCostNoTax$+totalCostNoTax$*taxPercent;
        System.out.println("Total Cost with tax: "+(double)(((int)(totalCost$*100))/100.0));
        
    }
}