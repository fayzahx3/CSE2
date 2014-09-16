//Fayzah Di Natale
//Bicycle Java Program
//CSE 02 
//
//
//Program will ask user to enter number of counts on a cyclometer
//program will ask user to the number of seconds during which the counts occured
//program will compute distance traveled, and time spent
//program will also give the average mph for trip
//
//import a scanner class
import java.util.Scanner;
//define a class
public class Bicycle{
    //add a main method 
    public static void main(String[] args){
        Scanner myScanner; //declare the use of scanner in order to accept inputs
        myScanner= new Scanner (System.in); //construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print ("Enter the number of seconds "); //this will print the line asking for the number of seconds
        int nSeconds= myScanner.nextInt(); //this will store the number of seconds as an integer
        System.out.print ("Enter the number of counts "); //this will print the line asking for the number of counts
        int nCounts= myScanner.nextInt(); //this will store the counts as an integer
        double PI=3.14159; //double the variable PI which is equal to 3.14159
        int feetPerMile=5280; //make the variable feet per mile an integer whose value is 5280
        int inchesPerFoot=12; //make the variable inches per foor an integer whose value is 12
        int secondsPerMinute=60; //make the variable seconds per minute an integer whose value is 60
        double wheelDiameter=27.0; //make the variable wheel diameter a double whose value is 27.0
        double distance; //make the variable distance a double
        double nMins=nSeconds/secondsPerMinute; //make the variable nMins a double and make it equal to nSeconds divided by secondsPerMinute
        double nHours=nMins/60; //make the variable nHours a double and make it equal to nMins divided by 60
        distance=nCounts*wheelDiameter*PI; //make the variable distance equale to nCounts times wheelDiameter times PI
        distance/=inchesPerFoot*feetPerMile; //make the new variable distance equal to inchesPerFoot time feetPerMIle
        System.out.println ("The distance was "+(int)(distance*100)/100.00+" miles and took "+(double)nSeconds/secondsPerMinute+" minutes" );
        //this will print out the total distance in form xx.xx and total time in minutes 
        System.out.println ("The average MPH was "+(int)((distance/nHours)*100)/100.00); 
        //this wil; print out the average mph in the form xx.xx
    } //end of main methos
} //end of public class