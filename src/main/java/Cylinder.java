import interfaz.GeometricShape3D;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;
    private static final double PI = Math.PI;
    private double radius;

    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return PI*radius;
    }

    @Override
    public double getSuperficialArea() {
        return 0;
    }
}
