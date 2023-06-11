package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P2_Robot extends P5_SuperRobotClass{
    // This is the continue of the AccesModifiers part;

    // Now, let's create a default constructor;
    public P2_Robot() {
        this.energylevel = 100;
        this.fuellevel = 100;
        this.robotname = "ROB";
    }
    /*
     * This constructor have to be public beacuse:
     * If you're going to create an object based on this class in another class, the
     * object needs to be inicialized;
     */

    public P2_Robot(float energylevel, float fuellevel, String robotname) {
        this.energylevel = energylevel;
        this.fuellevel = fuellevel;
        this.robotname = robotname;
    }
    /*
     * It is the same case that before;
     * The object needs to be constructed;
     */

    @Override
    public void CreateARobothash() {
        this.robothash = this.robotname.hashCode();
    }

    public void CreateARobothash(String robotname) {
        this.robothash = robotname.hashCode();
    }
    /*
     * I created two options to inicialize the robot hash;
     */

    /*
     * Now, let's suppose that you need to now the hashcode of the robot;
     * But, that's a super secret data, so if you want to find out it;
     * You're going to:
     * 1) To give the robotname;
     * 2) To give the deafult robotname;
     * 3) To give the secret password = SuperMarioBros;
     */

    @Override
    public int robothash(String robotname, String defaultrobotname, String password) {
        int returnednumber;

        if (robotname.equals(this.robotname) & defaultrobotname.equals("ROB") & password.equals("SuperMarioBros")) {
            returnednumber = this.robothash;
            JOptionPane.showMessageDialog(null,
                    "Congrats!!\nYou knew it, :D", "Correct.", 1);
        } else {
            returnednumber = 0;
            JOptionPane.showMessageDialog(null,
                    "So bad!!\nYou didn't know it, UnU", "Incorrect.", 1);
        }

        return returnednumber;
    }
    // To finish with this, let's suppose that out robot needs to solve math's
    // problems;
    // And let's suppose that after using a certain method the robot is going to
    // loose a certain level of fuel and energy;

    // This method is only going to do Sums;
    // After using a sum, the robot will lose 1 level of fuel and 2 of energy;
    @Override
    public String SumOfNumbers(float number1, float number2) {
        String result;

        if (this.energylevel >= 2 & this.fuellevel >= 1) {
            this.energylevel -= 2;
            this.fuellevel -= 1;
            result = String.valueOf(OperationsWithNumbers(0, number1, number2));
        } else {
            result = "Insufficient levels.";
        }
        return result;
    }

    // This method is only going to do Rests;
    // After using a rest, the robot will lose 1 level of fuel and 2 of energy;
    public String RestOfNumbers(float number1, float number2) {
        String result;

        if (this.energylevel >= 2 & this.fuellevel >= 1) {
            this.energylevel -= 2;
            this.fuellevel -= 1;
            result = String.valueOf(OperationsWithNumbers(1, number1, number2));
        } else {
            result = "Insufficient levels.";
        }
        return result;
    }

    // This method is only going to do Products;
    // After using a product, the robot will lose 2 levels of fuel and 4 of energy;
    public String ProductOfNumbers(float number1, float number2) {
        String result;

        if (this.energylevel >= 4 & this.fuellevel >= 2) {
            this.energylevel -= 4;
            this.fuellevel -= 2;
            result = String.valueOf(OperationsWithNumbers(2, number1, number2));
        } else {
            result = "Insufficient levels.";
        }

        return result;
    }

    // This method is only going to do Divisions;
    // After using a product, the robot will lose 4 levels of fuel and 8 of energy;
    public String DivisionOfNumbers(float number1, float number2) {
        String result;

        if (this.energylevel >= 2 & this.fuellevel >= 1) {
            this.energylevel -= 8;
            this.fuellevel -= 4;
            result = String.valueOf(OperationsWithNumbers(3, number1, number2));
        } else {
            result = "Insufficient levels.";
        }

        return result;
    }

    // Those public/accessible methods are going to call this private/class method
    // to return the value;
    protected float OperationsWithNumbers(int key, float number1, float number2) {
        float result = 0;
        switch (key) {
            case 0:
                // Sum;
                result = number1 + number2;
                break;
            case 1:
                // Rest;
                result = number1 - number2;
                break;
            case 2:
                // Product;
                result = number1 * number2;
                break;
            case 3:
                // Division;
                result = number1 / number2;
                break;
            default:
        }
        return result;
    }

    // Of course you need to know the actual value of fuel and energy;
    // Let's create getters methods;

    public String ActualValueOfEnergy() {
        return String.valueOf(this.energylevel);
    }

    public String ActualValueOfFuel() {
        return String.valueOf(this.fuellevel);
    }

    // And finally let's create a couple of "setters" methods to recharge the levels
    // of fuel and energy;

    // This method allows you to rechgarge the robot with Bateries;
    // Note: A batery can recharge 5 levels of energy;
    public void RechargeOfEnergy(int NumbersOfBateries) {
        int NetLevelOfEnergy = 5 * NumbersOfBateries;

        this.energylevel += NetLevelOfEnergy;
    }

    // This method allows you to rechgarge the robot with Gas;
    // Note: A tonel of Gas can recharge 2 levels of fuel;
    public void RechargeOfFuel(int NumbersOfTonels) {
        int NetLevelOfFuel = 2 * NumbersOfTonels;

        this.fuellevel += NetLevelOfFuel;
    }

    public String robotname() {
        return this.robotname;
    }
}
