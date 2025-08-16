//Complete the function printNumber which takes an integer input from the user and prints it on the screen.

import java.util.Scanner;

public class io {

    public static void printNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
    }

    public static void main(String[] args) {
        printNumber();
    }
}
