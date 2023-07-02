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

        System.out.println("");
        // 3) Triangle of numbers;
        int number3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the number of steps.", "Triangle of numbers.", 1));
        // Here, you can insert the size of the triangle;

        for (int line = 1; line <= number3; line++) {
            // This first cicle will count the lines;

            for (int colunm = 1; colunm <= line; colunm++)
                // This second cicle will count the column;
                System.out.print(line);
            /*
             * Here, we're going to print the number of the line;
             * If we're in number one, all the step will be full of ones;
             * If we're in number two, all the step will be full of twos;
             * etc;
             */

            System.out.println("");
            // This will make a line jump;
        }

        System.out.println("");
        // 4) Triangle of numbers, rung by rung;
        int number4 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the number of step.", "Triangle of numbers, rung by rung", 1));
        // Here, you can indicate the triangle size;

        for (int line = 0; line < number4; line++) {
            // This cicle will count the line number;

            int t = 1;
            // This little variable will count the rung number in each step;

            for (int column = 0; column <= line; column++) {
                // This cicle will count the column number;

                System.out.print(t);
                /*
                 * It'll print the number t(rung) in each iteration;
                 * If it's in one, it'll be one, two will be two, three will be three, etc;
                 */

                t++;
                // It will increase the number t in each iteration;
            }

            System.out.println("");
            // This will do a line jump;
        }
    }
}