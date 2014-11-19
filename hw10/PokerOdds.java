//Fayzah Di Natale
//CSE02
//Poker Java Program 
//
//the program will randomly deal a hand of cards to the user and will show the user what they got 
//this will continue for as long as the user wants, then it will simulate this 10000 and show how many times each rank had exactly one duplicate in each hand, and how many hands had no pairs
import java.util.Random; //input the Random class
import java.util.Scanner; //input the scanner class
public class PokerOdds{ //define a public class 
  public static boolean exactlyOneDup2(int num[]){ //method that is called exactlyOneDup2 and returns a boolean, it accepts an array of ints 
    boolean answer=true; //declare the variable answer as a boolean and make it equal true
    for(int i=0; i<num.length; i++){ //for loop that declares the variable i as an int and makes it equal to 0, runs as along as i is less than the length of the array and increments i after each run 
        int j=0; //declares the variable j as an int and sets it equal to 0
        while(j<5){ //while loop that runs while j is less than 5
            if(num[j]==num[i]){  //checks if num[j]==num[i]
                if(j==i){ //then check if j==i
                    answer=false; //sets answer to false
                } //end of if statement 
                else{ //else 
                    answer=true; //make answer true 
                    duplicate++; //add 1 to duplicate
                } //end of else statement 
            } //end of if statment 
            else{ //else 
                answer=false; //answer is equal to false
            } //end of else statement 
            j++; //increment j by 1
        } //end of while loop
    } //end of for loop 
    if(duplicate==2){ //if duplicate is equal to 2 
        answer=true;  //answer is equal to true 
    } //end of if statement 
    return answer; //return answer 
  } //end of method 
  public static void simulateOdds(){  //method that doesnt return anything but prints out, and is called simulate odds 
    int duplicate=0; //decalre the variable dublicate as an int and set it equal to 0
    int[] deck2= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51}; //create a new array called deck, and assign the values for all the memebers 
    int[] hand2={-1, -1, -1, -1, -1}; //create a new array called deck, and assign the values for all the memebers 
    for (int x=0; x<10000; x++){ //for loop that declares the variable x as an int and sets it equal to 0, runs as long as x is less than 10000 and increments x by 1 after each run 
      int index=0;  //decalre the variable index as an int and set it equal to 0
      int multiplier=52;  //decalre the variable multiplier as an int and set it equal to 52
      int cardNumber=51; //decalre the variable cardNumber as an int and set it equal to 51
      int cardNumber2=51; //decalre the variable cardNumber2 as an int and set it equal to 51
      int cardSuit=0; //decalre the variable cardSuit as an int and set it equal to 0
      int cardRank=0; //decalre the variable cardRank as an int and set it equal to 0
      int duplicate=0;  //declare the variable duplicate as an int and make it equal to 0
      for(int number=0; number<5; number++){ //for loop that declares the variable number as an int and sets it equal to 0, runs as long as number is less than 5 and increments number by 1 after each run 
        index=(int)(Math.random()*multiplier);  //make the variable index equal to a random number between 0 and the multiplier
        multiplier--;   //decrease multiplier by 1
        hand2[number]=deck2[index]; //make hand[number]=deck[index]
        deck2[index]=deck2[cardNumber]; //make deck[index] equal to deck[cardNumber]
        deck2[cardNumber2]=-1; //set deck[cardNumber2] equal to -1 
        cardRank=hand2[number]%13;//make cardSuit equal to hand[number] divided by 13
        String y=findRank(cardRank); //declare the variable y as a String and make it equal to findRank(cardRank)
        cardNumber--; //decrease the value of cardNumber
        cardNumber2--; //decrease the value of cardNumber2
      } //end of for loop 
      boolean answer=exactlyOneDup2(hand2); //declare the variable answer as a boolean and make it equal to exactlyOneDup2(hand2)
      if(answer==true){ //if answer is equal to true
        duplicate++; //add one to duplicate
      } //end of if statment 
    } //end of for loop 
    String [] newDeck={"A","K","Q","J","10","9","8","7","6","5","4","3","2"}; //create a new array of Strings and assign values for each of the members 
    System.out.println("rank  freq of exactly one pair"); //print out
    for(int first=0; first<13; first++){ //for loop that declares the variable first as an int and sets it equal to 0 and runs if first is less than 13 and increments first by 1 after each run 
      System.out.println(newDeck[first]); //print out newDeck[first]
    } //end of for loop 
  } //end of method 
  public static String findRank(int cardRank){ //a method that returns a String and is called findRank and accepts an int 
    String rank=""; //declare the variable of rank as a String and make it equal to ""
    switch(cardRank){ //switch the variable cardRank
      case 0:  //if it is equal to 0
        rank="A"; //rank is equal to A
        break; //break 
      case 1: //if it is equal to 1
        rank="K"; //rank is equal to  K 
        break; //break 
      case 2: //if it is equal to 2
        rank="Q"; //rank is equal to Q
        break; //break 
      case 3: //if it is equal to 3
        rank="J"; //rank is equal to  J 
        break; //break 
      case 4: //if it is equal to 4
        rank="10"; //rank is equal to 10
        break; //break 
      case 5: //if it is equal to 5
        rank="9"; //rank is equal to 9
        break; //break 
      case 6: //if it is equal to 6
        rank="8"; //rank is equal to 8
        break; //break 
      case 7: //if it is equal to 7
        rank="7"; //rank is equal to  7
        break; //break 
      case 8: //if it is equal to 8
        rank="6"; //rank is equal to 6
        break; //break 
      case 9: //if it is equal to 9
        rank="5"; //rank is equal to  5
        break; //break 
      case 10: //if it is equal to 10
        rank="4"; //rank is equal to 4
        break; //break 
      case 11: //if it is equal to 11
        rank="3"; //rank is equal to 3
        break; //break 
      case 12: //if it is equal to 12
        rank="2"; //rank is equal to 2
        break; //break 
    } //end of switch statement 
    return rank; //return rank 
  } //end of findRank method 
  public static void showHands(){ //a method that does not return anything, but prints something out, and is called showHands
    Scanner scan=new Scanner(System.in); //you must declare the use of scanner in order to accept input you have to construct an instance of the scanner class so that it knows you will be using the scanner
    String answer=""; //declare the variable answer as a String and set it equal to ""
    int[] deck= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51}; //create a new array called deck, and assign the values for all the memebers 
    int[] hand={-1, -1, -1, -1, -1}; //create a new array called hand and assign the values for each member
    int index=0; //decalre the variable index as an int and set it equal to 0
    int multiplier=52;  //declare the variable multiplier as an int and set it equal to 52
    int cardNumber=51; //declare the variable cardNumber as an int and set it equal to 51
    int cardNumber2=51; //declare the variable cardNumber2 as an int and set it equal to 51
    String suit="Clubs"; //declare the variable suit as a String and set it equal to clubs
    String suit2="Diamonds"; //declare the variable suit2 as a String and set it equal to diamonds
    String suit3="Hearts"; //declare the variable suit3 as a String and set it equal to hearts
    String suit4="Spades"; //declare the variable suit4 as a String and set it equal to spades 
    int cardSuit=0; //declare the variable cardSuit and set it equal to 0
    int cardRank=0; //declare the variable cardRank and set it equal to 0
    String x="";  //declare the variable x as a String and set it equal to ""
    String y=""; //declare the variable y as a String and set it equal to ""
    String z=""; //declare the variable z as a String and set it equal to ""
    String s=""; //declare the variable s as a String and set it equal to ""
    do{ //do the following 
      x=""; //set the variable x equal to ""
      y=""; //set the variable y equal to ""
      z="";  //set the variable z equal to ""
      s=""; //set the variable s equal to ""
      for(int number=0; number<5; number++){ //for loop that declares the variable number as an int and sets it equal to 0, runs as long as number is less than 5 and increments number by 1 after each run 
        index=(int)(Math.random()*multiplier); //make the variable index equal to a random number between 0 and the multiplier
        multiplier--;  //decrease multiplier by 1
        hand[number]=deck[index]; //make hand[number]=deck[index]
        deck[index]=deck[cardNumber]; //make deck[index] equal to deck[cardNumber]
        deck[cardNumber2]=-1; //set deck[cardNumber2] equal to -1 
        cardSuit=hand[number]/13; //make cardSuit equal to hand[number] divided by 13
        cardRank=hand[number]%13; //make cardRank equal to hand[number]%13
        switch(cardSuit){ //switch the variable cardsuit
          case 0: //if it is equal to 0 
            suit="Clubs"; //suit is equal to clubs 
            x+=" "+findRank(cardRank); //add the value of findRank(cardRank) to x 
            break; //break 
          case 1: //if it is equal to 1 
            suit2="Diamonds"; //suit is equal to diamonds
            y+=" "+findRank(cardRank); //add the value of findRank(cardRank) to y
            break; //break 
          case 2: //if it is equal to 2
            suit3="Hearts"; //suit is equal to hearts
            z+=" "+findRank(cardRank); //add the value of findRank(cardRank) to z
            break; //break 
          case 3: //if it is equal to 3
            suit4="Spades"; //suit is equal to spades
            s+=" "+findRank(cardRank); //add the value of findRank(cardRank) to s
            break; //break 
        } //end of switch statment 
        cardNumber--; //decrease the value of cardNumber by 1 
        cardNumber2--; //decrease the value of cardNumber2 by 1
      } //end of for  loop 
      System.out.println(suit+" "+x); //print out the suit and card number 
      System.out.println(suit2+" "+y); //print out the suit and card number
      System.out.println(suit3+" "+z); //print out the suit and card number
      System.out.println(suit4+" "+s); //print out the suit and card number
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //ask the user if they want to go again 
      answer=scan.next(); //answer is equal to their next input 
    } //end of do loop 
    while(answer.equals("Y") || answer.equals("y")); //do above while the user entered Y or y 
  } //end of showHands method 
  public static void main(String [] arg){ //main method 
    showHands(); //call the method showHands
    simulateOdds(); // call the method simulateOdds()
  }//end of main method 
} //end of public class 
