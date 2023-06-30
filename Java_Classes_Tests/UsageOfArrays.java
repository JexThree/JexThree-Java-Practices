package Java_Classes_Tests;

import java.util.Arrays;

public class UsageOfArrays {

    public static void main(String[] args) {
        /*
         * An array is a set of values of the same type;
         * There are two ways to initialize an array;
         */

        // 1) Type of data[] <array name> = new Type of data[num of elements];
        int[] arrayOfInts = new int[8];

        // 2) Type of data[] <array name> = {value1, value2, ..., valueN};
        char[] arrayOfChars = { '1', '2', '3' };

        /*
         * To acces to a certain value of the array;
         * You have to write de position of the data in the array counting until 0;
         * arrayname[value position];
         * The position of the final value is num of elements -1;
         */

        System.out.println(arrayOfChars[0]);
        arrayOfInts[0] = 123;

        /*
         * You can access to each value of an array using a for cicle;
         */

        for (int c = 0; c < 3; c++)
            System.out.println(arrayOfChars[c]);
        // This is a normal for;

        for (char c : arrayOfChars)
            System.out.println(c);
        // This is a improved for;

        /*
         * Now, let's face some of the array's methods;
         * To use these methods, it is necessary to import the library java.util.Array;
         */

        String[] arrayOfStrings = { "Eduardo", "Brenda", "Diego", "Alex", "Kike" };
        int example;

        /*
         * 1) .binarySearch( <arrayName>, valueInArray ) --> index int
         * It will look for the position of the value signed in the parameters;
         * It will return the index of the value as an int;
         */

        example = Arrays.binarySearch(arrayOfStrings, "Eduardo");
        System.out.println("");
        System.out.println("binarySearch( <arrayName>, valueInArray ) --> index int");
        System.out.println("The index of Eduardo is " + example);

        /*
         * 2) .copyOf( <arrayName>, lenghtOfTheNewOne ) --> Array
         * It will copy the elements of an array to another one;
         * Both have to be the same type of data;
         */

        String[] copyOfStrings = Arrays.copyOf(arrayOfStrings, 4);
        // Note: It will copy until the lenght signed, but it won't copy the limit
        // number;

        System.out.println("");
        System.out.println("copyOf( <arrayName>, lenghtOfTheNewOne ) --> Array");
        for (String c : copyOfStrings)
            System.out.println(c);

        /*
         * 3) .copyOfRange( <arrayName>, leftLimit, rightLimit ) --> Array
         * It will copy the elements of an array to another one;
         * It'll work with two limits;
         * Both have to be the same type of data;
         * This case wont reach the limits signed;
         */

        copyOfStrings = Arrays.copyOfRange(arrayOfStrings, 1, 3);

        System.out.println("");
        System.out.println("copyOfRange( <arrayName>, leftLimit, rightLimit ) --> Array");
        for (String c : copyOfStrings)
            System.out.println(c);

        /*
         * 4) .equals( <arrayName>, <arrayName> ) --> boolean (true/false)
         * It'll compare to arrays and will return a boolean (true/false) value;
         */

        char[] arrayOfChars2 = { '1', '2', '3' };
        boolean flag = Arrays.equals(arrayOfChars, arrayOfChars2);

        System.out.println("");
        System.out.println("equals( <arrayName>, <arrayName> ) --> boolean (true/false)");
        if (flag) {
            System.out.println("They're the same.");
        } else {
            System.out.println("They aren't the same.");
        }

        /*
         * 5) .fill( <arrayName>, newValue ) --> void
         * This method is in charge to change the value of each element;
         * It'll change it with the value signed;
         */

        Arrays.fill(arrayOfChars2, '4');
        System.out.println("");
        System.out.println("fill()");
        for (char c : arrayOfChars2)
            System.out.println(c);

        /*
         * 6) .toString( <arrayName> )
         * This method will return a String of the values in the array;
         * { value1, value2, ..., valueN }
         */

        System.out.println("");
        System.out.println("toString()");
        System.out.println("arrayOfInts: " + Arrays.toString(arrayOfInts));

    }
}
