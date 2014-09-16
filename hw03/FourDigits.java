//Fayzah Di Natale
//Four Digits Java Program
//CSE 2 
//
//
//program will ask user to enter a double 
//prgram will then print the first four to the right of the decimal place 
//
//input scanner
import java.util.Scanner;
//define a class
public class FourDigits{
    //add a main method 
    public static void main(String[] args){
        Scanner myScanner; //must declare the use of the scannerin order to accept input 
        myScanner=new Scanner (System.in); // you have to construct and instance of the scanner class so that it knows you will be using the scanner 
        System.out.print("Enter a double "); //this is asking the user for a double
        double number=myScanner.nextDouble(); //this stores the double as a double
        int number2; //this makes the variable number2 an integer
        number2=(int)(number*10000)%10; //this makes number2 equal to the int of number times 10000 then takes off the last digit by the percent function
        int number3; //this make the variable number3 an integer
        number3=(int)(number*1000)%10; //this makes number3 equal to the int of number times 1000 then takes off the last digit by the percent function
        int number4; //this makes the variable number4 an integer
        number4=(int)(number*100)%10; //this makes number4 equal to the int of number times 100 then takes off the last digit by the percent function 
        int number5; //this makes the variable number5 an integer
        number5=(int)(number*10)%10; //this makes number5 equal to the int of number times 10 then takes off the last digit by the percent function
        System.out.print(number5); //this prints out the first number after the decimal
        System.out.print(number4); //this prints out the second number after the decimal
        System.out.print(number3); //this prints out the third number after the decimal
        System.out.println(number2); //this prints out the fourth number after the decimal
    } //end of main method
    
} //end of class 