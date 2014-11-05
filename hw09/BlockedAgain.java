//Fayzah Di Natale
//CSE02 
//BlockedAgain java program
//
//
//program will accept input from the user, and after it verifies that the input is acceptable will call various methods, to produce a tower of numbers 
import java.util.Scanner; //imput a scanner class 
public class BlockedAgain{ //define a public class
    public static int checkInt(){ //method that is called checkInt and that returns an int
        Scanner scan=new Scanner(System.in); //declare the use of scanner in order to accept input and construct an instance of the scanner class so that it knows you will be using the scanner
        int input=0; //declare the variable input as an int and set it equal to 0
        while(scan.hasNext()){ //a while loop that runs as long as the user enters something
            if(scan.hasNextInt()){ //if the user entered an int
                input=scan.nextInt(); //input will now be set to that int 
                break; //break
            } //end of if statement 
            else{ //if the user did not enter an int 
                System.out.print("You did not enter an int, please try again "); //program will print out an alert to tell the user to try again
                scan.next(); //it will then accept more input
            } //end of else statement 
        } //end of while loop
        return input; //this method will return the variable input 
    } //end of checkInt method
    public static int checkRange(int answer){ //method that is called checkRange, it accepts an int variable, and returns an int 
        while(!(answer<=9 && answer>=1)){ //while loop that runs as long as the vriable answer is not equal a number inbetween [1,9]
            System.out.print("You did not enter a number between 1 and 9 inclusive try again: "); //program will alert the user to try again
            answer=checkInt(); //answer will be equal to checkInt();
        } //end of while loop
        return answer; //method will return the value of the variable answer
    } //end of checkRange method
    public static int getInt(){ //method called getInt that returns an int 
        Scanner scan=new Scanner(System.in); //declare the use of scanner in order to accept input and construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter an int between 1 and 9 inclusive: "); //asks the user to enter an int between [1,9]
        int answer=checkInt(); //declares variable answer as an int and sets it equal to checkInt();
        int range=checkRange(answer); //declares the variable range as an int and sets it equal to checkRange(answer);
        return range; //return the value of range
    } //end of getInt method 
    public static void allBlocks(int x){ //method called allBlocks, and accepts an int, returns nothing
        int display=0; //declare the variable display as an int and set it equal to 0
        int display2=0; //declare the variable display2 as an int and set it equal to 0
        int answer=display+1; //declare the variable answer as an int and set it equal to display+1
        int answer2=answer+1; //declare the variable answer2 and set it equal to answer+1
        String output=""; //declare the variable output as a string and set it equal to ""
        String number=answer+""; //declare the variable number as a string and set it equal to answer+"", making answer now a string
        String dashes="-"; //declare the variable dashes as a string and set it equal to "-"
        String spaces="        "; //declare the variable spaces and set it equal to "        ""
        block(display, display2, answer, answer2, output, number, dashes, spaces, x); //call the method block()
    } //end of allBlocks method 
    public static void block(int display, int display2, int answer, int answer2, String output, String number, String dashes, String spaces, int x){
    //method called block that does not return anything but accpets (int, int, int, int, String, String, String, String, int)
        for (display=0; display<x; display++){ //for loop that runs if display<x, first seting display to 0 and then after it runs adds 1 to display 
            output=spaces+number; //se the value of output to space+number, making number a string
            System.out.println(output); //this will print out output
            display2=0; //sets display2 to 0
            line(display2, answer, output); //calls the method line(int, int, String)
            System.out.println(spaces+dashes); //prints out spaces+dashes 
            dashes=dashes.replaceFirst("-","---"); //takes the value of dashes and replaces the firt - with ---
            spaces=spaces.replaceFirst(" ",""); //takes the value of spaces and replaces the first " " and replaces it with "" essentially eliminating one space
            number=number.replace(answer+"", answer2+""); //takes the value of number and replaces answer with answer2
            answer++; //increases answer by 1
            number=number+answer+answer; //sets the value of number to number plus answer and concatinates it with answer again
            answer2=answer+1; //sets answer2 to answer+1
        } //end of for loop
    } //end of block() method
    public static void line(int display2, int answer, String output){ //method that is called line, does not return anything, but accepts (int, int, String)
        for(display2=1; display2<answer; display2++){ //for loop that runs as long as display2<answer, sets display2=1, and after it runs adds 1 to display2
                System.out.println(output); //prints out output
        } //end of for loop
    } //end of line() method
    public static void main(String []s){ //beginning of main method
        int m; //declares the variable m as an int
        //force user to enter int in range 1-9, inclusive.
        m = getInt();  //sets m to getInt();
        allBlocks(m); //calls the method allBlocks(m)
    } //end of main method
} //end of public class 