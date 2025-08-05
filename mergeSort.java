import java.util.Scanner;

class mergeSort {
    public static void main(String [] args){
        System.out.println("Enter the array length");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int array [] = new int [length];
        System.out.println("Enter the array elements");

        for(int range = 0; range < length; range++) {
            array[range] = sc.nextInt();
        }
        for(int index = 0; index < length; index++) {
            System.out.println(array[index]);
        }
    }
}