import javax.naming.PartialResultException;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExcerciseDay5 {
    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();

    }

    public static void question1() {
        int[] array = {50, -20, 0, 30, 40, 60, 10};
        if (array.length >= 2 && array[0] == array[array.length - 1]) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void question2() {
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        int len = array.length;
        int total = 0;
        double average;

        for (int i = 0; i < len; i++) {
            total = total + array[i];
        }
        average = total / (double) len;
        System.out.println("The average is: " + average);

        System.out.print("The numbers that are greater than average are: ");
        for (int i = 0; i < len; i++) {
            if (array[i] > average) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void question3() {
        int[] array = {20, 30, 40};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Larger Value between first and last element: " + max);
    }


    public static void question4() {
        int[] array = {20, 30, 40};
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Array should have at least two elements for swapping.");
        }

    }

    public static void question5() {
        int[] arr = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void question6() {
        int[] array1 = {2, 3, 6, 6, 4};
        int[] array2 = {2, 3, 6, 6, 4};
        if (Arrays.equals(array1, array2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}