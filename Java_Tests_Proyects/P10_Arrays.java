package Java_Tests_Proyects;

import java.util.Scanner;

public class P10_Arrays {

    protected int[] array;
    protected int arraySize;
    protected int arraySum;
    protected Scanner keyboard = new Scanner(System.in);

    public P10_Arrays(int num) {
        array = new int[num];
        arraySize = num;
        // Here, I'm initializing the array;

        System.out.println(" ");
        for (int square = 0; square < num; square++) {
            // The loop is going to initialize the array;

            int value = (int) (Math.random() * 10);
            // I'm keepting the random number in the value field;

            array[square] = value;
            // Here, I'm keepting the value in the actual square of the array;
        }

        System.out.print("The numbers of your array are: ");
        for (int square = 0, numMinusOne = num - 1; square < num; square++) {
            if (square < numMinusOne)
                System.out.print(array[square] + ", ");
            else
                System.out.println(array[square] + ".");
        }
        System.out.println(" ");

        System.out.print("The sum of all your array numbers is: ");
        for (int square = 0; square < num; square++) {
            arraySum += array[square];
        }
        System.out.print(arraySum + ".");

        System.out.println(" ");
    }

    public void arrayInitialization() {
        System.out.println("");
        for (int square = 0; square < arraySize; square++) {
            int num = square + 1;
            System.out.println("Insert the number for the square " + num + ": ");
            array[square] = keyboard.nextInt();
        }
    }

    public void arrayPrinter() {
        System.out.println("");
        for (int square = 0; square < arraySize; square++) {
            int num = square + 1;
            System.out.println("The actual value " + num + " in the array is " + array[square] + ".");
        }
    }

    public void arraySum() {
        arraySum = 0;
        System.out.println("");
        for (int square = 0; square < arraySize; square++) {
            arraySum += array[square];
        }
        System.out.println("The actual sum of the array is: " + arraySum);
    }

    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Insert the size of your array: ");
            int num = keyboard.nextInt();

            P10_Arrays array = new P10_Arrays(num);

            array.arrayInitialization();
            array.arrayPrinter();
            array.arraySum();
        }
    }
}
