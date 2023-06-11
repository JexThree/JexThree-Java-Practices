package Java_Classes_Tests;

import javax.swing.JOptionPane;

public class String_class {
    public static void main(String args[]) {
        String a, b, letter, prefix, sufix;
        int temporalA, right, left, index, key, compare;

        a = JOptionPane.showInputDialog(null, "Write a Sting to test.", "Welcome to String_Class.", 1);

        key = Integer.parseInt(JOptionPane.showInputDialog(null,
                "The methods to test are:\n1 : hashCode()\n2 : lenght()\n3 : substring( , )\n4 : indexOf()\n5 : charAt()\n6 : compareTo()",
                "Selection time.", 3));

        switch (key) {
            case 1:
                // hashCode()
                temporalA = a.hashCode();
                System.out.println("Using .hashcode():");
                System.out.println("The variable 'a' (" + a + ") has the next hash: " + temporalA + "\n");
                /*
                 * It creates a hash for the String "a";
                 */

                break;
            case 2:
                // length()
                temporalA = a.length();
                System.out.println("Using .lenght():");
                System.out.println("The variable 'a' (" + a + ") has a lenght of: " + temporalA + "\n");
                /*
                 * It will tell you the number of letters in the word "a";
                 * It is going to be an int field;
                 */
                break;
            case 3:
                // substring( , )
                right = Integer.parseInt(JOptionPane.showInputDialog(null, "Write limit of the right",
                        "Right limit for substring", 1));
                left = Integer.parseInt(JOptionPane.showInputDialog(null, "Write limit of the left",
                        "Left limit for substring", 1));
                System.out.println("Using .substring (" + right + ", " + left + "):");
                System.out.println("The cut word is: " + a.substring(right, left) + "\n");
                /*
                 * This is going to cut and return a String beetween the chosen limit;
                 */
                break;
            case 4:
                // indexOf()
                letter = JOptionPane.showInputDialog(null,
                        "Do you want to know the index of a certain letter?\nIf you want, just write the letter you want to know rigth here:",
                        ".indexOf", 1);
                System.out.println("Using .indexOf (" + letter + "):");
                System.out.println(
                        "The selected letter was: " + letter + ". So the index is: " + a.indexOf(letter) + ".\n");
                /*
                 * You can find out what's the index of a certain character in the word;
                 * Note: Character = letter;
                 */
                break;
            case 5:
                // charAt(index)
                temporalA = a.length();
                index = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Do you want to know what letter is in a certain index?\nIf you want, just write the index you want to know rigth here:\n(Remember that the limit is:"
                                + --temporalA + ")",
                        "charAt()", 1));
                System.out.println("Using .charAt(int index):");
                System.out
                        .println("The selected index was: " + index + ". So, the letter there, is: " + a.charAt(index)
                                + ".\n");
                /*
                 * It is going to print the character of the index selected;
                 */
                break;
            case 6:
                letter = JOptionPane.showInputDialog(null, "Write a or b to use compareTo() or compareToignoreCase()",
                        "Select compareTo() or compareToignoreCase()", 3);
                if (letter.equalsIgnoreCase("a")) {
                    // compareTo()
                    b = JOptionPane.showInputDialog(null,
                            "Do you have another String to compare?\nIf you have it, just write it rigth here:",
                            ".compareTo()", 1);
                    compare = a.compareTo(b);
                    if (compare == 0) {
                        System.out.println("The Strings are the same, (" + a.compareTo(b) + ")");
                    } else {
                        System.out.println("The Strings are diferent, (" + a.compareTo(b) + ")");
                    }
                    /*
                     * This method is going to tell you if a String is equal to another one;
                     * If the return int equals to zero, they're equal;
                     * Note. It is going to do this comparison using the lexicology of the ASSCI
                     * code;
                     */
                } else {
                    // compareToIgnoreCase()
                    b = JOptionPane.showInputDialog(null,
                            "Do you have another String to compare?\nIf you have it, just write it rigth here:",
                            ".compareTo()", 1);
                    compare = a.compareToIgnoreCase(b);
                    if (compare == 0) {
                        System.out.println("The Strings are the same, (" + a.compareToIgnoreCase(b) + ")");
                    } else {
                        System.out.println("The Strings are diferent, (" + a.compareToIgnoreCase(b) + ")");
                    }
                    /*
                     * This method is going to do the same as the previous one;
                     * The only exception is about lower and upper case, this is going to ignore
                     * those details;
                     * The first one is going to consider those details;
                     */
                }
                break;
            case 7:
                // startsWith and endsWith.
                prefix = JOptionPane.showInputDialog(null, "Input the prefix.", "Prefix.", 3);
                sufix = JOptionPane.showInputDialog(null, "Input the sufix.", "Sufix.", 3);
                a.startsWith(prefix);
                a.endsWith(sufix);
                /*
                 * This is going to compare the word with the prefix and sufix selected;
                 * If the prefix is the equal or empty it will return a true value;
                 * If it isn't, it will return a false value;
                 */
                break;
            default:
                System.out.println("You didn't choose a right option. Please execute the code again.");
        }
    }
}