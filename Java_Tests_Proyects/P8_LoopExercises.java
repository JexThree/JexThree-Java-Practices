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

        System.out.println("");
        // 5) Steristics pyramid;
        int number5 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the highness of the pyramid.", "Steristics pyramid.", 1));
        // This will indicate pyramid highness;

        int sp1 = number5 - 1;
        // This field will count the spaces;

        int s1 = 1;
        // This field will count the steristics;

        for (int a = 1; a <= number5; a++) {
            // The first huge for will count the pyramid steps;

            for (int b = 1; b <= sp1; b++)
                // The second for will do spaces according to sp1;
                System.out.print(" ");

            for (int c = 1; c <= s1; c++)
                // The third for will do steristics according to s1;
                System.out.print("*");

            System.out.println("");
            // After the two fors, it'll make a line jump;

            sp1--;
            s1 += 2;
            // It's going to reduce the spaces and to increase the steristics;
        }

        System.out.println("");
        // 6) Inverse steristics pyramid;
        int number6 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the highness of the pyramid.", "Inverse steristics pyramid", 1));
        // This will indicate the pyramid highness;

        int sp2 = 0;
        // This variable will count the number of spaces;

        int s2 = (2 * number6) - 1;
        // This variable will count the number of steristics;

        for (int a = 1; a <= number6; a++) {
            // The first huge for will count the pyramid steps;

            for (int b = 1; b <= sp2; b++)
                // The second for will do spaces according to sp2;
                System.out.print(" ");

            for (int c = 1; c <= s2; c++)
                // The third for will do steristics according to s2;
                System.out.print("*");

            System.out.println("");
            // After the two fors, it'll make a line jump;

            s2 -= 2;
            sp2++;
            // It's going to reduce the steristics and to increase the spaces;
        }
    }
}