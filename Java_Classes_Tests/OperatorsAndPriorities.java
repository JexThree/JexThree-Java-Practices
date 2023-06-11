package Java_Classes_Tests;

public class OperatorsAndPriorities {
    /*
     * These are all java operators in order of priority:
     * 
     * 1) Parentheses, Brackets and Period = (), [], .
     * 2) Negative sign, Decrease, Increase and Negation = -num, --, ++, !;
     * 3) New object = new (type);
     * 4) Multiplication, Division, Modulus = *, /, %;
     * 5) Sum, Rest = +, -;
     * 6) Greater, Less, Greater than or equal to, Less than or equal to = >, <, >=,
     * <=;
     * 7) Equalization, Different = ==, !=;
     * 8) AND = &&;
     * 9) OR = ||;
     * 10) Conditional = ?:;
     * 11) Assignment = +=, -=, *=, /=, %=;
     */

    /*
     * Now, let's see an example;
     */

    public static void main(String args[]) {

        /*
         * Now, this is going to be an example of the majority of operators;
         */

        int a = 1;
        int b = 2;
        int[] array = new int[11];
        // This is an example of new;

        for (int C = 0; C <= 10; C++) {

            if (C == 0) {
                array[C] = 2 * (a + b);
                /*
                 * Here, I'm using parentheses, plus and a multiplication;
                 */
            }

            if (C == 1) {
                array[C] = 2 / (a - b);
                /*
                 * Here, I'm using parentheses, minus and a division;
                 */
            }

            if (C == 2) {
                array[C] = a * (b % 10);
                array[C]++;
                /*
                 * Here, I'm using parentheses, multiplication, modulus and Decrease;
                 */
            }

            if (C == 3) {
                boolean Bool = a <= b;
                Bool = 1 != 2 && a == b;
                Bool = false || a != 1;
                /*
                 * You can see a lot of logical operators;
                 */

                if (Bool) {
                    array[C] = a + b;
                }
            }

            if (C == 4) {
                array[C] = (a * 4) / b;
                array[C]--;
                array[C] %= 20;
                /*
                 * And here the rest of the operators;
                 */
            }
        }

        int C = 0;
        while (C <= 4) {
            System.out.println(array[C]);
            C++;
            // A print just to show you the operations;
        }
        // If you want to check every operation, you can, UwU;
    }
}
