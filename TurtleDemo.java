import java.awt.Color;

public class TurtleDemo
{
    static void pixel(Turtle turtle, java.awt.Color[] color, int[] times, int yPos){
        turtle.penUp();
        int t=10;
        //int a = turtle.getYPos()+ 10;
        turtle.moveTo(t,yPos);
        //turtle.setSpeed(2);
        //turtle.turnToFace(90,0);
        for (int x=0;x<color.length;x++){
            //for (int y =0; y<times[x];y++){

            for (int y =0; y<times[x];y++){
                //turtle.penDown();
                turtle.setPenWidth(10);
                //turtle.forward(10);

                turtle.setPenColor(color[x]);
                turtle.penDown();
                //turtle.forward(10);   
                //turtle.penUp();
                t=t+10;
                turtle.moveTo(t,yPos);
            }
        }
        //turtle.moveTo(0,turtle.getYPos()+10);
    }

    public static void main(String[] args)
    {
        java.awt.Color[] COLORS = {Color.WHITE, Color.BLACK, Color.PINK, Color.GRAY, new Color(186, 181, 181), new Color(125, 62, 62), new Color(64, 61, 61), new Color(87, 86, 86)};
        int[] pixel_count = {38};
        java.awt.Color[] color  = {COLORS[0]};
        int[] pixel_count1 = {21,1, 3, 6, 3, 4};
        java.awt.Color[] color1 = {COLORS[0], COLORS[3], COLORS[1], COLORS[0], COLORS[1], COLORS[0]};
        int[] pixel_count2 = {20, 1, 1, 2, 1, 1, 4, 1, 1, 1, 2, 3};
        java.awt.Color[] color2 = {COLORS[0], COLORS[3], COLORS[1], COLORS[2], COLORS[3], COLORS[1], COLORS[0], COLORS[1], COLORS[3], COLORS[2], COLORS[1], COLORS[0]};
        int[] pixel_count3 = {20, 1, 4, 1, 5, 3, 1, 3};
        java.awt.Color[] color3 = {COLORS[0], COLORS[1], COLORS[2], COLORS[3], COLORS[1], COLORS[2], COLORS[1], COLORS[0]};
        int[] pixel_count4 = {20, 1, 4, 1, 6, 2, 1, 3};
        java.awt.Color[] color4 = {COLORS[0], COLORS[1], COLORS[2], COLORS[3], COLORS[1], COLORS[2], COLORS[1], COLORS[0]};
        int[] pixel_count5 = {20, 1, 3, 5, 1, 3, 1, 1, 3};
        java.awt.Color[] color5 = {COLORS[0], COLORS[1], COLORS[2], COLORS[1], COLORS[4], COLORS[1], COLORS[2], COLORS[1], COLORS[0]};
        int[] pixel_count6 = {20,1,1,7,1,5,3};
        java.awt.Color[] color6 = {COLORS[0], COLORS[1], COLORS[2], COLORS[1], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count7 = {20,9, 1, 5, 3};
        java.awt.Color[] color7 = {COLORS[0], COLORS[1], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count8 = {19, 7, 2, 1, 1, 1, 1, 2, 1, 1, 2};
        java.awt.Color[] color8 = {COLORS[0], COLORS[1], COLORS[4], COLORS[1], COLORS[4], COLORS[1], COLORS[4], COLORS[1], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count9 = {19, 1, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2};
        java.awt.Color[] color9 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[1], COLORS[4], COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[4], COLORS[1], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count10 = {19, 1, 1, 3, 1, 2, 4, 3, 1, 1, 2};
        java.awt.Color[] color10 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[6], COLORS[1], COLORS[4], COLORS[1], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count11 = {19, 1, 1, 3, 5, 1, 3, 1, 1, 1, 2};
        java.awt.Color[] color11 = {COLORS[0], COLORS[1], COLORS[4], COLORS[0], COLORS[1], COLORS[4], COLORS[1], COLORS[6], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count12 = {19, 1, 1, 3, 5, 1, 3, 1, 1, 1, 2};
        java.awt.Color[] color12 = {COLORS[0], COLORS[1], COLORS[4], COLORS[0], COLORS[1], COLORS[4], COLORS[1], COLORS[6], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count13 = {19, 1, 1, 4, 3, 3, 2, 1, 1,1, 2};
        java.awt.Color[] color13 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[1], COLORS[4], COLORS[6], COLORS[4], COLORS[6],COLORS[1], COLORS[0]};
        int[] pixel_count14 = {19,1, 1,1,10,2,1, 3};
        java.awt.Color[] color14 = {COLORS[0],COLORS[1],COLORS[6],COLORS[4],COLORS[0],COLORS[4],COLORS[6], COLORS[0]};
        int[] pixel_count15 = {18,3,1,2,4,1,1,1,2,1,1,3};
        java.awt.Color[] color15 = {COLORS[0],COLORS[1],COLORS[6],COLORS[4],COLORS[0],COLORS[6],COLORS[1],COLORS[6],COLORS[4],COLORS[6],COLORS[1],COLORS[0]};
        int[] pixel_count16 = {18,4,1,5,3,2,1,1,3};
        java.awt.Color[] color16 = {COLORS[0],COLORS[1],COLORS[6],COLORS[4],COLORS[1],COLORS[4],COLORS[6],COLORS[1],COLORS[0]};
        int[] pixel_count17 = {18, 2, 2, 1, 1, 4, 1, 1, 1, 1, 1, 2, 3};
        java.awt.Color[] color17 = {COLORS[0], COLORS[1], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count18 = {18,1,1,2,2,7,1,3,3};
        java.awt.Color[] color18 = {COLORS[0],COLORS[1],COLORS[6],COLORS[4],COLORS[6],COLORS[4],COLORS[6],COLORS[1],COLORS[0]};
        int[] pixel_count19 = {17,2,1,2,9,2,1,2,2};
        java.awt.Color[] color19 = {COLORS[0],COLORS[1],COLORS[6],COLORS[0],COLORS[4],COLORS[1],COLORS[6],COLORS[1],COLORS[0]};
        int[] pixel_count20 = {17, 3, 1, 4, 7, 2, 2, 2};
        java.awt.Color[] color20 = {COLORS[0],COLORS[1],COLORS[6],COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count21 = {16, 4, 2, 5, 5, 2, 2, 2};
        java.awt.Color[] color21 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count22 = {15, 3, 1, 8, 8, 1, 2};
        java.awt.Color[] color22 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[1], COLORS[0]};
        int[] pixel_count23 = {14, 4, 1, 8, 8, 1, 1, 1};
        java.awt.Color[] color23 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count24 = {14, 4, 1, 1, 7, 8, 1, 1, 1};
        java.awt.Color[] color24 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count25 = {13, 5, 1, 2, 5, 9, 1, 1, 1};
        java.awt.Color[] color25 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count26 = {13, 6, 1, 2, 3, 10, 1, 1, 1};
        java.awt.Color[] color26 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count27 = {12, 7, 1, 14, 1, 2, 1};
        java.awt.Color[] color27 = {COLORS[0], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count28 = {11, 2, 2, 5, 1, 13, 1, 2, 1};
        java.awt.Color[] color28 = {COLORS[0], COLORS[1], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count29 = {11, 1, 1, 2, 1, 4, 1, 12, 1, 3, 1};
        java.awt.Color[] color29 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count30 = {10, 2, 1, 3, 1, 4, 1, 10, 1, 1, 2, 2};
        java.awt.Color[] color30 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[0], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count31 = {10, 2, 1, 2, 2, 1, 3, 1, 7, 1, 2, 1, 1, 2, 2};
        java.awt.Color[] color31 = {COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[6], COLORS[4], COLORS[7], COLORS[4], COLORS[0], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count32 = {1, 2, 7, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 5, 1, 3, 1, 2, 2};
        java.awt.Color[] color32 ={COLORS[0], COLORS[6], COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[4], COLORS[7], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count33 = {1, 2, 1, 2, 3, 3, 1, 2, 3, 1, 3, 1, 1, 4, 2, 3, 1, 1, 1, 2};
        java.awt.Color[] color33 = {COLORS[6], COLORS[0], COLORS[6], COLORS[1], COLORS[0], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[4], COLORS[7], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count34 = {1, 2, 1, 8, 1, 2, 3, 1, 3, 1, 1, 2, 3, 1, 3, 1, 1, 1, 2};
        java.awt.Color[] color34 = {COLORS[6], COLORS[4], COLORS[6], COLORS[1], COLORS[7], COLORS[0], COLORS[4], COLORS[7], COLORS[0], COLORS[4], COLORS[7], COLORS[4], COLORS[7], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[1], COLORS[0]};
        int[] pixel_count35 = {1, 2, 1, 7, 1, 1, 5, 1, 2, 2, 1, 5, 1, 3, 1, 1, 3};
        java.awt.Color[] color35 = {COLORS[0], COLORS[6], COLORS[7], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[7], COLORS[6], COLORS[0], COLORS[4], COLORS[7], COLORS[0]};
        int[] pixel_count36 = {3, 2, 2, 4, 1, 1, 4, 1, 1, 1, 1, 3, 1, 3, 1, 1, 3, 1, 1, 3};
        java.awt.Color[] color36 = {COLORS[0], COLORS[1], COLORS[6], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[1], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[6], COLORS[7], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[3], COLORS[0]};
        int[] pixel_count37 = {5, 2, 2, 2, 2, 1, 2, 2, 1, 5, 1, 2, 2, 1, 3, 1, 1, 3};
        java.awt.Color[] color37 = {COLORS[0], COLORS[1], COLORS[6], COLORS[1], COLORS[0], COLORS[4], COLORS[3], COLORS[1], COLORS[6], COLORS[4], COLORS[6], COLORS[7], COLORS[1], COLORS[6], COLORS[0], COLORS[4], COLORS[7], COLORS[0]};
        int[] pixel_count38 = {7, 4, 2, 2, 2, 1, 1, 1, 4, 1, 4, 1, 3, 1, 1, 3};
        java.awt.Color[] color38 = {COLORS[0], COLORS[1], COLORS[0], COLORS[4], COLORS[7], COLORS[1], COLORS[7], COLORS[6], COLORS[4], COLORS[6], COLORS[7], COLORS[6], COLORS[0], COLORS[4], COLORS[7], COLORS[0]};
        int[] pixel_count39 = {10, 1, 1, 2, 3, 2, 1, 4, 1, 3, 1, 1, 2, 2, 1, 3};
        java.awt.Color[] color39 = {COLORS[0], COLORS[7], COLORS[4], COLORS[0], COLORS[4], COLORS[7], COLORS[6], COLORS[4], COLORS[6], COLORS[7], COLORS[6], COLORS[7], COLORS[0], COLORS[4], COLORS[7], COLORS[0]};
        int[] pixel_count40 = {11, 1, 2, 2, 2, 2, 2, 3, 3, 1, 1, 2, 2, 1, 3};
        java.awt.Color[] color40 = {COLORS[0], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[4], COLORS[6], COLORS[4], COLORS[3], COLORS[0], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[0]};
        int[] pixel_count41 = {12, 2, 4, 1, 1, 1, 4, 1, 3, 2, 1, 2, 1, 3};
        java.awt.Color[] color41 = {COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[0], COLORS[4], COLORS[6], COLORS[0], COLORS[6], COLORS[0]};
        int[] pixel_count42 = {14, 4, 2, 1, 5, 1, 2, 1, 1, 3, 1, 1, 2};
        java.awt.Color[] color42 ={COLORS[0], COLORS[6], COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[0], COLORS[6], COLORS[4], COLORS[0], COLORS[4], COLORS[6], COLORS[0]};
        int[] pixel_count43 = {20, 1, 5, 1, 3, 1, 4, 1, 2};
        java.awt.Color[] color43 = {COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[0], COLORS[6], COLORS[4], COLORS[6], COLORS[0]};
        int[] pixel_count44 = {21, 5, 5, 4, 3};
        java.awt.Color[] color44 = {COLORS[0], COLORS[6], COLORS[0], COLORS[6], COLORS[0]};
        int[] pixel_count45 = {38};
        java.awt.Color[] color45 = {COLORS[0]};

        
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        Turtle huskie = new Turtle(ocean);
        pixel(crush, color, pixel_count, 7);
        pixel(crush,color1, pixel_count1, 17);
        pixel(crush, color2, pixel_count2, 27);
        pixel(crush, color3, pixel_count3,  (37));
        pixel(crush, color4, pixel_count4,  (47));
        pixel(crush, color5, pixel_count5,  (57));
        pixel(crush, color6, pixel_count6,  (67));
        pixel(crush, color7, pixel_count7, (77));
        pixel(crush, color8, pixel_count8,  (87));
        pixel(crush, color9, pixel_count9,  (97));
        pixel(crush, color10, pixel_count10,  (107));
        pixel(crush, color11, pixel_count11,  (117));
        pixel(crush, color12, pixel_count12,  (127));
        pixel(crush, color13, pixel_count13,  (137));
        pixel(crush, color14, pixel_count14,  (147));
        pixel(crush, color15, pixel_count15,  (157));
        pixel(crush, color16, pixel_count16,  (167));
        pixel(crush, color17, pixel_count17,  (177));
        pixel(crush, color18, pixel_count18,  (187));
        pixel(crush, color19, pixel_count19,  (197));
        pixel(crush, color20, pixel_count20,  (207));
        pixel(crush, color21, pixel_count21,  (217));
        pixel(crush, color22, pixel_count22,  (227));
        pixel(crush, color23, pixel_count23,  (237));
        pixel(crush, color24, pixel_count24,  (247));
        pixel(crush, color25, pixel_count25,  (257));
        pixel(crush, color26, pixel_count26, (267));
        pixel(crush, color27, pixel_count27,  (277));
        pixel(crush, color28, pixel_count28,  (287));
        pixel(crush, color29, pixel_count29,  (297));
        pixel(crush, color30, pixel_count30,  (307));
        pixel(crush, color31, pixel_count31,  (317));
        pixel(crush, color32, pixel_count32,  (327));
        pixel(crush, color33, pixel_count33,  (337));
        pixel(crush, color34, pixel_count34,  (347));
        pixel(crush, color35, pixel_count35,  (357));
        pixel(crush, color36, pixel_count36,  (367));
        pixel(crush, color37, pixel_count37,  (377));
        pixel(huskie, color38, pixel_count38,  (387));
        pixel(huskie, color39, pixel_count39,  (397));
        pixel(huskie, color40, pixel_count40,  (407));
        pixel(huskie, color41, pixel_count41, (417));
        pixel(huskie, color42, pixel_count42,  (427));
        pixel(crush, color43, pixel_count43,  (437));
        pixel(crush, color44, pixel_count44,  (447));
        pixel(crush, color45, pixel_count45,  (457));

        //Turtle border = new Turtle(ocean);
       // border.penUp();
        //border.moveTo(0,7);
       // border.penDown();
        //border.setPenColor(Color.BLACK); 
        //border.moveTo(0,380);
        //border.moveTo(480,380);
        //border.moveTo(0, 380);
        //border.moveTo(0,7);
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