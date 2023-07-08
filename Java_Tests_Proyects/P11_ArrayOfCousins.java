package Java_Tests_Proyects;

import java.util.Scanner;

public class P11_ArrayOfCousins {

    private int[] array;
    private int arraySize;
    private static Scanner keyboard = new Scanner(System.in);

    public P11_ArrayOfCousins(int num) {
        array = new int[num];
        arraySize = num;

        for (int square = 0; square < arraySize; square++) {

            boolean flag = true;

            while (flag) {

                int randomNum = (int) (Math.random() * 10);
                int copyOfRandNum = randomNum;
                int counter = 0;

                while (copyOfRandNum > 1) {

                    int residous = randomNum % copyOfRandNum;

                    if (residous == 0)
                        counter++;

                    copyOfRandNum--;
                }

                if (counter == 1) {
                    array[square] = randomNum;
                    flag = false;
                }
            }
        }
    }

    public void printerOfNumbers() {
        for (int square = 0; square < arraySize; square++)
            System.out.println(array[square]);
    }

    public void printerOfMajorNumber() {
        int major = array[0];

        for (int square = 0; square < arraySize; square++) {
            int value = array[square];

            if (value > major)
                major = value;
        }

        System.out.println(major);
    }

    public static void main(String[] args) {

        System.out.println("Insert the size of the array: ");
        int num = keyboard.nextInt();

        P11_ArrayOfCousins array = new P11_ArrayOfCousins(num);

        System.out.println("\nThese are the numbers in the array: ");
        array.printerOfNumbers();

        System.out.println("\nThis is the biggest number in the array: ");
        array.printerOfMajorNumber();
    }
}
