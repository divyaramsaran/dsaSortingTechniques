import java.util.Scanner;

public class heapSort {
    public static void main(String[] args) {
        System.out.println("Enter the length of the array");
        int length;
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();

        System.out.println("Enter the elements of the array");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}