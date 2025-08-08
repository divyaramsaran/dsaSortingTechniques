import java.util.Scanner;

class sort {
    void sortArray(int [] array, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            sortArray(array, start, mid);
            sortArray(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }
}

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

        sort obj = new sort();
        obj.sortArray(array, 0, length - 1);

        for(int index = 0; index < length; index++) {
            System.out.println(array[index]);
        }
    }
}