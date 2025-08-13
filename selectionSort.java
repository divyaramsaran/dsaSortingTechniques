import java.util.Scanner;

class sort {
    int [] sortArray (int [] array, int length) {
        for(int index = 0; index < length - 1; index++) {
            int minIndex = index;
            for(int subIndex = index + 1; subIndex < length ; subIndex++) {
                    if(array[subIndex] < array[minIndex]) {
                        minIndex = subIndex;
                    }
            }
            if(index != minIndex) {
                array[index] = array[index] + array[minIndex];
                array[minIndex] = array[index] - array[minIndex];
                array[index] = array[index] - array[minIndex];
            }
        }
        return array;
    }
}

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

        sort obj = new sort();
        int [] sortedArray = obj.sortArray(array, length);
        for(int element : sortedArray) {
            System.out.println(element);
        }
    }
}