package FactoryPolygon;

public class Square implements Polygon{
    @Override
    public String getType() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "This is a square";
    }
}