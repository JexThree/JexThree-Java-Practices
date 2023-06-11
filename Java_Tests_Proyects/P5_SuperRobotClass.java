package Java_Tests_Proyects;

public abstract class P5_SuperRobotClass {
    
    protected float energylevel;
    protected float fuellevel;
    protected int robothash;
    protected String robotname;
    //These are the global camps;

    public abstract void CreateARobothash();

    public int robothash(String robotname, String defaultrobotname, String password){
        return 0;
    }
    
    public final void JaJa(){
        System.out.println("I don't know, you selected it.");
    }

    public String SumOfNumbers(float number1, float number2) {
        String result = String.valueOf(number1 + number2);
        return result;
    }
}
