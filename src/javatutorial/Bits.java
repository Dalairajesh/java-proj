package javatutorial;

import java.util.Scanner;

public class Bits {

    // set bit:2 Ques: set the 2nd bit (position =1) of a number n. (n = 0101) Bit Mask : i << i Operation : or
    public static void  setBits() {
        int j =5;
        int position = 1;
        int bitMasks  = 1 << position;
        int newNumber = bitMasks | j;
        System.out.println(newNumber);
    }

    //clear bit: 3 Ques: clear the 3rd bit (position = 2) of a number n. (n = 0101) Bit Mask: i << i operation AND with not

    public static void clearBit() {
        int j =5; // 0101
        int position = 2;
        int bitMasks  = 1 << position;
        int notBitMask =  ~(bitMasks);
        int newNumber = notBitMask & j;
        System.out.println(newNumber);
    }


    // update bit: 4 Ques: update the 2nd bit (position = 1) of a number n to 1 (n = 0101)
    // for 1 Bit mask : 1 <<i operation : AND with NOT
    // For 0 Bit Mask: 1 <<i Operation: OR

    public static void updateBit () {
        Scanner sc = new Scanner(System.in);

        int j =5; // 0101
        int position = 1;
        int oper = sc.nextInt();
        int bitMasks  = 1 << j;
        if(oper == 1){

            int newNumber = bitMasks & j;
            System.out.println(newNumber);
        } else {
            int newBitMask = ~(bitMasks);
            int newNumber = newBitMask & j;
            System.out.println(newNumber);
        }



    }
    public static void main(String[] args) {

        int n =5;
        int pos = 2;
        int bitMask  = 1 << pos;

        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }



        setBits();
        clearBit();
        updateBit();
    }


}
