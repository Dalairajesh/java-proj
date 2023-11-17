package javatutorial;

public class Recursion1 {

    // Q Print Numbers from 5 to 1
    // Q Print Numbers from 1 to 5
    // Q print sum of first n natural numbers
    // Q print factorial of a number n
    // Q print the fibonacci sequence till nth term*
    // Q print x^n (stack height = n)
    // Q print x^n ( stack height = logn)

    // Question1
    public static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
    public static void printNumber2(int n) {
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumber2(n+1);


    }

    public static  void printSum(int i, int n, int sum) {
        if(i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
       printSum(i+1, n, sum);
    }

    public static int printFactorial(int n) {
        if(n == 1 || n == 0) {
            return  1;
        }

       int fact_nm1 = printFactorial(n-1);
       int fact_n = n * fact_nm1;
       return fact_n;
    }

    public static void printFib (int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    public  static int calcPower(int x, int n) {
        if(n == 0 ) { //base case 1
            return  1;
        }
        if( x == 0) { // base case 2
            return 0;
        }
        int xPower = calcPower(x, n-1); // kaam
        int xPown = x * xPower;
        return xPown;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
//        printNumber(n);
//        printNumber2(m);
//        printSum(1, 5,0);
//        int ans = printFactorial(n);
//        System.out.println(ans);
//        int a =0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int k =7;
//        printFib(a, b, k-2);


        int x = 2, j = 5;
        int ans = calcPower(x,j);
        System.out.println(ans );
    }
}
