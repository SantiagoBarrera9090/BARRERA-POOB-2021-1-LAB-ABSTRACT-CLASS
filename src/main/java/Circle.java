import interfaz.GeometricShape2D;

/**
 * Clase que define un Circulo. <br>
 * Un Circulo es una figura Shape, pero también implementa los comportamientos de una figura de dos dimensiones.
 */
public class Circle extends Shape implements GeometricShape2D{

    private double radius;
    private static final double PI = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getDiameter() {
        return 2*radius;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

}
