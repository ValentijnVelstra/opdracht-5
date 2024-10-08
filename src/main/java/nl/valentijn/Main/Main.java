package nl.valentijn.Main;

import calculator.Rectangle;
import calculator.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 2);
        Rectangle rectangle2 = new Rectangle(4, 2);

        Circle circle = new Circle(8);
        Circle circle2 = new Circle(8);

        rectangle = new Rectangle(8);
        rectangle2 = new Rectangle();

        int paal = 5;
        double meterperpaal = 0.5;

        System.out.println("oppervlakte: " + rectangle.calculateOpp());
        System.out.println("omtrek: " + rectangle.calculateOm());
        System.out.println("rect in rect: " + rectangle.calculateOpp()/rectangle2.calculateOpp());

        System.out.println("meter per paal: " + (rectangle.calculateOm())/paal);
        System.out.println("palen per omtrek: " + (rectangle.calculateOm())/meterperpaal);
        System.out.println("--------");

        System.out.println("diameter: " + circle.calculateDiameter());
        System.out.println("omtrek: " + circle.calculateOm());
        System.out.println("oppervlakte: " + circle.calculateOpp());

        System.out.println("meter per paal: " + (circle.calculateOm())/paal);
        System.out.println("palen per omtrek: " + (circle.calculateOm())/meterperpaal);



            }
        }
