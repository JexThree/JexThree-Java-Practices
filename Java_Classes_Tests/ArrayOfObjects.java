package Java_Classes_Tests;

import Java_Tests_Proyects.P2_Robot;
import Java_Tests_Proyects.P3_RobotD1;

import javax.swing.JOptionPane;

public class ArrayOfObjects {
    public static void main(String args[]) {
        /*
         * As we have learned, it is possible to play with the reference of an object;
         * Also, we've learned that is possible to create an array of a type;
         * Playing with those caracteristics it's possible to use and array of a
         * superclass type and to fill ot with daughter classes references;
         * 
         * Firts, let's see and example of a superclass array;
         */

        int size = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the size of the superclass array.", "The father class;", 1));
        // This variable is usefull to initialize the superclass array;

        P2_Robot[] arrayOfSuperClass = new P2_Robot[size];
        // As you can see, it is the superclass array;

        for (int n = 0; n < size; n++) {
            float energyLevel = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Insert the energy level: ", "Robot energy level.", 1));
            // This is to asign the energy level field;

            float fuelLevel = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Insert the fuel level: ", "Robot fuel level.", 1));
            // This is to asign the fuel level field;

            String robotName = JOptionPane.showInputDialog(
                    null, "Insert the name:", "Robot name", 1);
            // This is to asign the name field;

            arrayOfSuperClass[n] = new P2_Robot(energyLevel, fuelLevel, robotName);
        }
        /*
         * This for cicle will create a reference in each array square;
         * As you can see, this all structure is only focused in the superclass array;
         * So, each square is pointing to a superclass type reference;
         * 
         * Now, let's see how to do daughterclass' references in a superclass' array;
         */

        int size2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insert the size of the daughter-superclass array.", "The daughter-father class;", 1));
        // This variable is usefull to initialize the daughter-superclass array;

        P2_Robot[] arrayOfSuperClass2 = new P2_Robot[size2];
        // It is the superclass array, which will contain daughterclass' references;

        for (int n = 0; n < size2; n++) {
            float energyLevel = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Insert the energy level: ", "Robot energy level.", 1));
            // This is to asign the energy level field;

            float fuelLevel = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Insert the fuel level: ", "Robot fuel level.", 1));
            // This is to asign the fuel level field;

            String robotName = JOptionPane.showInputDialog(
                    null, "Insert the name:", "Robot name", 1);
            // This is to asign the name field;

            arrayOfSuperClass2[n] = new P3_RobotD1(energyLevel, fuelLevel, robotName);
            // As you can see, it is possible to point to a daughter reference in a
            // superclass array;
        }
        /*
         * This for cicle will create a reference in each array square;
         * As you can see, this all structure is only focused in the superclass array;
         * So, each square is pointing to a superclass type reference;
         * 
         * Now, let's see how to do daughterclass' references in a superclass' array;
         */
    }
}
