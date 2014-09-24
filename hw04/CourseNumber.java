//Fayzah Di Natale
//Course Number Java Program
//CSE 02
//
//
//Program will ask the user to enter a six digit number and then prints semester and year of that number 
import java.util.Scanner;//input a scanner class
public class CourseNumber{ //define a class
    public static void main(String[] args){ //add a main method
        Scanner myScanner; //you must declare the use of scanner in order to accept input 
        myScanner= new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print ("Enter a six digit number giving the course semester "); //asks the user to enter a six digit number giving the course semester and year
        if (myScanner.hasNextInt()){ //checks that the user enters an int
            int answer=myScanner.nextInt(); //declares the variable "answer" as an int and that it is the next int that the user enters
            if(answer>=186510 && answer<=201440){ //the program will check if "answer" is inside of the range  
                int number1; //declares the variable "number1" as an int
                number1=(answer%100); //states that "number1" is equal to the last two digits of "answer"
                if (number1==10 || number1==20 || number1==30 ||number1==40){ //checks if "number1" is equal to 10,20,30, or 40
                    double number2; //declares the variable "number2" as a double
                    number2=(answer*.01); //states that "number2" is the first 4 digits of "answer"
                    if (number1==10){ //checks if "number1" is equal to 10
                        System.out.println ("The course was offered in the spring semester of "+(int)(number2*100)/100); //if it is equal to 10 then it will tell that the class was in the spring semester of a year, which is determined by the variable "number2" being explicitly casted to an int
                        }else{ //if "number1" does not equal 10 go here
                            if (number1==20){ //checks if "number1" is equal to 20 
                                System.out.println("The course was offered in the Summer 1 semester of "+(int)(number2*100/100)); //if it is equal to 20 then it will tell that the class was in the first summer semester of a year, which is determined by the variable "number2" being explicitly casted to an int
                                }else{ //if "number1" does not equal 20, go here 
                                    if (number1==30){ //checks if "number1" is equal to 30 
                                        System.out.println("The course was offered in the Summer 2 semester of "+(int)(number2*100)/100); //if it is equal to 30 then it will tell that the class was in the seconds summer semester of a year which is determined by the variable "number2" being explicitly casted to an int 
                                    }else{ //if "number2" does not equal 30 go here
                                        if (number1==40){ //checks if "number1" is equal to 40 
                                            System.out.println("The course was offered in the fall semester of "+(int)(number2*100)/100); //if it is equal to 0 then it will tell that the class was in the fall semester of a year, which is determined by the variable "number2" being explicitly casted to an int 
                                }//end of if statement
                            }//end ofelse statement
                        } //end of else statement
                    }// end of else statement
                }else{ //if "number1" is not equal to 10,20,30, or 40 then go here
                    System.out.println(number1+" is not a legitimate semester"); //program will print out this if the value for number 1 is wrong
                    return;//end program 
                }//end of else statement
            }else{ //if "answer" is not in the range, go here 
                System.out.println("Your answer is not inside of the range"); //program will print out this if the value for "answer" is not in the range
                return; //end program
            }//end of else statement 
        }//end of if statement
    } //end of main method 
} //end of class 