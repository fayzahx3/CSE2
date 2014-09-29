//Fayzah Di Natale
//Burger King Java Program
//CSE 02 
//
//
//program will ask the user to enter their choice of a burger, a soda, or fries
//the program then asks the user for details of their choices 
//then tells you what you ordered 
import java.util.Scanner; //input the Scanner class
public class BurgerKing{ //define a class
    public static void main(String[] args){ //add a main method 
        Scanner myScanner; //must declare the use of scanner to accept input
        myScanner=new Scanner(System.in); //you must construct an instance of the scanner class so that it knows you will be using it 
        System.out.println("Enter a letter to indicate choice of"); //askes the user to pick their choice
        System.out.println("Burger (B or b) or"); //asks if they want a burger
        System.out.println ("Soda (S or s) or"); //or if they want a soda
        System.out.print("Fries (F or f): "); //or if they want fries
        String answer; //declares the variable answer as a string
        answer= myScanner.next(); //states the answer is equal to the next string input from the user
        int amount; //declares the variable amount as an int
        amount=answer.length();//states that amount is equal to the length of characters answer
        switch (amount){ //this will look at the variable amount
            case 1: //if amount is equal to one
                break; //the program will move on
            default: //if not
                System.out.println("A single character was expected"); //the program will print an error message
        }//end of switch statement
        if (answer.equals ("B") || answer.equals ("b")){ //if the user entered "B" or "b"
            System.out.println("Enter A or a for all the toppings or"); //then the program will ask them to chose if they want all the toppings
            System.out.println("Enter C or c for cheese or"); //do they want cheese
            System.out.print("Enter N or n for none of the above "); //or do they want nothing on their hamburger
            String burger; //declares the variable burger as a string
            burger=myScanner.next(); //states that burger is equal to the next string inputted by the user
            int burger2; //declares the variable burger2 as an int
            burger2=burger.length(); //states that burger2 is equal to the length of characters in burger
            switch (burger2){ //looks at the variable burger2
                case 1: //if burger2 is equal to 1 
                    break; //the program will move on out of the switch statement
                default: //if not
                    System.out.println("A single character was expected"); //the program will print an error message
            }//end of switch statement
            char burger3;//declares the variable burger 3 as a char
            burger3=burger.charAt(0); //says that burger 3 is equal to burger at length 0
            switch (burger3){//looks at burger3
                case 'A': //if burger3=A
                    System.out.println("You ordered a Burger with everything"); //will print out order
                    break;  //move out of switch statement
                case 'a': //if burger3=a
                    System.out.println("You ordered a burger with everything");//will print out order
                    break;//move out of switch statement
                case 'C'://if burger3=C
                    System.out.println("You ordered a burger with cheese");//will print out order
                    break;//move out of switch statement
                case 'c'://if burger3=c
                    System.out.println("You ordered a burger with cheese");//will print out order
                    break;//move out of switch statement
                case 'N'://if burger3=N
                    System.out.println("You ordered a burger with nothing");//will print out order
                    break;//move out of switch statement
                case'n'://if burger3=n
                    System.out.println("You ordered a burger with nothing");//will print out order
                    break;//move out of switch statement
                }//move out of switch statement
            }else{ //if not
                    if(answer.equals ("S") || answer.equals ("s")){ //check if answer equals S or s
                        System.out.println("Enter P or p for Pepsi or"); //program will as if the user wants pepsi or
                        System.out.println("Enter C or c for Coke or"); //program will as if the user wants coke or
                        System.out.println("Enter S or s for Sprite or");//program will as if the user wants sprite or
                        System.out.print("Enter M or m for Mountain Dew ");//program will as if the user wants mountain dew
                        String soda; //declares the variable soda as a variable
                        soda=myScanner.next(); //says that soda is equal to the next string the user inputs
                        int soda2; //declares the variable soda2 as an int
                        soda2=soda.length(); //says that soda2 is equal to the length of characters in soda
                        switch (soda2){ //looks at soda2
                            case 1: //if the length is 1 character
                                break;//move out of switch statement
                            default://if not
                                System.out.println("A single character was expected"); //program will print out an error message
                        }//move out of switch statement   
                        char soda3; //declares soda3 as a char
                        soda3=soda.charAt(0); //says that soda3 is equal to soda at length 1
                        switch (soda3){ //looks at the variable soda3
                            case 'P': //If soda3=P
                                System.out.println("You ordered a Pepsi");//will print out order
                                break;//move out of switch statement
                            case 'p'://If soda3=p
                                System.out.println("You ordered a Pepsi");//will print out order
                                break;//move out of switch statement
                            case 'C'://If soda3=C
                                System.out.println("You ordered a Coke");//will print out order
                                break;//move out of switch statement
                            case 'c'://If soda3=c
                                System.out.println("You ordered a Coke");//will print out order
                                break;//move out of switch statement
                            case 'S'://If soda3=S
                                System.out.println("You ordered a Sprite");//will print out order
                                break;//move out of switch statement
                            case 's'://If soda3=s
                                System.out.println("You ordered a Sprite");//will print out order
                                break;//move out of switch statement
                            case 'M'://If soda3=M
                                System.out.println("You ordered a Mountain Dew");//will print out order
                                break;//move out of switch statement
                            case 'm'://If soda3=m
                                System.out.println("You ordered a Mountain Dew");//will print out order
                                break;//move out of switch statement
                }//move out of switch statement    
            }else{//if not
                if (answer.equals ("F")|| answer.equals ("f")){// check if answer equals F or f
                    System.out.println("Enter L or l for large or");//program will as if the user wants large fries or
                    System.out.print("Enter S or s for Small "); //program will as if the user wants small fries
                    String fries; //declares the variable fries as a string
                    fries=myScanner.next(); //says that fries is equal to the next string the the user inputs
                    int fries2; //declares the variable fries2 as an int
                    fries2=fries.length();//sats that fries2 is equal to the length of characters in fries
                    switch (fries2){//looks at the variable fries2
                        case 1: //if fries2 is equal to 1
                            break;//move out of switch statement
                        default: //if not
                            System.out.println("A single character was expected"); //system will print an error messafe
                    }//move out of switch statement
                    char fries3; //declares fries3 as a char
                    fries3=fries.charAt(0); //says the fries3 is equal to fries at length 1
                    switch (fries3){ //looks at the variable fries3
                        case 'L'://Ifries3=L
                            System.out.println("You ordered large fries");//will print out order
                            break;//move out of switch statement
                        case 'l'://Ifries3=l
                            System.out.println("You ordered large fries");//will print out order
                            break;//move out of switch statement
                        case 'S'://Ifries3=S
                            System.out.println("You ordered small fries");//will print out order
                            break;//move out of switch statement
                        case 's'://Ifries3=s
                            System.out.println("You ordered small fries");//will print out order
                            break;//move out of switch statement
                        }//move out of switch statement   
                    }else{ //if not
                    System.out.println("You did not enter one of the choices"); //program will print out error message
                    return; //end program
                }//end of else statement
            }//end of else statement        
        }//end of else statement    
    }//end of main method
}//end of class


                
