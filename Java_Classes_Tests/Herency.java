package Java_Classes_Tests;

import Java_Tests_Proyects.P12_Body;

import Java_Tests_Proyects.P13_Policeman;

public class Herency {
    public static void main(String[] args) {
        // Let's talk about herency in Java;

        /*
         * In this topic, we have to focus in two fundamental terms;
         * One is the "SuperClass" or "DadClass";
         * And two, the "DerivativeClass" or "DaugtherClass";
         * Well, a superclass is going to be the main class, the class at the top of the
         * chain;
         * And the derivativeclass will adquire the fileds and the methods of its
         * superclass;
         */

        // To understand this a little bit better, let's move to the class body;

        // Now, let's create two objects of the classes already created;

        P12_Body body1 = new P12_Body(12, 1);
        // This is an object of the super class "Body";

        P13_Policeman policeman = new P13_Policeman(13, 21, 13);
        // This is an object of the daugther class "Policeman";

        P12_Body body2 = new P13_Policeman();
        /*
         * As you can see, an object of the father class can point to a daugther class
         * reference;
         * But, an object of the daugther class cannot point to a father class
         * reference;
         */

        body1.down(2);
        body1.right(8);

        policeman.up(1);
        policeman.left(3);

        /*
         * As you can see the object of the class policeman, can do the class body
         * methods;
         * And also, It can do its own methods;
         */

        body1.position();
        policeman.position();
        policeman.shoot();
        policeman.reload(1);

        /*
         * And it's important to sign that an object of the father class;
         * Which is pointing to a daugther class reference;
         * Cannot access to any field or method of the daugther class;
         * 
         * body2.shoot();
         * 
         * That useage of the method shoot is impossible;
         */
        
        body2.up(9);
    }
}