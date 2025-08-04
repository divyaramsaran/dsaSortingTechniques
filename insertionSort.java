import java.util.Scanner;

class insertionSort {
    public static void main (String[] args) {
        System.out.println("Enter length of the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int array[] = new int [length];
        for(int range = 0; range < length; range++) {
            array[range] = sc.nextInt();
        }  
    }
}