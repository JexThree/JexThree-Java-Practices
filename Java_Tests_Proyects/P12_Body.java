package Java_Tests_Proyects;

public class P12_Body {

    /*
     * This super class will be only focused on the movement;
     * So, we're going to work with only four methods and two variables;
     */

    protected int x;
    // This field will keep the position according to the X line;

    protected int y;
    // This field will keep the position according to the Y line;

    // This constructor is only a default constructor;
    public P12_Body() {
        this.x = 0;
        this.y = 0;
    }

    // This constructor will let you initialize the coordinates;
    public P12_Body(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // This method will let you know what's the position of the body;
    public void position() {
        System.out.printf("%nPosition: (%d, %d)", this.x, this.y);
    }

    // This method will increase the position of the body in the line Y;
    public void up(int num) {
        this.y += num;
    }

    // This method will decrease the position of the body in the line Y;
    public void down(int num) {
        this.y -= num;
    }

    // This method will increase the position of the body in the line X;
    public void right(int num) {
        this.x += num;
    }

    // This method will decrease the position of the body in the line X;
    public void left(int num) {
        this.x -= num;
    }
}
