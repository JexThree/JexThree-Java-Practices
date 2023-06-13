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
                // Excercise 6;
                int code = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert a number from the ASCII code.",
                        "Traslator of ASCII", 1));
                char ASCIIcode = (char) code;
                JOptionPane.showMessageDialog(null, "This is the ASCII reference: " + ASCIIcode + ".",
                        "ASCII translation.", 1);
                break;

            case "7":
                // Excercise 7;
                String code2 = JOptionPane.showInputDialog(null, "Insert a code from the ASCII code.",
                        "Traslator of ASCII", 1);
                char code2char = code2.charAt(0);
                int numericalindex = (int) code2char;
                JOptionPane.showMessageDialog(null, "The numerical index is " + numericalindex + ".",
                        "The index reference of the ASCII code.", 1);
                break;

            case "8":
                // Excercise 8;
                float ProductPrice = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Insert the price of the product: ", "Calcule of a product price.", 1));
                float finalPrice = ProductPrice * (1.21f);
                JOptionPane.showMessageDialog(null, "The final price is " + finalPrice + " coins.");
                break;

            case "9":
                // Excercise 9;
                for (byte timer = 1; timer <= 100; timer++)
                    System.out.println("The actual number is " + timer + ".");
                break;

            case "10":
                // Excercise 10;
                byte timer2 = 1;
                while (timer2 <= 100) {
                    System.out.println("The actual number is " + timer2 + ".");
                    timer2++;
                }
                break;

            case "11":
                // Excercise 11;
                for (int timer3 = 1; timer3 <= 100; timer3++) {
                    boolean residuos = (timer3 % 2 == 0 | timer3 % 3 == 0) ? true : false;
                    if (residuos)
                        System.out.println("The actual number is " + timer3 + ".");
                }
                break;

            case "12":
                // Excercise 11;
                int squares = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insert the number of sales:", "Sales array.", 1));
                float[] salesArray = new float[squares];
                float result = 0;
                int X = 0;
                // First I the fields for this excersice;
                for (float box : salesArray) {
                    box = Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Insert the amount of a sale.", "Initialization.", 1));
                    salesArray[X] = box;
                    result += salesArray[X];
                    X++;
                }
                /*
                 * Then, I used a for cicle to initialise the array;
                 * But also to make the sum;
                 */
                JOptionPane.showMessageDialog(null,
                        "The total sum is: " + result, "The amount of sales.", 1);
                break;
        }
    }
}
