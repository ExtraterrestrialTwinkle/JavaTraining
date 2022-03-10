package com.siuzannasmolianinova.javatraining;

/**
 * Условия: есть начальная позиция на двумерной плоскости, можно осуществлять последовательность
 *  шагов по четырем направлениям up, down, left, right. Размерность каждого шага равна 1.
 *
 *  Задание:
 *  3. Создать enum Directions с возможными направлениями движения
 *  Создать метод, принимающий координаты и одно из направлений и возвращающий координаты после
 *  перехода по направлению. Создать метод, осуществляющий несколько переходов от первоначальных
 *  координат и выводящий координаты после каждого перехода. Для этого внутри метода следует
 *  определить переменную location с начальными координатами (0,0) и массив направлений, содержащий
 *  элементы [up, up, left, down, left, down, down, right, right, down, right], и програмно вычислить
 *  какие будут координаты у переменной location после выполнения этой последовательности шагов.
 *  Для вычисленеия результата каждого перемещения следует использовать созданный ранее метод
 *  перемещения на один шаг.
 */
public class Geometry {

    public static void main(String[] args){
        changeCoordinates();
    }

    private static Coordinates step(Coordinates start, Directions direction) {
        switch(direction){
            case UP:{
                start.y++;
                break;
            }
            case DOWN:{
                start.y--;
                break;
            }
            case LEFT:{
                start.x--;
                break;
            }
            case RIGHT:{
                start.x++;
                break;
            }
        }
        return start;
    }

    public static void changeCoordinates(){
        Coordinates location = new Coordinates(0,0);
        Directions[] directions = new Directions []{
                Directions.UP,
                Directions.UP,
                Directions.LEFT,
                Directions.DOWN,
                Directions.LEFT,
                Directions.DOWN,
                Directions.DOWN,
                Directions.RIGHT,
                Directions.RIGHT,
                Directions.DOWN,
                Directions.RIGHT
        };
        for (Directions direction : directions){
            step(location, direction);
            System.out.println(location.toString());
        }
    }
}

enum Directions{
    UP, DOWN, LEFT, RIGHT
}

class Coordinates {
    int x = 0;
    int y = 0;
    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

