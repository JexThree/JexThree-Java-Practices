package Java_Classes_Tests;

public final class FinalClasses {

    /*
     * The word final is use to create final classes, final methods and final camps
     * as well;
     * Yeap, because there are final camps;
     * 
     * As you can see, this is a final class, and what with that, well;
     * It's important to know that the final classes cannot be extend, so yeap, a
     * final class, cannot be a father class;
     */

    public final int One = 1;
    /*
     * That's a final camp. It's funcionality is based in being an uneditable camp;
     * So, yeah, in this example, the int One is uneditable;
     */

    public final void finalmethod() {
        System.out.println("This is a final method. It's impossible to overwrite it.");
    }
    /*
     * It is impossible for a daughter class, to overwrite this kind of methods;
     * A final method cannot be changed by a daughter class;
     */

    public static void main(String args[]) {
        // To finish with this, it's time to talk about the instanceof functionality;
        Polimorphism Poly = new Polimorphism();

        if (Poly instanceof Polimorphism) {
            System.out.println("Poly is an object from the Polimorphism class.");
        } else {
            System.out.println("Poly isn't an object from the Polimorphism class.");
        }
        /*
         * As you can see it is going to compare the class of an object;
         * If the object is from the class asigned in the left side, it's going to
         * return a true boolean value;
         * If the object isn't from the class asigned in the left side, it's going to
         * return a flase boolean value;
         */
    }

}
