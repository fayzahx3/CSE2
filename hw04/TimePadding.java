//Fayzah Di Natale
//Time Padding Java Program
//CSE 02
//
//
//Program will ask the user to enter a positive integer giving the number of seconds that have passed during the day
//program will then display the time in conventional form 
import java.util.Scanner; //you must input the Scanner class
public class TimePadding{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //you must declare the use of scanner in order to accept input 
        myScanner=new Scanner (System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter the time in seconds "); //will as user to enter the number of seconds of the day 
        if (myScanner.hasNextInt()){ //checks that the user entered an int
            double answer=myScanner.nextInt(); //makes the input a variable "answer" that is a double
            if (answer>0){ //checks that the "answer" is a number greater than 0
                double hours; //declares the variable "hours" as a double
                hours= (answer/60)/60; //states that the variable hours is equal to "answer"/60 then divided by 60 again 
                int hours1; //declares the variable "hour1" as an int
                hours1= (int)(hours*100)/100; //states that the variable "hours1" is equal to "hours" times 100 then divided by 100 and explicitly casts the variable to an int
                double minutes; //declares that the variable "minutes" is a double
                minutes= hours-hours1; //states that "minutes" is equal to "hours" minus "hours1"
                double minutes1; //declares the variable "minutes1" is a double
                minutes1= (minutes*60); //states that "minutes1" is equal to "minutes" times 60
                int minutes2; //delcares the variable "minutes2" is an int
                minutes2=(int)(minutes1*100)/100; //states that minutes2 is equal to "minutes1" time 100 divided by 100, explicitly casts "minutes2" to an int
                double seconds; //declares the variable "seconds" as a double
                seconds=minutes1-minutes2; //states that "seconds" is equal to minutes1 subtracted by "minutes2"
                double seconds1; //declares the variable "seconds1" as a double
                seconds1=(seconds*60); //states that "seconds1" is equal to "seconds" times 60
                int seconds2; //declares the variable "seconds2" as an int
                seconds2=(int)(seconds1*100)/100; //states that "seconds2" is equal to "seconds1" times 100 divided by 100, and explicitly casts "seconds2" to an int
                String padded1=String.format("%02d", hours1); //declares the variable "padded1" as a string, and then pads a 0 to the left of the value of "hours1"
                String padded2=String.format("%02d", minutes2); //declares the variable "padded2" as a string, and then pads a 0 to the left of the value of "minutes2"
                String padded3=String.format("%02d", seconds2); //declares the variable "padded3" as a string, and then pads a 0 to the left of the value of "seconds2"
                System.out.println("the time is "+padded1+":"+padded2+":"+padded3); //displays the time in conventional form
            }else{ //what should happen if "answer" is a number less than 0
                System.out.println("You did not enter a positive int"); //it will tell the user that they did not enter a positive int
                return; //program will then end
            }//end of else statement
        }else{ //what should happen if the user does not enter an int
            System.out.println("You did not enter an int"); //it will tell the user that they did not enter an int
            return; //program will then end
        } //end of else statement
    } //end of main method 
} //end of public class 