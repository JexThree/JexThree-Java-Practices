package Java_Classes_Tests;

public class MultidimensionalArrays {
    /*
     * To understand what a multidimensional array is;
     * You have to imagine an unidimensional array inside another one;
     * Then, you're going to have a multidimensional array;
     */

    public static void main(String[] args) {

        int[][] multidimensionalIntArray = new int[2][2];
        /*
         * It is a multidimensional array;
         * Imagine it as a matrix;
         * A matrix works using columns and rows;
         * The first square bracket[] is to initialize rows;
         * And the second one is to initialize columns;
         * So, in the previous example, we're having a "matrix" of two by two;
         */

        multidimensionalIntArray[0][0] = 1;
        /*
         * It is needed to specify the number of the row and the column;
         * If you want to asign a value in a certain square of the array;
         * An also there is something important to remark;
         * The limits of an array are always determined by rest one to the
         * initialization value;
         * In the example, we're working with a two by two array;
         * So the row limit is going to be 2-1 = 1;
         * That happens also with the column limit;
         */

        int[][] multidimensionalIntArrayTwo = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 } };
        /*
         * Another way to declare a multidimensional array is with this structure;
         * type_of_data[][] arrayName ={{velue, value, value}, {value, value, value}};
         * As you can see, it looks like several arrays inside a huge one;
         * But, to understand it as a matrix, you only have to look at each inside array
         * as a row;
         * And a column is going to be every value in each rect line;
         * Like: Column one = {1, 6, 11, 16}, Column two = {2, 7, 12, 17}, etc.;
         */

        /*
         * A multidimensional array is no more than a set of data;
         * So as it, you can use several Java structures to work with every square;
         */

        for (int row = 0; row <= 3; row++) {
            for (int column = 0; column <= 4; column++)
                System.out.print(multidimensionalIntArrayTwo[row][column] + " ");
            System.out.println("");
        }

        /*
         * The previous fors are going to print each value inside of the array;
         * That's one of the ways to use the data inside of this kind of arrays;
         */
    }
}