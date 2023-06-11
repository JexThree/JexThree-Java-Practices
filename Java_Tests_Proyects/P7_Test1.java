package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P7_Test1 {
    public static void main(String args[]) {

        String key = JOptionPane.showInputDialog(null, "Write the number of the excercise: ", "Menu of selection.", 1);

        switch (key) {

            case "1":
                // Excersice 1;
                JOptionPane.showMessageDialog(null, "Welcome to excersice 1.");
                int count = 0;
                float a1 = 1f, b1 = 2f;
                float[] Results = new float[5];

                while (count <= 4) {
                    Results[count] += (count == 0) ? a1 + b1 : 0;
                    Results[count] += (count == 1) ? a1 - b1 : 0;
                    Results[count] += (count == 2) ? a1 * b1 : 0;
                    Results[count] += (count == 3) ? a1 / b1 : 0;
                    Results[count] += (count == 4) ? a1 % b1 : 0;
                    System.out.printf("%nValue in " + count + ": " + Results[count]);
                    count++;
                }
                break;

            case "2":
                // Excersice 2;
                JOptionPane.showMessageDialog(null, "Welcome to excersice 2.");
                float a2 = 0, b2 = 0;

                for (int C = 0; C > -2; C--) {
                    if (C == 0)
                        a2 = Float
                                .parseFloat(JOptionPane.showInputDialog(null, "Insert a number. ", "Number of a.", 1));
                    else
                        b2 = Float
                                .parseFloat(JOptionPane.showInputDialog(null, "Insert a number. ", "Number of b.", 1));
                }

                boolean Abiggest = (a2 > b2) ? true : false;
                if (Abiggest)
                    JOptionPane.showMessageDialog(null, "The number " + a2 + " is the biggest.");

                boolean Equal = (a2 == b2) ? true : false;
                if (Equal)
                    JOptionPane.showMessageDialog(null, "The numbers " + a2 + " and " + b2 + " are the same.");

                boolean Bbiggest = (a2 < b2) ? true : false;
                if (Bbiggest)
                    JOptionPane.showMessageDialog(null, "The number " + b2 + " is the biggest.");
                break;

            case "3":
                // Excersice 3;
                String name = JOptionPane.showInputDialog(null, "Insert your name: ", "Initialization interface.", 1);
                JOptionPane.showMessageDialog(null, "You're welcome " + name + ".", "Hello there.", 1);
                break;

            case "4":
                // Excersice 4;
                double radius = Double.parseDouble(
                        JOptionPane.showInputDialog(null, "Insert the radius of the circle: ", "Area of a circle.", 1));
                double area = Math.PI * (Math.pow(radius, 2));
                JOptionPane.showMessageDialog(null, "The total area is " + area + " square units.");
                break;

            case "5":
                // Excersice 5;
                float number = Float.parseFloat(
                        JOptionPane.showInputDialog(null, "Insert a number.", "Number divided into two.", 1));
                boolean flag = number % 2 == 0;
                if (flag)
                    JOptionPane.showMessageDialog(null, "It's an exact division.");
                else
                    JOptionPane.showMessageDialog(null, "It doesn't have an exact division.");
                break;
            case "6":
                int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert a number from the ASCII code.",
                        "Traslator of ASCII", 1));
                char ASCIIcode = (char) code;
                JOptionPane.showMessageDialog(null, "This is the ASCII reference: " + ASCIIcode + ".",
                        "ASCII translation.", 1);
                break;

            case "7":
                String code2 = JOptionPane.showInputDialog(null, "Insert a code from the ASCII code.",
                        "Traslator of ASCII", 1);
                char code2char = code2.charAt(0);
                int numericalindex = (int) code2char;
                JOptionPane.showMessageDialog(null, "The numerical index is " + numericalindex + ".",
                        "The index reference of the ASCII code.", 1);
                break;
        }
    }
}
