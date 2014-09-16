//Fayzah Di Natale
//Root Java Program
//CSE 02
//
//
//Program will ask user to enter a double 
//program then prints out an estimate of the cube root
//program will repeat steps to estimate 4 times 
//
//import scanner
import java.util.Scanner;
//define a class
public class Root{
    //add a main method 
    public static void main(String[] args){
        Scanner myScanner; //declare the use of scanner in order to accept inputs
        myScanner=new Scanner (System.in); //construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print ("Enter a number in the form (xx.xx) "); //this will print out the line where the user will enter a number in the form xx.xx
        double x= myScanner.nextDouble(); //this will store the number in vairable "x" as a double 
        double guess=x/3; //this will take the variable guess, make it a double, and make it equal to x/3
        guess=((2*guess*guess*guess+x)/(3*guess*guess)); //this will make guess now equal to (2*the previous guess*previous guess*previous guess+x)/(*previous guess*previous guess))
        guess=((2*guess*guess*guess+x)/(3*guess*guess)); //this will make guess now equal to (2*the previous guess*previous guess*previous guess+x)/(*previous guess*previous guess))
        guess=((2*guess*guess*guess+x)/(3*guess*guess)); //this will make guess now equal to (2*the previous guess*previous guess*previous guess+x)/(*previous guess*previous guess))
        guess=((2*guess*guess*guess+x)/(3*guess*guess)); //this will make guess now equal to (2*the previous guess*previous guess*previous guess+x)/(*previous guess*previous guess))
        guess=((2*guess*guess*guess+x)/(3*guess*guess)); //this will make guess now equal to (2*the previous guess*previous guess*previous guess+x)/(*previous guess*previous guess))
        double answer; //this will double the variable "answer"
        answer=guess*guess*guess; //this makes answer equal to previous guess*previous guess*previous guess
        System.out.println("The cube root is "+(guess)); //this will print out a line that says "the cuber root is" and then shows the guess
        System.out.println((guess)+"*"+(guess)+"*"+(guess)+ " = " +answer); //this will print out a line should guess*guess*guess which is equal to the variable answer
     
    } //end of main method
} //end of class 