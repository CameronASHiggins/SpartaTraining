package FactoryPolygon;

public interface Polygon {

    default String getType() {
        return this.toString();
    }
}
