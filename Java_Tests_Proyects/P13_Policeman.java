package Java_Tests_Proyects;

public class P13_Policeman extends P12_Body {

    /*
     * This is daughter class, it'll keep the methods and fields of the fatherclass;
     * But, the difference stays in the new methods and fields of this class;
     */

    protected int bullets;

    // This is the default constructor;
    public P13_Policeman() {
        super(0, 0);
        this.bullets = 0;
    }

    // And this is the handly constructor;
    public P13_Policeman(int X, int Y, int NumOfBullets) {
        super(X, Y);
        if (NumOfBullets > 12) {
            this.bullets = 12;
            System.out.printf("The maximum charge is twelve.");
        } else
            this.bullets = NumOfBullets;
    }

    /*
     * May be it is obvious, but, this class has total access to all the methods
     * stayed in the fatherclass;
     * Of course it is possible to create new methods and also to overwrite the
     * previous ones;
     * So, it depends on the programmer and if the field or the method is accesible
     * or private;
     */

    public void shoot() {
        this.bullets--;
        System.out.printf("%nThe policeman shot.");
    }

    public void reload(int bullets) {
        if (bullets > 12)
            System.out.printf("%nThe quantity is out of the range.%nGun unreloaded.");
        else {
            this.bullets += bullets;
            System.out.printf("%nThe gun has reloaded successfully.");
            if (this.bullets > 12)
                this.bullets = 12;
        }
    }
}
