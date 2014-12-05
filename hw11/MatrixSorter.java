//Fayzah Di Natale
//CSE02
//Matrix Sorter program
//program will generate a random 3d array and then sort the third slab 
public class MatrixSorter{ //define a public class
    public static int [][][] buildMat3d(){ //method that produces a 3d array
        int length=0; //declare and initalize the variable length as 0 
        int length2=0; //declare and initialize the variable length2 as 0
        int [] [] [] array=new int [3][][]; //declare and allocate spaces for a 3d aracy called array
        for(int i=0; i<3; i++){ //for loop 
            length=3+2*i; //make length equal to 5*i
            array[i]=new int[length][]; 
            for(int j=0; j<length; j++){ //for loop 
                length2=i+j+1; //make lengh equal to i+j+1
                array[i][j]=new int [length2]; //
                for(int k=0; k<length2; k++){ //for loop 
                    int x=(int)(Math.random()*99)+1; //initialize the variable x as a random number between 1 and 99 
                    array[i][j][k]=x; //make aray[i][j][k]=x
                }//end of for loop 
            } //end of for loop 
        } //end of for loop 
        return array; //return array
    } //end of method 
    
    public static void show(int[][][]array){ //method that accepts a 3d array as input 
        for(int s=0; s<3; s++){ //for loop 
            for(int t=0; t<3+2*s; t++){ //for loop 
                for(int r=0; r<s+t+1; r++){ //for loop 
                    System.out.print(array[s][t][r]+" "); //print out the arrat 
                } //end of for loop 
                System.out.println(); //print out a blank line 
            } //end of for loop 
            System.out.println(); //print out a blank line 
        } //end of for loop 
    }  //end of method 
    public static int findMin(int[][][] array){ //method that returns an int and takes a 3d arat as input 
        int minimum=Integer.MAX_VALUE; //declare the variable minimum and make it equal to the minimum 
        for(int s=0; s<3; s++){ //for loop 
            for(int t=0; t<3+2*s; t++){ //for loop 
                for(int r=0; r<s+t+1; r++){ //for loop 
                    if(array[s][t][r]<minimum){ //if array[s][t][r] is less than minimum it must be the minimum 
                        minimum=array[s][t][r]; //make that the minimum now 
                    } //end of if statement 
                } //end of for loop 
            } //end of for loop 
        } //end of for loop 
        return minimum; //return minimum 
    } //end of method 
    public static void sort(int[][]array){ //method that will print the sorted array, and accept a 2d array as input 
        int answer=0;  //declare the variable answer as an int and make it equal to 0
        for(int i=0; i<array.length; i++){ //for loop 
            for(int j=1; j<array[i].length; j++){ //for loop 
                for(int k=0; k<array[i].length; k++){ //for loop 
                    if(array[i][j]<array[i][k]){ //if array[i][j] is less than array [i][k]
                        answer=array[i][j]; //make answer equal to array [i][j]
                        array[i][j]=array[i][k]; //make array [i][j] equal to array [i][k]
                        array[i][k]=answer; //make array[i][k] equal to answe
                    } //end of if statement 
                } //end of for loop 
            } //end of for loop 
        } //end of for loop 
    } //end of method 
    public static void main(String arg[]){ //main method 
        int mat3d[][][]; //declares an array called mat3d
        mat3d=buildMat3d(); //sets mat3d equal to buildMat3d
        show(mat3d); //calls the method show
        System.out.println("The smallest entry in the 3D matrix is "+findMin(mat3d)); //shows the minimum of the array
        System.out.println("After sorting the 3rd matrix we get"); //after sorting the arra
        sort(mat3d[2]); //calls the sort method 
        show(mat3d); //calls the show method
    } //end of main method
}//end of public class
