package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Shape> shapeList = new ArrayList<>();
        Random randomNumber = new Random();
        for (int i = 0; i < 7; i++) {
            double randomRadius = randomNumber.nextDouble(100.0);
            double randomWidth = randomNumber.nextDouble(100.0);
            double randomHeight = randomNumber.nextDouble(100.0);

            Circle circle = new Circle(randomRadius);
            Rectangle rectangle = new Rectangle(randomHeight, randomWidth);
            shapeList.add(circle);
            shapeList.add(rectangle);


            System.out.println(
                    circle.getArea() +
                            " circle area"
            );
            System.out.println(
                    rectangle.getArea() +
                            " rectangle area"
            );
            System.out.println(
                    circle.getPerimeter() +
                            " circle perimiter"
            );
            System.out.println(
                    rectangle.getPerimeter() +
                            " rectangle perimiter"
            );
        }
        Collections.sort(shapeList);
        for(Shape shape: shapeList){
            System.out.println(shape.getArea() + " : " +  shape.getPerimeter());
        }
        }


}
