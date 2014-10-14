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
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //declare the scanner class so that it can accept inputs
        myScanner=new Scanner (System.in); //create an instance of the scanner 
        System.out.print("How many big macs do you want? "); //ask the user how many big macs they wants
        if (myScanner.hasNextInt()){ //if the user enters an int then
            int nBigMacs=myScanner.nextInt(); //declares the variable nBigMacs as an int and makes it equal to the next int that the user enters
            if (nBigMacs>0){ //if nBigMacs is greater than 0
                double bigMacPrice; //declare variable bigMacPrice as a double
                bigMacPrice=2.22; //make bigMacPrice equal to 2.22
                double bigMac$; //declare the variable bigMac$ as a double 
                bigMac$=nBigMacs*bigMacPrice; //make it equal to nBigMacs times bigMacPrice
                System.out.println("You ordered "+ nBigMacs +"for a cost of "+nBigMacs+"*"+bigMacPrice+"=$"+((int)(bigMac$*100)/100.00)); //tell the user how many big macs they ordered, the cost of one and their total cost in the form (xx.xx)
                System.out.print("Do you want fries? Please enter Y or y or N or n "); //ask if the user wants fries
                String answer=myScanner.next(); //declares the variable answer as a string, makes it equal to the next string the user enters
                if (answer.equals ("Y") || answer.equals ("N") || answer.equals ("y") || answer.equals ("n")){ //checks if answer is equal to Y/y/N/n
                    if(answer.equals ("Y") || answer.equals ("y")){ //if it is equal to Y/y
                        double fries$; //declare the variable fries$ as a double
                        fries$=2.15; //make fries$ equal to 2.15
                        int dollars; //declare the variable dollars as an int
                        int pennies; //declare the variable pennies as an int
                        int dimes; //declare the variable dimes as an int
                        dollars=(int)(bigMac$); //dollars is equal to bigMac$ as an int
                        dimes=(int)(bigMac$*10)%10; //dimes is equal to the number in the tenths decimal place 
                        pennies=(int)(bigMac$*100)%10; //pennies is equal to the number in the hundreths place
                        double total; //declare the variable total as a double
                        total=bigMac$ + fries$; //total is equal to bigMac$ + fries$
                        System.out.println ("You ordered fries at $"+fries$); //tell the user the cost of their fries
                        System.out.println ("Your total is: $"+(int)(total*100)/100.00); //tell them what their total is in the form (xx.xx)
                        }else{ //if not
                            System.out.println("Your total is: $"+ (int)(bigMac$*100)/100.00); //tell them their total in the form (xx.xx)
                        } //end of else statement 
                    }else{ //if their answer is not Y/y/N/n.
                        System.out.println("You did not enter a valid answer"); //print out an error message
                    }//end of else statement
            }else{ //if their answer is less than 0
                System.out.println("You did not enter a valid amount"); //print out an error statement 
                return; //end the program
            }//end of else statement
        }else{ //if they did not ente an int
            System.out.println("You did not enter a valid amount"); //print out an error message
            return; // end the program 
        } //end of else statement 
    }//end of main method
} //end of public class
