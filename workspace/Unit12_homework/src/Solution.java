/*
 * Just a shameless solution copy from downloads. 
 */

import shapes.GeoEquilateralTriangle;
import shapes.GeoRectangle;
import shapes.GeoShape;
import shapes.GeoSquare;
import shapes.GeoTriangle;

public class Solution {

    public static void makeBeetleDraw(GeoShape shape) {
        Beetle joe = new Beetle("black");
        double[] instructions = shape.getDrawingInstructions();
        for (int i = 0; i<instructions.length-1; i = i+2) {
            double distance = instructions[i];
            double angle = instructions[i+1];
            joe.move(distance);
            joe.turn(angle);
        }
        if (instructions.length % 2 != 0) {
            // uneven number of instruction: there is one move left.
            joe.move(instructions[instructions.length-1]);
        }
    }
    
    public static void main(String[] args) {
        GeoEquilateralTriangle equiTri = new GeoEquilateralTriangle(30);
        makeBeetleDraw(equiTri);
        GeoSquare square = new GeoSquare(30);
        //makeBeetleDraw(square);
        GeoShape rectangle = new GeoRectangle(40, 60);
        //makeBeetleDraw(rectangle);
        GeoTriangle tri = new GeoTriangle(40, 40, 40);
        //makeBeetleDraw(tri);
    }
    
}
