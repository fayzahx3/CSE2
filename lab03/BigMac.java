//Fayzah Di Natale
//Big Mac Java Program
//program will be able to compute the cost of buying some amount of Big Macs
//program will use the scanner class to get the amount of Big Macs, the cost per Big Mac, and the precentage of tax from the user 
//it will then show the total cost of the purchase
//
//input Scanner class
import java.util.Scanner;  
//define a class 
public class BigMac{
    //add a main method
    public static void main(String[] args){
        Scanner myScanner; //must declare the use of scanner in order to accept input  
        myScanner= new Scanner (System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner 
        System.out.print("Enter the number of Big Macs(an integer > 0):"); //asks user to input the number of Big Macs as an integer
        int nBigMacs= myScanner.nextInt(); //accepts user input and stores it as an integer 
        System.out.print("Enter the price of a Big Mac as"+ " a double (in the form xx.xx): "); //asks user to input the price of a Big Mac as a double
        double bigMac$= myScanner.nextDouble (); //accepts user input and stores it as a double in the form of xx.xx
        System.out.print("Enter the precentage of sales tax as a whole number (xx):");//asks user to input the precentage of sales tax as a whole number
        double taxRate= myScanner.nextDouble(); //accepts user input and stores it as d ouble 
        taxRate/=100; //user inputed tax rate as a whole number and we want proportion
        double cost$; //show the cost as a decimal 
        int dollars; //show the dollars as an integer
        int dimes, pennies; //show pennies and dimes as integers
        cost$=nBigMacs*bigMac$*(1+taxRate); //total cost is equal to number of big macs times big mac cost times (tax rate plus one)
        dollars=(int)cost$; //able to get the whole number amount of dollars by dropping the decimal
        dimes= (int)(cost$*10)%10; //able to get dimes amount 
        pennies= (int)(cost$*100)%10; //able to get pennies amount
        System.out.println("The total cost of " +nBigMacs +" Big Macs, at $"+bigMac$ +" per Big Mac, with a" + " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        //prints out the total cost of some amount of big macs 
    } //end of main method 
} // end of class 
