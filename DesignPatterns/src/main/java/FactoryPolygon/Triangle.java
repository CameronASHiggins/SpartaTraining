package FactoryPolygon;

public class Triangle implements Polygon{

    @Override
    public String getType() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "This is a triangle";
    }
}
