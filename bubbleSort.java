import java.util.Scanner;

class sort {
    void sortArray () {

    }
}

class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = sc.nextInt();
        System.out.println(length);
        int array[] = new int[length];
        System.out.println("Enter array elements");
        for(int range = 0; range < length; range++) {
                array[range] = sc.nextInt();
        }
    }
}