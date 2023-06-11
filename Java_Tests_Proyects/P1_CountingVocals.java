package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P1_CountingVocals {
    public static void main(String args[]) {
        String palabra = new String();
        String letra = new String();
        String[] conjuntodeVocales = { "a", "e", "i", "o", "u" };
        int Numofvocals = 0;
        int ExtensionPalabra = 0;

        /*
         * System.out.println("Write a word.");
         * palabra = teclado.nextLine();
         * 
         * System.out.println("Write a vocal.");
         * vocal = teclado.nextLine();
         */

        palabra = JOptionPane.showInputDialog("Write a word.");
        ExtensionPalabra = palabra.length();

        for (int contador = 0; contador < ExtensionPalabra; contador++) {

            letra = String.valueOf(palabra.charAt(contador));

            for (int contador2 = 0; contador2 < 5; contador2++) {

                if (letra.equals(conjuntodeVocales[contador2])) {
                    Numofvocals++;
                }

            }
        }

        JOptionPane.showMessageDialog(null, Numofvocals, "The number of vocals is: ", 1);
    }
}
