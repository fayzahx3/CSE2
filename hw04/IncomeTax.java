//Fayzah Di Natale
//Income Tax Java Program
//CSE 02
//
//
//Program will ask user to enter an int that gives the of thousands of dollars of income 
//the program will then write the amount of tax on the income 
import java.util.Scanner; //input the scanner class 
public class IncomeTax{ //define a class 
    public static void main(String[] args){ //add a main method 
        Scanner myScanner; //must declare the use of scanner in order to accept input
        myScanner=new Scanner(System.in); //you have to construct an instance of the scanner class so that it knows you will be using the scanner
        System.out.print("Enter an int giving the number of thousands of dollars "); //program will ask the user to enter the amount in thousands of dollars 
        if (myScanner.hasNextInt()){ //checks if the user entered an int
            int nThousands=myScanner.nextInt(); //declares the variable "nThousands" as an int, and then sets it equal to the next int 
            if (nThousands>0){ //checks if "nThousands" is greater than 0
                if(nThousands<20){ //checks if "nThousands" is less than 20 
                    int actualNumber; //declares actualNumber as an int 
                    actualNumber=nThousands*1000; //states that "actualNumber" is equal to "nThousands" times 1000
                    double taxRate; //declares the variable "taxRate" as a double
                    taxRate=5; //states that taxRate is equal to 5
                    taxRate/=100; //sets "taxRate" to taxRate divided by 100
                    double incomeTax; //declares the variable "incomeTax" as a double 
                    incomeTax=actualNumber*taxRate; //states that "incomeTax" is equal to "actualNumber" times "taxRate"
                    System.out.println("The tax rate on $"+actualNumber+" is "+(int)(taxRate*100)+"% and the tax is $"+(int)(incomeTax*100)/100.00);
                    //program displays "actualNumber", tells the tax rate for that number and the amount of tax on that number 
                }else{ //if the nThousands is not less than 20 go here 
                    if(nThousands>=20 && nThousands<40){ //checks if nThousands is greater than or equal to 20, and is less than 40
                        int actualNumber; //declares "actualNumber" as an int
                        actualNumber=nThousands*1000; //states that actualNumber is equal to nThousands times 1000
                        double taxRate2; //declares "taxRate2" as a double
                        taxRate2=7; //states that taxRate2 is equal to 7
                        taxRate2/=100; //sets "taxRate2" to "taxRate2" divided by 100
                        double incomeTax2; //declares the variable "incomeTax2" as a double 
                        incomeTax2=actualNumber*taxRate2; //states that "incomeTax2" is equal to "actualNumber" times "taxRate2"
                        System.out.println("the tax rate on $"+actualNumber+" is "+(int)(taxRate2*100)+"% and the tax is $"+(int)(incomeTax2*100)/100.00);
                        //program displays "actualNumber", tells the tax rate for that number and the amount of tax on that number 
                        }else{ //if nThousands is not greater than or equal to 20 and less than 40 go here 
                            if(nThousands>=40 && nThousands<78){ //checks if nThousands is greater than or equal to 40 and less than 78
                                int actualNumber; //declares the variable "actualNumber" as an int 
                                actualNumber=nThousands*1000; //states that "actualNumber" is equal "nThousands" times 1000
                                double taxRate3; //declares "taxRate3" as a double 
                                taxRate3=12; //staes that "taxRate3"is equal to 12
                                taxRate3/=100; //sets "taxRate3" to "taxRate3" divided by 100
                                double incomeTax3; //declares the variable "incomeTax3" as a double 
                                incomeTax3=actualNumber*taxRate3; //states that "incomeTax3 is equal to "actualNumber" times "taxRate3"
                                System.out.println("the tax rate on $"+actualNumber+" is "+(int)(taxRate3*100)+"% and the tax is $"+(int)(incomeTax3*100)/100.00);
                                //program displays "actualNumber", tells the tax ratefor thatnumber and the amount of tax on that number 
                                }else{ //if nThousands is not greater than or equal to 40 and less than 78 go here 
                                    if(nThousands>=78){ //checks if nThousands is greater than or equal to 78
                                      int actualNumber; //declares the variable "actualNumber" as an int 
                                        actualNumber=nThousands*1000; //states that "actualNumber" is equal to "nThousands" times 1000
                                        double taxRate4; //declares "taxRate4" as a double 
                                        taxRate4=14; //states that "taxRate4" is equal to 14
                                        taxRate4/=100; //sets taxRate4" to "taxRate4" divided by 100
                                        double incomeTax4; //declares the variable "incomeTax4" as a double 
                                        incomeTax4=actualNumber*taxRate4; //states that "incomeTax4" is equal to "actualNumber" times "taxRate4"
                                        System.out.println("the tax rate on $"+actualNumber+" is "+(int)(taxRate4*100)+"% and the tax is $"+(int)(incomeTax4*100)/100.00); 
                                        //program displays "actualNumber" tell the tax rate for that numberand the amount of tax on that number 
                                    } // end of if statement 
                                } //end of else statement 
                            } //end of else statement 
                        } //end of else statement 
                    }else{ //if the user did not enter a positive number, go here 
                        System.out.println("You did not enter a positive number"); //the program will tell you that you did not enter a positive number 
                        return; //end the program 
                } //end of else statement 
            }else{ //if the user did not enter an int, go here 
                System.out.println("You did not enter an int"); //the program will tell you that you did not enter an int 
                return; //end the program 
        } //end of else statement 
    } //end of main method 
} //end of public class 