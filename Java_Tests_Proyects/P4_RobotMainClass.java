package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P4_RobotMainClass {
    public static void main(String args[]) {

        /*
         * P3_RobotD1 robot01 = new P3_RobotD1(100, 100, "Chuck");
         * 
         * float[][] Matrix1 = robot01.MatrixBasicInicialization(2, 2);
         * 
         * for(float[] Raw : Matrix1){
         * for(float Cell : Raw){
         * System.out.print(Cell + "   ");
         * }
         * System.out.println("");
         * }
         */

        P5_SuperRobotClass[] References = new P5_SuperRobotClass[2];

        References[0] = new P2_Robot(100, 100, "NS-4");
        References[1] = new P3_RobotD1(100, 100, "NS-5");
        /*
         * These are examples of downcasting;
         * It is a reference to a daughter class inside an array done in a superclass;
         */

        float number1 = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Insert a number.", "Insert number one.", 1));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Insert a number.", "Insert number two", 1));
        /*
         * These are the numbers used for the method;
         */

        System.out.println(References[1].robothash("NS-5", "Barry", "GodOfWar"));

        for (P5_SuperRobotClass Cells : References) {
            System.out.println(Cells.SumOfNumbers(number1, number2));
            /*
             * These are the polymorphism calls;
             */
        }

        /*
         * Anything before is part of the Polymorphism subject;
         */
        References[0].JaJa();

    }
}
