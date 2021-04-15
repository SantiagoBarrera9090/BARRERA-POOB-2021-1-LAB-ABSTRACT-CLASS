import interfaz.GeometricShape3D;

public class RectangleSolid extends Rectangle implements GeometricShape3D {
    private double depth = 1.0;

    public RectangleSolid(){
    }

    public RectangleSolid(String color) {
        super(color);

    }

    public RectangleSolid(double width, double length, double depth) {
        super(width, length);
        this.depth = depth;
    }

    public RectangleSolid(String color, double width, double length, double depth) {
        super(color, width, length);
        this.depth = depth;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }

    @Override
    public double getVolume() {
        return width*length*depth;
    }

    @Override
    public double getSuperficialArea() {
        return (((2*width)*length)+((2*width)*depth)+((2*depth)*length));
    }
}
