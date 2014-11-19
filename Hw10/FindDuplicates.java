import java.util.Scanner;
public class FindDuplicates{
    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }   
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    public static boolean hasDups(int num[]){
        boolean answer=true;
        int duplicate=0;
        for(int i=0; i<num.length; i++){
            int j=9;
            while(j>=0){
                if(num[j]==num[i]){ 
                    if(j==i){
                        answer=false;
                    }
                    else{
                        answer=true;
                        duplicate++; 
                    }
                }
                else{
                    answer=false;
                }
                j--;
            }
        }
        if(duplicate>0){
            answer=true;
        }
        return answer; 
    }
    public static boolean exactlyOneDup(int num[]){
        boolean answer=true;
        int duplicate=0; 
        for(int i=0; i<num.length; i++){
            int j=0;
            while(j<10){
                if(num[j]==num[i]){ 
                    if(j==i){
                        answer=false;
                    }
                    else{
                        answer=true;
                        duplicate++;
                    }
                }
                else{
                    answer=false;
                }
                j++;
            }
        }
        if(duplicate==2){
            answer=true; 
        }
        return answer; 
    }
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
        do{
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
            }while(answer.equals("Y") || answer.equals("y"));
    }
}
