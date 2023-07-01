package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P8_LoopExercises {
    public static void main(String[] args) {

        // 1) Steristics triangle;
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the number of the base: ", "Making an steristics triangle.", 1));
        // Here, you can insert the size of the triangle;

        for (int line = 0; line < number; line++) {
            // The first for will count the lines;

            for (int column = 0; column <= line; column++)
                // The second for will count the columns;
                System.out.print("*");

            // When the columns are done, it will make a line jump;
            System.out.println("");
        }

        System.out.println("");
        // 2) Steristics inverse triangle;
        int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the number of the base: ", "Making an steristics triangle.", 1));
        // Here, you can insert the size of the triangle;

        int numbert2 = number2;
        // Its function is to be a reference number;

        for (int line = 0; line < number; line++) {
            // The first for will count the lines;

            for (int column = 0; column < numbert2; column++)
                // The second for will count the columns;
                System.out.print("*");

            // When the columns are done, it will make a line jump;
            System.out.println("");

            // This is going to reduce the columns limit for each period;
            numbert2--;
        }

    }
}