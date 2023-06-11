package Java_Classes_Tests;

public class ReferencesInJava {
    public static void main(String args[]) {
        int array1[] = new int[10];
        /*
         * The word "new" is use to point to a certain java class;
         * When a camp like "array1[]" is created using the word new, we are talking
         * about a reference;
         * It is beacuse the "array1[]" is refering to a certain class, the class: int
         * [];
         */

        int array2[] = null;
        /*
         * With the word "null", we're saying that the camp is not pointing to a cetain
         * class;
         * The java cleaner is going to clean the unnecesary stuff in the camp, so we're
         * going to be saving memory;
         * You can call the java cleaner in a handly way with the comand System.gc();
         */

        if (array2 == null) {
            System.out.println("The array is empty." + "\nThe reference is undetermined");
        }
        /*
         * You can compare arrays in order to find out if they're null;
         * It is usefull to locate empty spaces in the memory;
         */

        array1[0] = -1;
        array2 = array1;

        if (array2 == array1) {
            System.out.println("\nThey're pointing to the same direction." + "\nThe reference is the same");
        }
        /*
         * You can compare if they're potinting to the same direction.
         */

        if (array2 != array1) {
        }
        System.out.println("\nThey aren't pointing to the same direction." + "\nThe reference isn't the same.");
        /*
         * Or, if they're pointing to a diferent direction.
         */
    }
}
