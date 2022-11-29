package FactoryPolygon;

public class Heptagon implements Polygon{
    @Override
    public String getType() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "This is a heptagon";
    }
}