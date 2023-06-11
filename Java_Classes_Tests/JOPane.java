package Java_Classes_Tests;

import javax.swing.JOptionPane;

public class JOPane {

    public static void main(String args[]) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insert a number from 0 to 4"));
        // It will show a simple pane to input information;
        // It is the simplest way to understand an overload method of JOptionPane;

        String b = JOptionPane.showInputDialog(null, "What are thinking right now?", "Hello my friend.", a);
        /*
         * It is a little bit different, it is goign to show a certain kind of massage;
         * Here you can write a certain title and a certain message;
         * Also, you can change the presentation of the pane writting from 0 to 4 in the
         * last parameter of the method;
         * It is another way to use JOptionPane;
         */

        JOptionPane.showMessageDialog(null, b, "This is your answer.", a);
        // It is like a println, it is going to show a pane with text, that's it;

        JOptionPane.showMessageDialog(null, "Thanks for answering me.");
        // It is a simplier way to use the method;

        int c = JOptionPane.showConfirmDialog(null, "Message", "Title", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
        // It is going to ask for a certain option, just yes or no;
        // Well it can change depending to the overload method and to the parameters
        // put;

        if (c == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "You chose yes.", "Your answer.", a);
        else
            JOptionPane.showMessageDialog(null, "You chose no.", "Your answer.", a);

    }
}
