/*
The program needed to be debugged did not work as the value of i was replaced with the value of j without assigning i to a temporary value. Therefore, when the value of j was replaced with the value of i, the value of i is now j and therefore i & j will have the same value - the initial value of j.
Also, the swap function swaps the local variables i and j internally but does not return them. To solve this, the variables i and j are declared as static and public outside the main functions to ensure persistence. This also does away with the need for sending the variables i & k to the swap function.
*/

public class Swap {
    /**
    *  swaps i and j
    *  @param i 1st variable.
    *  @param j 2nd variable.
    */

    public static int i = 0;
    public static int k = 0;

    public static void swap() {
        int temp = i;
        i = k;
        k = temp;
    }
    public static void main(String[] args) {
        i = 2;
        k = 6;
        System.out.println("Original       i: " + i + " k: " + k);
        swap();
        System.out.println("After swapping i: " + i + " k: " + k);
    }
}