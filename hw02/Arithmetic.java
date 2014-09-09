//Fayzah Di Natale
//Walmart's Java Program 
//
//
//define a class
public class Arithmetic{ 
    
//  add main method 
    public static void main(String[] args){
        //input variables
        int nSocks=3; //number of pairs of socks 
        double sockCost$=2.58; //cost per pair of socks 
        int nGlasses=6; //number of drinking glasses 
        double glassCost$=2.29; // cost per drinking glass 
        int nEnvelopes=1;  //number of boxes of envelopes 
        double envelopeCost$=3.25; //cost per box of envelopes
        double taxPercent$=0.06; //sales tax
        double totalSockCost$=(nSocks*sockCost$); //total cost for 3 pairs of socks
        double totalTaxOfSockCost$=(totalSockCost$*taxPercent$); //total cost of tax on 3 pairs of socks
        double totalGlassCost$=(nGlasses*glassCost$); //total cost of 6 drinking glasses
        double totalTaxOfGlassCost$=totalGlassCost$*taxPercent$; //total cost of tax on 6 drinking glasses
        double totalEnvelopeCost$=(nEnvelopes*envelopeCost$); //total cost of 1 box of envelopes
        double totalTaxOfEnevelopeCost$=totalEnvelopeCost$*taxPercent$; //total cost of tax on 1 box of envelopes 
        double totalCostAllPurchases$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //total cost of all purchases before tax
        double totalCostSalesTax$=totalTaxOfSockCost$+totalTaxOfGlassCost$+totalTaxOfEnevelopeCost$; //total cost of sales tax on all items
        double totalCostAllPurchasesWithTax$=totalCostAllPurchases$+totalCostSalesTax$; //total cost of all purchases including tax 
        System.out.println("Total Cost for Socks: $"+sockCost$*nSocks); //evaluate cost of socks before sales tax and record here
        System.out.println("Total Cost for Glasses: $"+glassCost$*nGlasses); //evaluate cost of drinking glasses before sales tax and record here
        System.out.println("Total Cost for Boxes of Envelopes: $"+envelopeCost$*nEnvelopes); //evaluate cost of box of envelopes before sales tax and record here
        System.out.println("Total Cost of Sales Tax on Socks: $"+(int)(totalTaxOfSockCost$*100)/100.00); //evaluate sales tax for 3 pairs of socks and record here
        System.out.println("Total Cost of Sales Tax on Glasses: $"+(int)(totalTaxOfGlassCost$*100)/100.00); //evaluate sales tax for 6 glasses and record here 
        System.out.println("Total Cost of Sales Tax on Boxes of Envelopes: $"+(int)(totalTaxOfEnevelopeCost$*100)/100.00); //evaluate sales tax for 1 box of envelopes and record here
        System.out.println("Total Cost of Products without Sales Tax: $"+(int)(totalCostAllPurchases$*100)/100.00); //evaluate total cost of purchases before sales tax and record here
        System.out.println("Total Sales Tax cost: $"+(int)(totalCostSalesTax$*100)/100.00); //evaluate total cost of sales tax on total purchases and record here
        System.out.println("Total Cost of Products Including Sales Tax: $"+(int)(totalCostAllPurchasesWithTax$*100)/100.00); //evaluate total cost of purchases including sales tax and record here 
    }
}

//compile program 
//javac Aritmetic.java
//run program 
//java Aritmetic 


