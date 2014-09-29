//Fayzah Di Natale
//Boola Boola Java Program
//CSE 02
//
//
//Program will randomly assign True or False to three variables 
//then it will randomly combine the three variables with a random choice of || or &&
//the program will show the user the combination and ask them if it is true or false, then display if they are right or not
import java.util.Scanner;//input the scanner class
public class BoolaBoola{ //define a class
    public static void main(String[] args){//add a main method
        Scanner myScanner; //must declare the use of the scanner to accept input
        myScanner=new Scanner(System.in); //must construct an instance of the scanner class so it knows that you will be using it 
        int number; //declares that the variable number is an int;
        number=(int)(Math.random()*2); //says that number is equal to a random choice of (0 or 1)
        boolean x=true; //declares that the variable x is a boolean and that it is true
        boolean y=true; //declares that the variable y is a boolean and that it is true
        boolean z=true; //declares that the variable z is a boolean and that it is true
        String and="&&"; //declares the variable and as a string, and makes it equal to &&
        String and2="&&"; //declares the variable and2 as a string and makes it equal to ||
        boolean a=true; //declares that the variable a is a boolean and that it is true
        boolean b=true; //declares that the variable b is a boolean and that it is true
        boolean r=true; //declares that the variable r is a boolean and that it is true
        String finalAnswer; //declares that the variable finalAnswer is a string
        switch (number){ //looks at the variable number
            case 0: //if number is equal to 0
                x=false; //change the value of x to false
                break; //move out of switch statement
            case 1: //if number is equal to 1
                x=true; //chane the value of x to true
                break; //move out of switch statement
        }//end of first switch statement
        int number2=(int)(Math.random()*2); //says that number2 is an int and it is equal to a random choice of 0 or 1
        switch (number2){ //looks at the variable number2
            case 0: //if number2 is equal to 0
                y=false; //change the value of y to false
                break; //move out of switch statement
            case 1: //if number2 is equal to 1
                y=true; //change the value of y to true
                break; //move out of switch statement
        } //end of second switch statement 
        int number3=(int)(Math.random()*2); //declares the variable number3 as an int and makes it equal to a random choice of 0 or 1
        switch (number3){ //looks at number3
            case 0: //if number3 is 0 
                z=false; //change the value of z to false
                break; //move out of switch statement
            case 1: //if number3 is 1 
                z=true; //change the value of z to true
                break; //move out of switch statement 
        } //end of third switch statement
        int operator=(int)(Math.random()*2); //declares the variable operator is an int and that it equals a random choice of 0 or 1
        switch (operator){ //looks at the variable operator 
            case 0: //if operator is equal to 0
                and="&&"; //change and to equal &&
                break; //move out of switch statement
            case 1: //if operator is equal to 1
                and="||"; //change and to equal ||
                break; //move out of switch statement
        }//end of third switch statement
        int operator2=(int)(Math.random()*2); //declares the variable operator2 as an int and that it is equal to a random choice of 0 or 1
        switch (operator2){ //looks at operator2
            case 0: //if operator2 is equal to 0
                and2= "&&"; //change the value of and2 to &&
                break; //move out of switch statement
            case 1: //if operator2 is equal to 1
                and2="||"; //change the value of and2 to ||
                break; //move out of switch statement
        }//end of fourth switch statement
        System.out.print("Does "+x+" "+and+" "+y+" " +and2+" "+z+ " have the value true (T/t) or false (F/f) "); //print a line that asks user if the value of "x,and,y,and2,z" is true or false
        String answer; //declares the variable answer as a string
        answer=myScanner.next(); //answer is equal to the next string that the user inputs
        if(and.equals ("&&")){ //if and is equal to &&
            a=(x&&y); //then make a equal to x&&y
            if(and2.equals ("&&")){ //if and2 is equal to &&
                b=(y&&z); //make b equal to y&&z
            }else{ //or
                if(and2.equals("||")){ //if and2 is equal to ||
                    b=(y||z); //make b equal to y||z
                } //end of if statement
            } //end of else statement
            }else{ //or 
                if(and.equals("||")){ //if and is equal to ||
                    a=(x||y); //make the value of a equal to x||y
                    if(and2.equals("&&")){ //if the value of and2 is equal to &&
                        b=(y&&z); //make the value of b equal to y&&z
                    }else{ //or
                        if(and2.equals ("||")){ //if the value of and2 is equal to ||
                            b=(y||z); //make the value of y||z
                    }//end of if statement
                }//end of else statement    
            }//end of if statement
        }//end of else statement
        int response=answer.length(); //declares the variable response as and int and makes it equal to the length of characters in response
        switch (response){ //looks at the variable response
            case 1: //if it equals 1
                break; //move out of if statement
            default: //if not
                System.out.println("A single character was expected"); //print out an error message
        }//end of fifth switch statement 
        char response1; //declares the variable response1 as a char
        response1=answer.charAt(0); //says that response1 is equal to the first character in answer
        switch (response1){ //looks at the variable response1
            case 'T': //if it equals T
                r=true; //change the value of r to true
                if(r==(a&&b)){ //if (a&&b) is true
                    System.out.println("correct"); //you are correct
                    break; //move out of switch statement
                }else{ //or
                    if(r!=(a&&b)){ //if (a&&b) does not equal true
                        System.out.println("sorry try again"); //you are wrong
                        break; //move out of switch statement
                    }//end of if statement
                }//end of else statement
            case 't': //if it equals t
                r=true; //change the value of r to true
                if(r==(a&&b)){ //if (a&&b) is true
                    System.out.println("correct"); //you are correct
                    break; //move out of switch statement
                }else{ //or
                    if(r!=(a&&b)){ //if (a&&b) is not true
                        System.out.println("sorry try again"); //you are wrong
                        break; //move out of switch statement 
                    }//end of if statement 
                }//end of else statement
            case 'F': //if it equals F
                r=false; //change the value of r to false
                if(r==(a&&b)){ //if (a&&b) is false
                    System.out.println("correct"); //you are correct
                    break; //move out of switch statement
                }else{ //or 
                    if(r!=(a&&b)){ //if (a&&b) is not false
                        System.out.println("sorry try again"); //you are wrong 
                        break;//move out of switch statment
                    }//end of if statement
                } //end of else statement 
            case 'f': //if it equals f
                r=false; //change the value of r to false
                if(r==(a&&b)){ //if (a&&b) is equal to false
                    System.out.println("correct"); //you are correct
                    break; //move out of switch statement
                }else{ //or
                    if(r!=(a&&b)){ //if (a&&b) does not equal r
                        System.out.println("sorry try again"); //you are wrong
                        break;//move out of else statement 
                    }//end of if statement
                }//end of else statement
            default: //if they enter anything else
                System.out.println("You did not enter one of the choices"); //error message will appear    
        }//end of sixth switch statement
    }//end of main method
}//end of public class