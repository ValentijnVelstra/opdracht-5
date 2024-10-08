package calculator;
import java.lang.Math.*;

public class Circle {
    static double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    Circle(){
        this.radius = radius;
    }

    private double omtrek1 = 0;

    public static double calculateDiameter(double radius){return radius*2;}
    public double calculateDiameter(){return 8*2;}

    public static double calculateOm(double radius){return (radius*2)*Math.PI;}
    public double calculateOm(){return 16*Math.PI;}

    public static double calculateOpp(double radius){return(radius*radius)*Math.PI;}
    public double calculateOpp(){return (8*8)*Math.PI;}

}
