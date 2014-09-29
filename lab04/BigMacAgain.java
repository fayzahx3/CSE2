//Fayzah Di Natale
//CSE02
//Big Mac Again Java Program
//
//program will use have users enter the amount of big macs that they want
//program will ask if the user wants fries 
//it will then print out the total cost of the meal
//
//
//input scanner 
import java.util.Scanner;
//define a class
public class BigMacAgain{
    //add a main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        System.out.print("How many big macs do you want? ");
        if (myScanner.hasNextInt()){
            int nBigMacs=myScanner.nextInt();
            if (nBigMacs>0){
                double bigMacPrice;
                bigMacPrice=2.22;
                double bigMac$;
                bigMac$=nBigMacs*bigMacPrice;
                System.out.println("You ordered "+ nBigMacs +"for a cost of "+nBigMacs+"*"+bigMacPrice+"=$"+((int)(bigMac$*100)/100.00));
                System.out.print("Do you want fries? Please enter Y or y or N or n ");
                String answer=myScanner.next();
                if (answer.equals ("Y") || answer.equals ("N") || answer.equals ("y") || answer.equals ("n")){
                    if(answer.equals ("Y") || answer.equals ("y")){
                        double fries$;
                        fries$=2.15;
                        int dollars;
                        int pennies;
                        int dimes;
                        dollars=(int)(bigMac$);
                        dimes=(int)(bigMac$*10)%10;
                        pennies=(int)(bigMac$*100)%10;
                        double total;
                        total=bigMac$ + fries$;                            
                        System.out.println ("You ordered fries at $"+fries$);
                        System.out.println ("Your total is: $"+(int)(total*100)/100.00);
                        }else{
                            System.out.println("Your total is: $"+ (int)(bigMac$*100)/100.00);
                        }
                    }else{
                        System.out.println("You did not enter a valid answer");
                    }
            }else{
                System.out.println("You did not enter a valid amount");
                return;
            }
        }else{
            System.out.println("You did not enter a valid amount");
            return;
        
        }
    }
}
