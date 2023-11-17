package javatutorial;

public class test {
    public static void main(String[] args) {
        int arr[] = {8, 7, 12, 5};
        // time complexity = 0(n^2)
        // bubble sort
        for(int i =0; i<arr.length-1; i++) {
            System.out.print("Value of i"+arr[i]);
            for(int j =0; j< arr.length-i-1; j++) {
                System.out.println("value of j"+arr[j]);
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


    }
}
