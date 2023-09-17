package org.example;

abstract class Shape implements Comparable<Shape>{
    public abstract double getArea();
        //one equation for circle

        //one equation for rectangle


    public abstract double getPerimeter();
        //one equation for circle

        //one equation for rectangle
@Override
    public int compareTo(Shape other){
    return Double.compare(this.getArea(), other.getArea());
}

}
