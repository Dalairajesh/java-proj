package javatutorial;

public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        b = a++; // first use value and then update value
        //b = ++a; // first update value and then use value

        System.out.println(a);
        System.out.println(b);
    }
}
