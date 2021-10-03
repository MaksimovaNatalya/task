package by.epam.tc.task;

//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.setFirstCathetus(33);
        myTriangle.setSecondCathetus(22);
        if (myTriangle.getFirstCathetus() > 0 && myTriangle.getSecondCathetus() > 0) {

            System.out.println(findPerimeter(myTriangle.getFirstCathetus(), myTriangle.getSecondCathetus()));
            System.out.println(findSquare(myTriangle.getFirstCathetus(), myTriangle.getSecondCathetus()));

        } else {
            System.out.println("Периметр и площадь не могут быть вычеслены, так как введена отрицательная длина катета");
        }

    }

    private static double findPerimeter(double a, double b) {

        double p;
        p = (sqrt(pow(a, 2) + pow(b, 2))) + a + b;
     //   System.out.println("Периметр прямоугольного треугольника - " + p);
        return p;
    }

    private static double findSquare(double a, double b) {
        double s;
        s = (a * b) / 2;
  //      System.out.println("Площадь прямоугольного треугольника - " + s);
        return s;
    }
}