import java.util.Scanner;

class sort {
    int [] sort (int [] array, int length) {
        for (int index = 0; index < length - 1; index++){
            int subIndex = index + 1;
            while(subIndex != 0){
                if(array[subIndex] < array[subIndex - 1]) {
                    array[subIndex] = array[subIndex] + array[subIndex - 1];
                    array[subIndex - 1] = array[subIndex] - array[subIndex - 1];
                    array[subIndex] = array[subIndex] - array[subIndex - 1];
                }
                subIndex--;
            }
        }
        return array;
    }
}


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