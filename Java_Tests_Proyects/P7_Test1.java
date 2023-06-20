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
                // Excercise 12;
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
            case "13":
                // Excersice 13;

                // First, I'm going to ask for the numbers;

                float a = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert the number a"));
                // System.out.println("a = " + a);

                float b = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert the number b"));
                // System.out.println("b = " + b);

                float c = Float.parseFloat(JOptionPane.showInputDialog(null, "Insert the number c"));
                // System.out.println("c = " + c);

                // Then, I have to find the radical;

                float radical = (b * b) - (4 * a * c);
                // System.out.println("Radical = " + radical);

                // And, to finish this, I only have to calcule the rest of the formule;
                double result1 = -b + (Math.sqrt(radical));
                // System.out.println("Result1 = " + result1);
                result1 /= 2 * a;
                // System.out.println("FinalResult2 = " + result1);

                double result2 = -b - (Math.sqrt(radical));
                // System.out.println("Result2 = " + result2);
                result2 /= 2 * a;
                // System.out.println("FinalResult2 = " + result2);

                // Here, I'm showing the answer;
                JOptionPane.showMessageDialog(null, "The answers are: \n" + result1 + "\n" + result2);
                break;

            case "14":
                // Excercise 14;

                boolean redFlag;

                do {
                    int number1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Insert a number major or equal to zero.", "Excercise do-while.", 1));

                    if (number1 >= 0) {
                        JOptionPane.showMessageDialog(null, "It's a correct number.");
                        redFlag = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "It isn't a correct number. \nTry again, please.");
                        redFlag = true;
                    }
                } while (redFlag);

                break;

            case "15":
                // Excersice 15;

                final String password = "MLP";

                JOptionPane.showMessageDialog(null,
                        "Welcome to excersice 15.\nTo solve this test, you have to divine a certain String.\nYou'll have three chances.\nLet's start.");

                for (int timer14 = 1; timer14 <= 3; timer14++) {

                    if (timer14 == 1)
                        JOptionPane.showMessageDialog(null,
                                "It's a franchise for children.\nIt's a huge fandom.\nHorses.", "Some advices.", 1);

                    if (timer14 == 2)
                        JOptionPane.showMessageDialog(null,
                                "The show is about friendship.\nIt's magic.", "More avdices.", 1);

                    if (timer14 == 3)
                        JOptionPane.showMessageDialog(null,
                                "It is its acronym.\nWithout 'FIM'", "More avdices.", 1);

                    String yourAnswer = JOptionPane.showInputDialog(null,
                            "Please, write your answer: ", "Guessing time.", 3);

                    int equality = yourAnswer.compareToIgnoreCase(password);

                    if (equality == 0) {
                        JOptionPane.showMessageDialog(null,
                                "You could divine it.\nWell played.\nB)", "Congratulations.", 1);
                        break;
                    } else
                        JOptionPane.showMessageDialog(null, "Sorry, it wasn't.\nLet's try again.\n:)", "Wrong!", 0);
                }

                break;

            case "16":
                // Excersice 16;

                String day = JOptionPane.showInputDialog(null,
                        "Please, write a day of the week: ", "Days of the week.", 3);

                switch (day) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thrusday":
                    case "Friday":
                    case "monday":
                    case "tuesday":
                    case "wednesday":
                    case "thrusday":
                    case "friday":
                        JOptionPane.showMessageDialog(null, "It's a labor day.");
                        break;
                    case "Saturday":
                    case "Sunday":
                    case "saturday":
                    case "sunday":
                        JOptionPane.showMessageDialog(null, "It isn't a labor day.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "It isn't even a day.\nLittle troll.\nB)", "Wrong!", 0);
                        break;
                }
                break;

            case "17":
                // Excercise 17;

                int lowernumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insert a random number.", "Lower number limit.", 1));
                int uppernumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insert a random number.\nHigher than the first one.", "Upper number limit.", 1));
                for (int timer17 = 0; timer17 < 10; timer17++) {
                    boolean flag17 = true;
                    do {
                        int Randnum = (int) (10 * Math.random());
                        if (Randnum > lowernumber & Randnum < uppernumber) {
                            System.out.println(Randnum);
                            flag17 = false;
                        } else {
                            flag17 = true;
                        }
                    } while (flag17);
                }
                break;

            case "18":
                String digitalNum = JOptionPane.showInputDialog(null,
                        "Insert a number of one or more digits.", "Digits if a number.", 1);
                int digits = digitalNum.length();
                int digitalNumint = Integer.parseInt(digitalNum);
                if (digitalNumint > 0)
                    JOptionPane.showMessageDialog(null,
                            "The number of digits is: " + digits, "Number of digits.", 1);
                else
                    JOptionPane.showMessageDialog(null,
                            "The number of digits is: " + --digits, "Number of digits.", 1);
                break;

            case "19":
                // Excercise 19;
                int cousinNumber = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Insert a number.", "Cousin numbers.", 1));
                int timer19 = 0;

                for (int t19 = cousinNumber; t19 > 1; t19--) {
                    int residue19 = cousinNumber % t19;
                    if (residue19 == 0)
                        timer19++;
                }

                if (timer19 == 1)
                    JOptionPane.showMessageDialog(null,
                            "The number " + cousinNumber + " is a cousin number.", "True.", 1);
                else
                    JOptionPane.showMessageDialog(null,
                            "The number " + cousinNumber + " is not a cousin number.", "False", 1);
                break;

            case "20":
                // Excercise 19;
                JOptionPane.showMessageDialog(null,
                        "These are the cousin numbers between 1 to 100.", "Cousin numbers.", 1);
                System.out.println("List of numbers:");

                for (int X20 = 0; X20 <= 100; X20++) {
                    int timer20 = 0;

                    for (int t20 = X20; t20 > 1; t20--) {
                        int residue20 = X20 % t20;
                        if (residue20 == 0)
                            timer20++;
                    }

                    if (timer20 == 1)
                        System.out.println(X20);
                }
                break;

            case "21":
                String words = JOptionPane.showInputDialog(null,
                        "Insert a String: ", "Count of a string.", 1);
                int totalOfVocals = 0;

                for (int timer21 = words.length(); timer21 > 0; timer21--) {
                    char[] vocalsArray = { 'a', 'e', 'i', 'o', 'u' };
                    char letter = words.charAt(timer21 - 1);

                    for (char vocal : vocalsArray)
                        if (letter == vocal)
                            totalOfVocals++;
                }

                JOptionPane.showMessageDialog(null,
                        "There are " + totalOfVocals + " vocals.", "Total.", 1);
                break;
        }
    }
}