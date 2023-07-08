package Java_Tests_Proyects;

import javax.swing.JOptionPane;

public class P9_ArrayOfTen {

    protected int[] array;
    // First, I declared the field of the array;

    public P9_ArrayOfTen() {
        // It is a constructor to initialize the field;
        this.array = new int[10];
    }

    public void fillTheArray() {
        // This method is in charge to fill the entire array;
        for (int row = 0; row < 10; row++)
            array[row] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Insert a number to keep in the " + row + " cell.", "Initialization of the array.", 1));
    }

    public void printTheArray() {
        // This method is in charge to print the entire array;
        System.out.printf("Array values.%n");

        for (int row = 0; row < 10; row++) {
            if (row < 9)
                System.out.print(array[row] + ", ");
            else
                System.out.print(array[row] + ". ");
        }
    }

    public static void main(String[] args) {
        P9_ArrayOfTen array = new P9_ArrayOfTen();
        // I declared a field of the P9_ArrayOfTen type;

        array.fillTheArray();
        // Here, I called the first method;
        array.printTheArray();
        // Here, I called the second method;
    }

}
