package ControlFlowInJava;

public class Example3 {
    public static void main(String[] args) {
        //Area of rectangle
        int length;
        int width;
        int areaOfRectangle;

        length = 10;
        width = 5;

        areaOfRectangle = length * width;
        System.out.println("Area of Rectangle : " + areaOfRectangle);


        //Area of square
        int side;
        int areaOfSquare;

        side = 5;

        areaOfSquare = side * side;
        System.out.println("Area of Square : " + areaOfSquare);


        //Area of Rhombus
        int lengthOfSide;
        int areaOFRhombus;

        lengthOfSide = 10;

        areaOFRhombus = lengthOfSide* lengthOfSide;
        System.out.println("Area of Rhombus : " + areaOFRhombus);


        //Area of parallelogram
        int lengthOfParallelogram;
        int widthOfParallelogram;
        int areaOfParallelogram;

        lengthOfParallelogram =10;
        widthOfParallelogram = 5;

        areaOfParallelogram = lengthOfParallelogram * widthOfParallelogram;
        System.out.println("Area of parallelogram : " + areaOfParallelogram);


        //Heron's formula for calculating area of triangle
        double A;             //length of side a
        double B;             // length of side b
        double C;             // length of side c
        double s;              // semi-perimeter
        double areaOfTriangle;

        A = 4;
        B = 5;
        C = 6;

        s = (A + B + C)/2;
        areaOfTriangle = Math.sqrt(s * ((s-A) * (s-B) * (s-C)));
        System.out.println("Area of triangle : " + areaOfTriangle);



       //Calculation of the roots of a Quadratic Equation
        double a;
        double b;
        double c;
        double delta;
        double r1;
        double r2;

        a = 1;
        b = 8;
        c = 15;

        delta = (b * b) - (4 * a * c);
        r1 = (- b + Math.sqrt(delta))/ (2 * a);
        System.out.println("The value of root1 is : " + r1);
        r2 = (- b - Math.sqrt(delta))/ (2 * a);
        System.out.println("The value of root2 is :" + r2);






    }
}
