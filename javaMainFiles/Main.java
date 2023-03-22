package javaMainFiles;

import java.awt.Point;
import java.util.Date;


public class Main {
    private static int x;
    private static int y;

    public static void main(String[] args){
        int age; 
        int year;
        Date todaysDate = new Date();
        System.out.println("this is Java code");
        System.out.println(todaysDate);
        Point point1 = new Point(x, y);
        point1.x = 3;
        point1.y=10;
    }
}
