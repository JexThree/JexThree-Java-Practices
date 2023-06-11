package Java_Classes_Tests;

import javax.swing.JOptionPane;

import Java_Tests_Proyects.P2_Robot;

public class AccessModifiersInJava {
    public static void main (String args[]){
        /*
         * These are the mods of java;
         * 1) public = The method or variable is accessible for everybody. All the people can use it and look at it;
         * 2) private = The method or variable is only accessible inside the class. You can't use it out the class;
         * 3) protected = The method or variable is only accessible for the daughter's classes of a father class;
         * 4) friendly = The method or variable is only accessible for the classes in the same package. 
         *    (This mod doesn't exist properly. If you want to use it, you only need to write nothing.);
         * We use them to indicate the visibility of a certain camp(Atribute) or a method;
         */

        // To check it up, I'm going to use the P2_Robot class.

        P2_Robot robot1 = new P2_Robot(100, 100,"Sony");
        // Here, the object <robot1> is refering to the P2_Robot class, :D;

        /*
         * As you remember, the variable energylevel is private, so the next syntaxis is incorrect;
         * robot1.energylevel;
         * robot1.fuellevel;
         * That's why I created the ActualvalueOfEnergy method and ActualvalueOfFuel one;
         */

        JOptionPane.showMessageDialog(null, robot1.ActualValueOfEnergy(), "The level of energy.", 1);
        JOptionPane.showMessageDialog(null, robot1.ActualValueOfFuel(), "The level of fuel.", 1);

        /*
         * Now, let's suppose that you want to do several calcules;
         */

        float numer1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Write a number.", "Numer 1.", 3));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Write a number.", "Numer 2.", 3));
        
        System.out.println("The rest of " + numer1 + " and " + number2 + " :\n" + robot1.RestOfNumbers(numer1, number2));
        System.out.println("The sum of " + numer1 + " and " + number2 + " :\n" + robot1.SumOfNumbers(numer1, number2));
        System.out.println("The product of " + numer1 + " and " + number2 + " :\n" + robot1.ProductOfNumbers(numer1, number2));
        System.out.println("The division of " + numer1 + " and " + number2 + " :\n" + robot1.DivisionOfNumbers(numer1, number2));

        JOptionPane.showMessageDialog(null, robot1.ActualValueOfEnergy(), "The level of energy.", 1);
        JOptionPane.showMessageDialog(null, robot1.ActualValueOfFuel(), "The level of fuel.", 1);
    }
}
