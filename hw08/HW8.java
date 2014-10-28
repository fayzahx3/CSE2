//Fayzah Di Natale
//CSE 02
//HW8 java program
//
//
//program will ask the user to enter either a C or and check to make sure it enters that and once it satisfies the requirements will print out what the user entered
//then the program will ask the user to enter either a Y y N or n and once it satisfies the requirements it will print out what the user enters
//if the user enters wrong 5 times it will alert the user and then end that and then go to the next part of the program 
//then the program will ask the user to enter one of the numbers 0-9
//it will make sure that user enters one of those numbers and then returns what the user enters 
import java.util.Scanner; //you must input the Scanner class
public class HW8{ //define a class
    public static char getInput(Scanner scan, String input){ //this will add a method called getInput that will return a value of type char
        input=scan.next(); //state that input is equal to the next value entered by the user
        int input2=input.length(); //make input2 an int and set it equal to the length of input one
        char last=1; //declare the variable last as a char and set it equal to 1
        while (input2!=1){ //while input2 is not equal to 1 do the following 
            System.out.print("You should enter exactly 1 character try again "); //print out an alert line
            input=scan.next(); //accept a new input
            input2=input.length(); //have input2 be equal to the length of the new input
        }//end of first while loop
        while(!input.equals("C") && !input.equals("c")){ //while input is not equal to C or c do this
            System.out.print("You did not answer something from the list please try again "); //print out an alert line 
            input=scan.next(); //accept new input
            input2=input.length(); //set input2 equal to the length of the new input
        }//end of 2nd while loop
        last=input.charAt(0);  //have the variable last be equal to the first character in the variable input
        return last;  //return last
    }//end of getInput method
    public static char getInput(Scanner scan, String value, int number){ //start a new getInput method that also returns a char but takes in 3 variables 
        value=scan.next(); //set the variable value to be the next inout by the user
        char answer=1; //declare the variable answer as a char and set it equal to 1
        int x=1; //declare the varible x as an int and set it equal to 1
        while(x<5){ //while x is less than 5 do this
            if(!value.equals ("Y") && !value.equals ("y") && !value.equals ("n") && !value.equals ("N")){ //if value does not equal Y y N or n 
                System.out.print("You did not enter a character from the list; try again ");//print out an alert line
                value=scan.next(); //value will be equal to the next input
            } //end of if statment 
            else{ //if not 
                break; //break out of the while loop
            } //end of else statement 
            x++; //increment x by 1 
        } //end of while loop 
        if(x==5){ //If x is equal to 5
         System.out.println("You failed after 5 tries"); //tell the user that they failed after 5 times 
         answer=' '; //set the value of answer to ' '
        } //end of if statement 
        else{ //else 
            answer=value.charAt(0); //make the value of answer be value.charAt(0)
        }//end of else statement 
        return answer; //return answer
    }//end of getInput method 
    public static char getInput(Scanner scan, String message, String number){ //add another getInput method that takes different variables but still returns a char
        System.out.print(message+" "); //first print out message followed by a space
        number=scan.next(); // set the variable number to the next input that the user enters 
        char output=1; //declare the variable output as a char and set it equal to 1
        int imput=number.length(); //declare the variable imput as an int and set it equal to the length of the variable number 
        while (imput!=1){
            System.out.print("You must enter one character "+message+" "); //print out an error message 
            number=scan.next(); //set number to be the next thing entered by the user 
            imput=number.length(); //make imput be the length of the variable number 
            while (!number.equals ("0") && !number.equals("1") && !number.equals("2") && !number.equals("3") && !number.equals("4") && !number.equals("5") && !number.equals("6") && !number.equals("7") && !number.equals("8") && !number.equals("9")){ 
                //while the variable number does not equal 0 or 1 or 2 or 3 or 4 or 5 or  or 7 or 8 or 9 do this 
                System.out.println("You did not enter an acceptable character"); //print out an alert message
                System.out.print(message+" "); //display message and space again 
                number=scan.next(); //set number equal to the next input 
                imput=number.length(); //set imput to the length of the variable number 
            } //end of while loop 
        } //end of while loop 
        output=number.charAt(0); //set output equal to number.charAt(0)
        return output; //return outout 
    }//end of getInput method
    public static void main(String []arg){ //add a main method 
        char input; //declare the variable input as a char 
        Scanner scan=new Scanner(System.in); //you must declare the use of scanner in order to accept input you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); //print out the first instruction 
        input=getInput(scan,"Cc"); //set input equal to the value returned by the first getInput method 
        System.out.println("You entered '"+input+"'"); //print out the value returned by the first getInput method 
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //print out the next set of instructions 
        input=getInput(scan,"yYnN",5); //give up after 5 attempts
        if(input!=' '){ //if input does not equal ' '
           System.out.println("You entered '"+input+"'"); //print out what the user entered 
        } //end of if statement 
        input=getInput(scan,"Choose a digit.","0123456789"); //set input equal to the third getInput method
        System.out.println("You entered '"+input+"'"); //print out what the user entered 
    } //end of main method 
} //end of public class 