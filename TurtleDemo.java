import java.awt.Color;

public class TurtleDemo
{
    public static void main(String[] args)
    {
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
    }
    
    public static void DrawLine()
    {
        /*
         * Objects are entities in a program
         * Objects have attributes
         * Objects are manipulated by invoking a method
         * 
         * in the previous method ocean and crush are variables that reference objects. 
         * 
         * 
         * Classes describe a collection of objects (A class is a template for objects)
         *      All objects of a class have the same behavior  (methods)
         *      and they have the same type of attributes 
         *      (but they may have different values for those attributes attributes)
         *      
         * World and Turtle are classes
         */
        
        World ocean = new World();
        /*
         * We used the new operator to construct (create) an object
         * 
         * The class of an object is specified imediatly after the new operator
         *      (e.g. Turtle)
         *      
         * if we need to pass aditional information to contruct the object,
         *  arguements are specified in parathenses after the class (e.g. ocean)
         */
        Turtle crush = new Turtle(ocean);
        /*
         * Variables store values to be used later.
         *      Variables have a type(e.g., int, Turtle),
         *          a name(e.g. width, crush)
         *          and a value(e.g., 20, ???)
         */
        int width; //declaring a varible
        width = 20; //assigning a value to a varible 
        int YPosition = 56; //declaring and assigning a value to a variable 
        /*
         * Java has several primitive data types:
         *  boolean holds a vale of true or false
         *  int holds an integer number
         *  double holds a real number
         *  char holds a single character 
         */
        
        //here is a boolean
        boolean isSummer = true;         //false
        
        
        //here is a double 
        double salesTaxRate = 0.0775;
        
        //here is a char
        
        char letter = 'c';
        
        
        /*
         * When invoking methods we use the dot operator(i.e., '.')
         *      to invoke methods on an object
         *      
         * Some methods take no arguments, but we still have paranthenses 
         *      (e.g. penDown() )
         * Some methods take one or more arguements (e.g. forward(25)): 
         *      Multiple arguements are seperated by commas 
         * 
         * Mutator methods modify the state(i.e., value of the attributes)
         *      of the object, penDown, forward, setPenColor are all mutator methods
         * 
         */
        crush.penDown();
        crush.forward(25);
        crush.setPenColor(Color.RED);
        crush.forward(25);
        
        /*
         * Accessor methods return the value of an attribute of the object.
         *      The state of the object does not change 
         *      
         *      
         * getPenWidth is an accessor method. 
         */
        
    }
}