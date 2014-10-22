//Fayzah Di Natale
//CSE02
//Number Stack Java Program
//
//
//Program will ask the user for an input, if the user enters "1" it will simply display 1, however if the user enters "2" it will display
//1 222 222, if the user enters "3" it will display 1 222 222 33333 33333 33333 and so on, it will do this using 3 different types of loops
import java.util.Scanner; //input a scanner class
public class NumberStack{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //you must declare the use of scanner in order to accept input 
        myScanner=new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Please enter an integer between 1 and 9: "); //ask the user to enter an integer between 1 and 9
        int input=myScanner.nextInt(); //declare the variable input and have it equal the users input
        System.out.println("Using For Loops"); //display what loop we will be using
        int display1=(input*2)-1; //declare the variable display1 and set it equal to (input*2)-1
        int print1=0, output=0, answer=0, n=0, m=0, print=0, length=0, number=9, display=0; //declare and initialize a series ofvariables 
        int number1=(3*2)+1; //declare the variable number1 and set it equal 7
        String space=""; //declare the variable space as a string and set it equal to ""
        String space1=""; //declare the variable space1  as a string and set it equal to ""
        String dash="-"; //declare the variable dash as a string and set it equal to "-"
        for(n=1; n<input; n++){ //start for loop
            if(n==1){ //if n is equal to 1
                space=space.replace(space,"          "); //chance the value of space
                System.out.println(space+n); //display space and the value of n
                System.out.println(space+"-"); //display space and dash
                continue; //continue
            } //end of if statement 
            space=""; //chance the value of the variable space
            for(length=0; length<number; length++){ //start a for loop
                space=space.replace(space,space+" "); //replace space with space plus " "
            }//end for loop
            number--; //decrease the variable number by 1
            for (m=1; m<=n; m++){ //for loop
            System.out.print(space); //print out the value of space
            display=(n*2)-1; //change the value of display to be (n*2)-1
                for(print=0; print<display; print++){ //for loop 
                    System.out.print(n); //display the value of n
                }//end of for loop
                System.out.println(); //start a new line    
            }// end of for loop 
            display=(n*2)-1; //change the value of display
            space1=""; //change the value of space1 to ""
            number=9; //change the value of the variabl number
            for(length=1; length<number; length++){ //for loop 
                for(length=2; length<number; length++){ //for loop
                    space1=space1.replace(space1, space1+" ");  //change the value of space1
                } //end of for loop
            } //end of for loop
            number--; //decrease the value of number by 1
            System.out.print(space); //print out the value of space
            for(m=1; m<=display; m++){ //for loop
                System.out.print(dash); //print out "dash"
            } //end of for loop
        System.out.println(); //start a new line
        }//end of for loop
        for(output=0; output<input; output++){ //for loop
            if(input==1){ //if input is equal to 1
                System.out.print(input); //print out 1
                break; //break
            }//end of if statement
            System.out.print(space1); //print out space1
            for(print1=0; print1<display1; print1++){ //for loop
                System.out.print(input); //print out input
            }//end of for loop
            System.out.println(); //start a new line
        }// end of for loop
        System.out.println("Using While Loops"); //while using while loops
        n=1; //set n to 1
        while(n<input){ //while loop
            space=""; //set space to ""
            length=0; //set length to 0
            while(length<number){ //while loop
                space=space.replace(space,space+" "); //set space to space+ " "
                length++; //increase length by 1
            } //end of while loop
            number--; //decrease number by 1
            m=1; //set m to 1
            System.out.println(); //new line
            while(m<=n){ //while loop
                System.out.print(space); //print out space
                display=(n*2)-1; //change value of display
                print=0; //set print to 0
                    while(print<display){ //while loop
                        if(n==1){ //if n==1
                            System.out.print("  "); //print out "  "
                        } //end of if statement 
                        System.out.print(n); //print out n
                        print++; //increase print by 1 
                    }//end of while loop
                System.out.println(); //new line
                m++; //increase m by 1
            } //end of while loop
            display=(n*2)-1; //change value of display
            space1=""; //set space1 equal to ""
            number=9; //change value of number
            length=1; //set length equal to 1
            while(length<number){ //while loop
                length=2; //set length to 2
                while(length<number){  //while loop
                    space1=space1.replace(space1, space1+" "); //set space1 equal to space1+ " '
                    length++; //increase length by 1
                } //end of while loop
                length++; //increase length by 1
            } //end of while loop
            number--; //decrease number by 1 
            System.out.print(space); //print out space
            m=1;  //set me to 1
            while(m<=display){ //while loop
                System.out.print(dash); //print out dash
                m++; //increase m by 1
            } //end while loop
            n++; //increase n by 1
        } //end while loop
        System.out.println(); //new line
        output=0; //set output to 0
        while(output<input){ //while loop
            if(input==1){ //if input equals 1
                System.out.print(input); //print out input
                break; //break
            } //end of if statement 
            else{ //else
                System.out.print(space1); //print out space1
                print1=0; //set print1 to 0
                while(print1<display1){ //while loop
                    System.out.print(input); //print out input
                    print1++; //increase print by 1
                } //end of while loop
                System.out.println(); //new line
            } //end of else statement
            output++; //increase output by 1
        } //end of while loop
        System.out.println("Using Do-While Loops"); //using do while loop
        n=1; //set n to 1
        number=9; //set number to 9
        do{ //do this
            space=""; //set space to ""
            length=0; //set length to 0
            do{ //do this
               space=space.replace(space,space+" "); //set space to space plus " "
               length++; //increase length by 1
            } //end of do 
            while(length<number); //while length is less than number
            number--; //decrease number by 1
            m=1; //set me to 1
            do{ //do this 
                System.out.print(space); //print out space
                display=(n*2)-1; //change the value of display
                print=0; //set print to 0
                do{ //do this 
                    System.out.print(n); //print out n 
                    print++;// increase print by 1
                } //end of do
                while(print<display); //while (print<display)
                System.out.println(); //new line
                m++; //increase m by 1
            } //end of do 
            while(m<=n); //while (m<=n)
            System.out.print(space); //print out space
            m=1; //m equals 1
            do{ //do
                System.out.print(dash); //print out dash 
                m++; //increase m by 1
            } //end of do 
            while(m<=display); //while (m<=display)
            System.out.println(); //new line
            n++; //increase n by 1
        } //end of do 
        while(n<input); //while (n<input)
        length=0; //set length to 0
        space1="      "; //change value of space1
        do{ //do 
            length=1; //set length to 1
            do{ //do
                space=space.replace(space, space1+" "); //set space to space1+ " "
                length++; //increase length by 1
            } //end of do
            while(length<number); //while length <number
            length++; //increase length by 1
        } //end of do 
        while(length<number); //while length <number
        number--; //decrease number by 1
        output=0; //set output equal to 0
        do{ //do this
            if(input==1){ //if input is equal to 1
                System.out.print(input); //print input
                break; //break
            } //end of if 
            System.out.print(space1); //print space1
            print1=0; //set print1 to 0
            do{ //do this
                System.out.print(input); //print input
                print1++; //increase print1 by 1
            } //end of do 
            while(print1<display1); //while print1<display1
            System.out.println(); //newline
            output++; //increase output by 1
        } //endof do 
        while(output<input); //while output<input
    } //end of main method
} //end of public class