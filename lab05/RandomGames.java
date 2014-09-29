//Fayzah Di Natale
//Random Games Java Program
//CSE02
//
//
// Program will ask users to pick their choice of a game (roulette, craps, or picking a card from the deck)
//the program will check to make sure that the user entered a valid input
//program will give the user an ouptut based on their input
import java.util.Scanner; //input scanner class
public class RandomGames{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //must declare the use of scanner in order to accept input 
        myScanner=new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner 
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: "); //this asks user to enter their choice of a game
        String answer; //declars variable answer as a string
        answer= myScanner.next(); //states that "answer" is equal to what the user inputted
        int amount; //declares the variable amount as an int
        amount=answer.length(); //states that amount is equal to the amount of characters of the variable "answer"
        switch (amount){ //this will look at the variable amount
            case 1: //if amount is equal to 1 then the program will move on to the next step
                break; //move on
            default: //if amount is equal to anything else
                System.out.println("A single character is expected"); //the program will print an error message
                return; //then the program will end
        } //end of first switch statment 
        char game= answer.charAt(0); //this declares the variable game as a char, and makes it equal to the variable "answer" with length 1 
        int number=(int)(Math.random()*38); //this declares the variable number as an int, and then makes it equal a random number between 0 and 37
        switch (number){ //this will look at the variable number
            case 37: //if number is equal to 37
                System.out.println("Roulette: 00"); //if it is the program will print "roulette: 00"
                return; //this will end the program 
        } //end of 2nd switch statement
        switch (game){ //this will look at the variable game
            case 'R': //if the user entered R
                System.out.println("Roulette: "+number); //then the program will say "roulette: and then the random number chosen 
                break; //leave the switch statement 
            case 'r':  //if the user entered r
                System.out.println("Roulette: "+number); //then the program will say "roulette: and then the random number chosen
                break; //leave switch statement
            case 'C':  //if the user entered C
                System.out.println("Craps has not been implemented yet"); //the program will tell the user that the game has not been implemented yet 
                break; //leave switch statement
            case 'c': //if the user entered c
                System.out.println("Craps has not been implemented yet"); //the program will tell the user that the game has not been implemented yet
                break; //leave switch statement
            case 'P': //if the user entered P
                System.out.println("Pick a card has not been implemented yet");  //the program will tell the user that the game has not been implemented yet
                break; //leave switch statement
            case 'p': //if the user entered p
                System.out.println("Pick a card has not been implemented yet"); //the program will tell the user that the game has not been implemented yet
                break; //leave the switch statement
            default: //if the user enters anything else 
                System.out.println("Not an option"); //th eprogram will print out an error method
        }//end of third switch statement
    }// end of main method
} //end of public class 