import java.util.Scanner;

public class quickSort {
    public static void main(String args []) {
        System.out.println("Enter the length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the array elements");
        int arrary [] = new int[length];
        
        for(int i = 0; i < length; i++) {
            arrary[i] = sc.nextInt();
        }
    }
}