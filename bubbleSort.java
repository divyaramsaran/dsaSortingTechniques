import java.util.Scanner;

class sort {
    int[] sortArray (int [] array, int length) {
        for(int index = 0; index < length - 1; index++) {
            for(int subIndex = 0; subIndex < length - 1 - index; subIndex++) {
                if(array[subIndex] > array[subIndex + 1]) {
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
        int array[] = new int[length];
        System.out.println("Enter array elements");

        for(int range = 0; range < length; range++) {
                array[range] = sc.nextInt();
        }

        sort obj = new sort();
        int [] sortedArray = obj.sortArray(array, length);

        for(int index = 0; index < length; index++){
            System.out.println(sortedArray[index]);
        }
    }
}