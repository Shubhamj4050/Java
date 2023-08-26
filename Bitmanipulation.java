import java.util.*;
public class Bitmanipulation {
    public static void main(String args[]){
        //get bit operation
        //ques
        //Get the 3rd bit position = 2 of a no. n   n= 0101
        // int n= 5;
        // int pos =2;
        // int bitMask= 1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("Bit was zero");

        // }
        // else{
        //     System.out.println("bit was one");
        // }


        //set bit
        //set the 2nd bit position = 1 of a no. n n= 0101
        // int n= 5;
        // int pos =1;
        // int bitMask= 1<<pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);
        
        
        //clear bit
        // clear the 3rd bit of a no. n = 0101
        // int n= 5;
        // int pos =2;
        // int bitMask= 1<<pos;
        // int newNumber = ~(bitMask);
        // int number= newNumber & n;
        // System.out.println(number);

        //update bit
        // update the 2nd position of a no. n to 1 n = 0101
        //for 1
        //bitmask   1<<i
        //operation and with not
        Scanner sc = new Scanner(System.in);

        int n= 5; //0101
        int pos =1;
        int oper = sc.nextInt();// update bit to one else with 0
         int bitMask= 1<<pos;
        if(oper==1){
            
            int newNumber = bitMask |n;//0111
            System.out.println(newNumber);
        } else{
            int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
        



        // for 0
        //bit mask: 1<<i
        //operator : or
        

    }
}