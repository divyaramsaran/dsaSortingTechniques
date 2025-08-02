import java.util.Scanner;

class sort {
    int sortArray (array, length) {
        for(int index = 0; index < length; index++) {
            for(int subIndex = 0; subIndex < length - i; subIndex++) {
                if(array[subIndex] > arr[subIndex + 1]) {
                    array[subIndex] = array[subIndex] + array[subIndex + 1];
                    array[subIndex + 1] = array[subIndex] - array[subIndex + 1];
                    array[subIndex] = array[subIndex] - array[subIndex + 1];
                }
            }
        }
        return array;
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