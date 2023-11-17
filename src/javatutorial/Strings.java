package javatutorial;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String Declaration
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Your name is:"+ name);

        // concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName.length());

        // charAt
//        for(int i =0; i< fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }
        // compare
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.compareTo(name2) == 0){
            System.out.println("Stringa are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(new String("Tony") == new String("Tony")) {
            System.out.println("Stringa are equal");
        }else {
            System.out.println("Strings are not equal");
        }


        // String Builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert a char at index 2
        sb.insert(2, 'N');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2,3);
        System.out.println(sb);

        // reverse a string
         StringBuilder reverse = new StringBuilder("Rajesh Dalai");

         for (int i =0; i< reverse.length()/2; i++) {
             int front = i;
             int back = reverse.length() -1 -i;

             char frontChar = reverse.charAt(front);
             char backChar = reverse.charAt(back);

             reverse.setCharAt(front, backChar);
             reverse.setCharAt(back, frontChar);
         }

        System.out.println(reverse);
    }
}
