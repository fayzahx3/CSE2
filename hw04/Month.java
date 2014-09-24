//Fayzah Di Natale
//Month Java Program
//CSE 02
//
//
//Program will ask the user to enter a number to represent a month 
//if the user enters 2 it will ask what year 
//program will then display the number of days in that month
//
//
import java.util.Scanner; //input scanner class 
public class Month{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //declare the use of scanner in order to accept input 
        myScanner=new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter an int 1-12 that represents a month "); //asks the user enter a number between 1 and 12 
        if (myScanner.hasNextInt()){ //checks if the number that was entered was an integer
            int answer1= myScanner.nextInt(); //declares the variable "answer1" as an int and sets it equal to the next input 
            if (answer1<=12&& answer1>0){ //checks to see if "answer1" is less than 12 and greater than 0
                String answer=Integer.toString (answer1); //declares the variable "answer" as a string and implicity casts the variable "answer1" from an integer to a string
                if (answer.equals ("1") ||answer.equals ("3") ||answer.equals ("5") ||answer.equals ("7") ||answer.equals ("8") ||answer.equals ("10") ||answer.equals ("12")){
                    //checks if "answer" is equal to 1,3,5,7,8,10,or 12
                    System.out.println("The month has 31 days"); //if it does then the program will tell that the month has 31 days 
                    }else{ //if it doesn't then go here 
                        if(answer.equals ("4") ||answer.equals ("6") ||answer.equals ("9") ||answer.equals ("11")){ //checks if "answer" is equal to 4,6,9, or 11
                        System.out.println("The month has 30 days"); //if it does then the program will tell that the month has 30 days 
                        }else{ //if it doesn't then go here
                            if (answer.equals ("2")){ //checks if the answer equals 2
                                System.out.print("What year? "); //if it does then the program will ask the user what year 
                                int year=myScanner.nextInt(); // declares the variable "year" as an int, and sets it equal to the next int
                                int x=4; //decalres the variable "x" as an int and makes it equal to 4
                                if (year % x ==0){ //checks if "year" is divisble by 4
                                    System.out.println("The month has 29 days"); //if it is then the program will display that the month has 29 days 
                                }else{ //if it is not divisible by 4 go here 
                                        if (year % x!=0){ //checks if the year is not divisible by 4
                                        System.out.println("The month has 28 days"); //program will show that the month has 28 days 
                                } //end of if statement 
                            }// end of else statement
                        }//end of if statement 
                    } //end of else statement 
                }//end of else statement 
            }else{// if the number is not in the range go here 
                System.out.println("you did not enter a number between 1 and 12"); //program will tell the user that the number they entered is not between 1 and 12 
                return; //end the program 
            } //end of else statement     
        }else{ //if the number is not an int go here 
            System.out.println("you did not enter an int"); //program will tell the user that the number they entered was not an int 
            return; //end the program 
        } //end of else statement     
    } //end of main method 
} //end of class 
