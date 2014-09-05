//Fayzah Di Natale
//Cyclometer Java Program
//September 5, 2014
//CSE 02
//lab 02
//
//
//program prints number of minutes for each trip
//program prints number of counts for each trip
//program prints distance of each trip in miles
//program prints the distance for the two trips combined 

//define a class
public class Cyclometer{
    //main method required for every program 
    public static void main(String[] args) {
        // input data 
        int secsTrip1=480; //prints number of seconds for trip 1
        int secsTrip2=3220; //prints number of seconds for trip 2 
        int countsTrip1=1561; //prints counts of trip 1
        int countsTrip2=9037; //prints counts of trip 2 
        // intermediate variables and output data 
        double wheelDiameter=27.0, 
            //makes the wheel diameter a precise decimal number 
        PI=3.14159, 
            //value of PI 
        feetPerMile=5280, 
            //number of feet in a mile
        inchesPerFoot=12, 
            //number of inches in foot 
        secondsPerMinute=60; 
            //number of seconds per minute
        double distanceTrip1, distanceTrip2, totalDistance;
            //makes the values of Trip 1, 2 and the total distance able to be precise decimals
        System.out.println ("Trip 1 took "+ 
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts");  
        System.out.println ("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts");  
        //run calculations
        //Document the calculations here 
        //This is the number of minutes for trip 1 and the number of counts for trip 2
        distanceTrip1=countsTrip1*wheelDiameter*PI;
            //above gives distance in inches 
            //for each count a rotation of the wheel travels the diameter in inches times PI 
        distanceTrip1/=inchesPerFoot*feetPerMile; 
            // gives distance in miles 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
            //print the output data 
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println ("Trip 1 was "+distanceTrip1+" miles");
        System.out.println ("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }  //end of main method 
} // end of class