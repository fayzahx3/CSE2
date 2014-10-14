//Fayzah Di Natale
//CSE02
//Roulette Java Program
//
//
//the program will randomly select a number between 00 and 36
//the program will spin the wheel 100 times generating random number, and repeat this process 1000 times 
//the program will display the amount of times the users number was the same as the random number generated
//the program will display the amount of times the users number was not the same as the random number generated
//the program will display the number of times the user made a profit
//the program will display the total winnings the user made
public class Roulette{ //define a class
    public static void main(String[] args){ //add a main method
        int correct=0; //declare the variable correct as an int and make it equal to 0
        int wrong=0; //declare the variable wrong as an int and make it equal to 0
        int time1=0; //delcare the variable time1 as an int and make it equal to 0
        int time2=0; //declare the variable time2 as an int and make it equal to 0
        int totalCorrect=0; //decalre the variable totalCorrect as an int and make it equal to 0
        int totalWrong=0; //declare the variable totalWrong as an int and make it equal to 0
        int totalLoss=0; //declare the variable totalLoss as an int and make it equal to 0
        int totalWon=0; //decalre the variable totalWon as an int and make it equal to 0
        int timesWon=0; //declare the variable timesWon as an int and make it equal to 0
        int timesLost=0; //declare the variable timesLost as an int and make it equal to 0
        int answer= ((int)(Math.random())*38); //declare the variable answer and set it equal to a random number between 0 and 37
        switch (answer){ //this will look at the variable answer
            case 37: //if answer is 37
                answer=00; //change the value of answer to 00
        } //end of switch statement   
        while (time1<1000){ //perform the following while the variable time1 is less than 1000  
            time2=0; //set the variable time2 to 0
            while(time2<100){ //perform the follwing while the variable time 2 is less than 100
                correct=0; //set the value of correct equal to 0
                wrong=0; //set the value of the variable wrong to 0
                int number=(int)(Math.random()*38);//this declares the variable number as an int, and then makes it equal a random number between 0 and 37
                switch (number){ //this will look at the variable number
                    case 37: //if number is equal to 37
                        number=00; //set the variable number equal to 00
                } //end of switch statement
                if (number==answer){ //if the variable number is equal to the variable anwer
                    correct++; //add one to the variable correct
                } //end of if statement
                else{ //if the variable number is not equal to the variable answer 
                    wrong++; //add one to the variable wrong
                } //end of else statement
                totalCorrect+=correct; //make the value of totalCorrect equal to correct plus totalCorrect
                totalWrong+=wrong; //make the value of totalWrong equal to wrong plus totalWrong
                totalWon=totalCorrect/3; //make the value of totalWon equal to totalCorrect/3
                if (totalCorrect!=0){ //if totalCorrect does not equal 0
                        timesWon=(int)(totalWon); //make timesWon equal to totalWon and explicitly cast it to an int
                } //end of if statement
                time2++; //add 1 to the value of time2
            } //end of 2nd while loop
            time1++; //add 1 to the value of time1
        } //end of first while loop
        System.out.println("Your bet on the number "+answer);
        System.out.println("Your number appeared: "+totalCorrect+" times"); //print out the number of times the users number showed up
        System.out.println("Your number did not show up: "+totalWrong+" times"); //print out the number of times the users number did not show up
        System.out.println("You walked away with a profit for 1000 repititons of 100 spins: "+timesWon+" times"); //print out the number of times the user made a profit
        System.out.println("You won a total of $"+timesWon*36); //print out the total winnings that the user made
    } //end of main method
} //end of public class