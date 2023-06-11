package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P3_RobotD1 extends P2_Robot {
    /*
     * As you can see, this is a daughter class based on the superclass P2_Robot;
     * Now, to implement polimorphism, I only need to rewrite the methods of the
     * superclass in this daugther class;
     */

    public P3_RobotD1() {
        super(200, 200, "BARRY");
    }

    public P3_RobotD1(float energylevel, float fuellevel, String Robotname) {
        super(energylevel, fuellevel, Robotname);
    }
    /*
     * I did two constructors to inicialize the camps in the P3_RobotD1 class;
     */

    /*
     * Now, lets suppose that this Robot has a greater security than the last one,
     * so it is needed to change the protocols to realize operations;
     */

    @Override
    public int robothash(String robotname, String defaultrobotname, String password) {
        int returningnumber;

        if (robotname.equals(robotname()) & defaultrobotname.equals("BARRY") & password.equals("GodOfWar")) {
            returningnumber = robotname.hashCode() + 1;
            JOptionPane.showMessageDialog(null,
                    "Congrats!!\nYou knew it, :D", "Correct.", 1);
        } else {
            returningnumber = 0;
            JOptionPane.showMessageDialog(null,
                    "So bad!!\nYou didn't know it, UnU", "Incorrect.", 1);
        }

        return returningnumber;
    }
    /*
     * I didn't change the input data, but I change the rest of the method;
     * That's exacly what is a Polimorphism, the same method, but, with a different
     * exit;
     */

    @Override
    public String SumOfNumbers(float number1, float number2) {
        String result;

        int temporalRobotHash = robotname().hashCode() + 1;

        int robothash = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, insert the robothash: ",
                "Hashcode Identification.", 1));

        if (robothash == temporalRobotHash) {

            int Energy = Integer.parseInt(ActualValueOfEnergy());
            int Fuel = Integer.parseInt(ActualValueOfFuel());

            if (Energy >= 2 & Fuel >= 1) {

                RechargeOfEnergy(-2);
                RechargeOfFuel(-1);

                result = String.valueOf(OperationsWithNumbers(0, number1, number2));
            } else {
                result = "Insufficient levels.";
            }

        } else {
            result = "Access denied.";
        }
        return result;
    }

    @Override
    public String RestOfNumbers(float number1, float number2) {
        String result;

        int temporalRobotHash = robotname().hashCode() + 1;

        int robothash = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, insert the robothash: ",
                "Hashcode Identification.", 1));

        if (robothash == temporalRobotHash) {

            int Energy = Integer.parseInt(ActualValueOfEnergy());
            int Fuel = Integer.parseInt(ActualValueOfFuel());

            if (Energy >= 2 & Fuel >= 1) {
                RechargeOfEnergy(-2);
                RechargeOfFuel(-1);
                result = String.valueOf(OperationsWithNumbers(1, number1, number2));
            } else {
                result = "Insufficient levels.";
            }

        } else {
            result = "Access denied.";
        }
        return result;
    }

    @Override
    public String ProductOfNumbers(float number1, float number2) {
        String result;

        int temporalRobotHash = robotname().hashCode() + 1;

        int robothash = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, insert the robothash: ",
                "Hashcode Identification.", 1));

        if (robothash == temporalRobotHash) {

            int Energy = Integer.parseInt(ActualValueOfEnergy());
            int Fuel = Integer.parseInt(ActualValueOfFuel());

            if (Energy >= 4 & Fuel >= 2) {
                RechargeOfEnergy(-4);
                RechargeOfFuel(-2);
                result = String.valueOf(OperationsWithNumbers(2, number1, number2));
            } else {
                result = "Insufficient levels.";
            }

        } else {
            result = "Access denied.";
        }
        return result;
    }

    @Override
    public String DivisionOfNumbers(float number1, float number2) {
        String result;

        int temporalRobotHash = robotname().hashCode() + 1;

        int robothash = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, insert the robothash: ",
                "Hashcode Identification.", 1));

        if (robothash == temporalRobotHash) {

            int Energy = Integer.parseInt(ActualValueOfEnergy());
            int Fuel = Integer.parseInt(ActualValueOfFuel());

            if (Energy >= 8 & Fuel >= 4) {
                RechargeOfEnergy(-8);
                RechargeOfFuel(-4);
                result = String.valueOf(OperationsWithNumbers(3, number1, number2));
            } else {
                result = "Insufficient levels.";
            }
        } else {
            result = "Access denied.";
        }
        return result;
    }

    /*
     * I did the same with these methods, the same input data, but, each one has
     * new codelines to improve their functionality;
     */

    public float[][] MatrixBasicInicialization(int rows, int columns) {
        float[][] matrix = new float[rows][columns];

        boolean key = true;
        while (key) {

            int X = Integer.parseInt(JOptionPane.showInputDialog(null, "Which row do you want to fill?",
                    "Row number.", 1));

            int Y = Integer.parseInt(JOptionPane.showInputDialog(null, "Which column do you want to fill?",
                    "Column number.", 1));

            matrix[X][Y] = Float.parseFloat(JOptionPane.showInputDialog(null, "Which number do you want to keep in?",
                    "Cell Inicialization.", 1));

            key = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "(Please write, true or false)",
                    "Do you want to fill another cell?", 1));
        }

        return matrix;
    }
}
