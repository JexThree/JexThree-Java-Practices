package Java_Classes_Tests;

// An enum is a type of class, like an interface;
public enum EnumExample {

    /*
     * Here, I'm going to declare the objects of the enum;
     * Let's suppose it's an enum of pens;
     */

    BlackPEN(1, 1),
    RedPEN(2, 1),
    BluePEN(3, 1);
    // These are the pens that I have;

    private int order;
    private int total;
    // These are the parameters of the objects;

    private EnumExample(int order, int total) {
        this.order = order;
        this.total = total;
    }

    /*
     * Here, I have a constructor in order to set up the parameters of a new object;
     * Note: Private constructors are only accepted in enums;
     */
    public int getOrder() {
        return order;
        // This getter is going to give me the order of the object;
    }

    public int getTotal() {
        return total;
        // This getter is going to give me the total amount of the object;
    }

    public void setOrder(int order) {
        this.order = order;
        // This setter is going to overwrite the default order;
    }

    public void setTotal(int total) {
        this.total = total;
        // This setter is going to overwrite the default total;
    }

    /*
     * Remember to declare the main class inside the proyect class or to declare
     * it in another proyect;
     */

    /*
     * If you want, remember that it is posible to overwrite the origin methods of
     * Enums;
     * name();
     * ordinal();
     * toString();
     * equals();
     * compareTo();
     * valueOff();
     * values();
     */
    public static void main(String[] args) {

        /*
         * Here, I'm going to create a new field to equalize it with one of the objects
         * inside the enum;
         */
        EnumExample blackPen = EnumExample.BlackPEN;

        int order = 2;
        blackPen.setOrder(order);
        System.out.println("The order of the pen is " + blackPen.getOrder());
        // It's going to set up the order of the object blackPen once;
        order++;
        blackPen.setOrder(order);
        System.out.println("The order of the pen is " + blackPen.getOrder());
        // It's going to set up the order of the object blackPen twice;
        order++;
        blackPen.setOrder(order);
        System.out.println("The order of the pen is " + blackPen.getOrder());
        // It's going to set up the order of the object blackPen thrice;

        // We could do this with the total;
        int total = 6;
        blackPen.setTotal(total);
        System.out.println("The total of the pen is " + blackPen.getTotal());
        // It's going to set up the total once;
        total--;
        blackPen.setTotal(total);
        System.out.println("The total of the pen is " + blackPen.getTotal());
        // It's going to set up the total twice;
        total--;
        blackPen.setTotal(total);
        System.out.println("The total of the pen is " + blackPen.getTotal());
        // It's going to set up the total thrice;
    }
}