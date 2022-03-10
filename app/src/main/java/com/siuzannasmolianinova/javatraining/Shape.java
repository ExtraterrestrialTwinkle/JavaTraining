package com.siuzannasmolianinova.javatraining;
/**
 * 4.Создать интерфейс Shape с двумя методами perimeter и area, выводящими периметр и площадь
 *  фигуры соответственно, после чего реализовать и использовать для вывода периметра и площади
 *  следующие классы, реализующие интерфейс Shape:
 *  Rectangle - прямоугольник с двумя свойствами: ширина и длина
 *  Square - квадрат с одним свойством: длина стороны
 *  Circle - круг с одним свойством: диаметр круга
 */

public interface Shape {
    void perimeter();
    void square();
}

class Rectangle implements Shape{
    private int a, b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void perimeter() {
        int p = (a + b) * 2;
        System.out.printf("Rectangle perimeter: %d \n", p);
    }

    @Override
    public void square() {
        int s = a * b;
        System.out.printf("Rectangle square: %d \n", s);
    }
}

class Square implements Shape{
    private int a;
    public Square(int a){
        this.a = a;
    }

    @Override
    public void perimeter() {
        int p = a * 4;
        System.out.printf("Rectangle perimeter: %d \n", p);
    }

    @Override
    public void square() {
        int s = a * a;
        System.out.printf("Rectangle square: %d \n", s);
    }
}

class Circle implements Shape{
    private int r;
    public Circle(int r){
        this.r = r;
    }

    @Override
    public void perimeter() {
        double p = 2 * Math.PI * r;
        System.out.printf("Rectangle perimeter: %f \n", p);
    }

    @Override
    public void square() {
        double s = Math.PI * r * r;
        System.out.printf("Rectangle square: %f \n", s);
    }
}

class Main1{
    public static void main (String[] args){
        Rectangle rect = new Rectangle(3,4);
        Square sq = new Square(5);
        Circle cr = new Circle(3);
        rect.perimeter();
        rect.square();
        sq.perimeter();
        sq.square();
        cr.perimeter();
        cr.square();
    }
}
