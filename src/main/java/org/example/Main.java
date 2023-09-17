package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Shape> shapeList = new ArrayList<>();
        HashSet<Shape> shapeHashSet = new HashSet<>();
        Random randomNumber = new Random();

        for (int i = 0; i < 2; i++) {
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

        for (int i = 0; i<2; ++i){
            //replace with method(function) to get random numbers

            double randomRadius = randomNumber.nextDouble(100.0);
            double randomWidth = randomNumber.nextDouble(100.0);
            double randomHeight = randomNumber.nextDouble(100.0);


            Circle circle = new Circle(randomRadius);
            shapeHashSet.add(circle);
            shapeHashSet.add(circle);

            Rectangle rectangle = new Rectangle(randomHeight, randomWidth);
            shapeHashSet.add(rectangle);
            shapeHashSet.add(rectangle);


        }

        Collections.sort(shapeList);
        System.out.println("sort:");
        for(Shape shape: shapeList){
            System.out.println(shape.getArea() + " : " +  shape.getPerimeter());
        }
        System.out.println("shapeHashSet");
        for(Shape shape: shapeHashSet){
            System.out.println("hashset :" + shape.getArea() + " " + shape.getPerimeter());
        }
    }


}
