package Java_Classes_Tests;

public class Constants {
    /*
     * In java a constant is a field that cannot be changed once it is inicialized;
     * In the case of methods, it is referring that the method cannot be overwritten;
     * You can declare a constant in java with the words 'final' and 'static';
     */

    
    /*
     * These next mini codes are good examples of a constant field;
     */
    public static void main(String args[]) {

        int PriceOfAJuice = 15;
        final float IVA = 0.18f;
        float finalPrice = PriceOfAJuice*IVA;

        System.out.println("The final price is: " + finalPrice);

        /*
         * Important note. It is imposible to make a direct reference to a non static method in a main class;
         * If you want to use a certain method out of the main class;
         * You have to implement it in a class and to call the class first and then the method;
         * 
         * This is incorrect:
         * float finalPrice = IVA(PriceOfAJuice);
         * I'm calling a mehod with noclass;
         */
    }

    public float IVA(int price) {

        final float IVA = 0.18f;

        float FinalIVA = IVA * price;

        return FinalIVA;
    }

    /*
     * Let's suppose that you want to develop an app as the last one;
     * But now, you want to use the word 'static', well this is prohibited;
     * Because static is refering that the value of the data is static in all the
     * objects made of a certain class;
     * And final it's just stablishing that the value it's definitive, unchangeable;
     */
    public float WrongStaticIVA(int price) {
        /*
         * static float IVA = 0.18f;
         * It is a wrong usegage of the static word'
         */
        float FinalIVA = price;

        return FinalIVA;
    }

    /*
     * It is an example of a constant or final method;
     * As you can see it has the word final at the beggining so;
     * If you want to overwrite in a hypotethic daughter class it wont be permited;
     * It is a constant/final method so it is unchangeable;
     */
    final void ImAngry(){
        System.out.print("I'm angry.");
    }
}