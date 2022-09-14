import java.awt.Color;

public class TurtleLab
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
        Turtle husky = new Turtle(ocean);
        Turtle huskie = new Turtle(ocean);
        pixel(husky, color, pixel_count, 7);
        pixel(husky,color1, pixel_count1, 17);
        pixel(husky, color2, pixel_count2, 27);
        pixel(husky, color3, pixel_count3,  (37));
        pixel(husky, color4, pixel_count4,  (47));
        pixel(husky, color5, pixel_count5,  (57));
        pixel(husky, color6, pixel_count6,  (67));
        pixel(husky, color7, pixel_count7, (77));
        pixel(husky, color8, pixel_count8,  (87));
        pixel(husky, color9, pixel_count9,  (97));
        pixel(husky, color10, pixel_count10,  (107));
        pixel(husky, color11, pixel_count11,  (117));
        pixel(husky, color12, pixel_count12,  (127));
        pixel(husky, color13, pixel_count13,  (137));
        pixel(husky, color14, pixel_count14,  (147));
        pixel(husky, color15, pixel_count15,  (157));
        pixel(husky, color16, pixel_count16,  (167));
        pixel(husky, color17, pixel_count17,  (177));
        pixel(husky, color18, pixel_count18,  (187));
        pixel(husky, color19, pixel_count19,  (197));
        pixel(husky, color20, pixel_count20,  (207));
        pixel(husky, color21, pixel_count21,  (217));
        pixel(husky, color22, pixel_count22,  (227));
        pixel(husky, color23, pixel_count23,  (237));
        pixel(husky, color24, pixel_count24,  (247));
        pixel(husky, color25, pixel_count25,  (257));
        pixel(husky, color26, pixel_count26, (267));
        pixel(husky, color27, pixel_count27,  (277));
        pixel(husky, color28, pixel_count28,  (287));
        pixel(husky, color29, pixel_count29,  (297));
        pixel(husky, color30, pixel_count30,  (307));
        pixel(husky, color31, pixel_count31,  (317));
        pixel(husky, color32, pixel_count32,  (327));
        pixel(husky, color33, pixel_count33,  (337));
        pixel(husky, color34, pixel_count34,  (347));
        pixel(husky, color35, pixel_count35,  (357));
        pixel(husky, color36, pixel_count36,  (367));
        pixel(husky, color37, pixel_count37,  (377));
        pixel(huskie, color38, pixel_count38,  (387));
        pixel(huskie, color39, pixel_count39,  (397));
        pixel(huskie, color40, pixel_count40,  (407));
        pixel(huskie, color41, pixel_count41, (417));
        pixel(huskie, color42, pixel_count42,  (427));
        pixel(husky, color43, pixel_count43,  (437));
        pixel(husky, color44, pixel_count44,  (447));
        pixel(husky, color45, pixel_count45,  (457));
    }
}