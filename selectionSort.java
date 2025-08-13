import java.util.Scanner;

public class selectionSort {
    public static void main(String args []) {
        System.out.println("Enter the array length");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter array elements");
        int array [] = new int [length];
        for (int index = 0; index < length; index++) {
            array[index] = sc.nextInt();
        }
    }
}