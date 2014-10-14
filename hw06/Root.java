//Fayzah Di Natale
//CSE02
//Root Java Program
//
//
//program will ask the user to enter a double and the program will use the bisection method to find the square root of the double 
import java.util.Scanner; //you must input the Scanner class
public class Root{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //you must declare the use of scanner in order to accept input 
        myScanner=new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter a double that is greater than 0 "); //ask the user to enter a double
        double number=myScanner.nextDouble(); //declare the variable number as the next double that the user enters
        double a=0; //declare the variable a as a double and make it equal to zero
        double b=(number+1); //declare the variable b as a double and make it equal to the variable number plus 1
        double midpoint=0; //declare the variable midpoint as a double and make it equal to zero
        double square=0; //declare the variable square as a double and make it equal to zero
        while ((b-a)>0.0000001){ //perform the following instructions while (b-a) is greater than 0.0000001 
            midpoint=(b+a)/2; //make the variable midpoint equal to (b+a)/2
            square=midpoint*midpoint; //make the variable square equal to midpoint squared
            if(square>number){ //if square is greater than the number originally entered by the user 
                b=midpoint; //make the variable b now equal to the midpoint
            }// end of if statement
            else{ //if square is not greater than the number originally entered by the user
                a=midpoint; //make the variable a now equal to the midpoint
            } //end of else statement
        }//end of while loop
        System.out.println("The square root of the double you entered is: "+midpoint); //print out the the square root of the number originally entered
    } //end of main method
} //end of public class