package FactoryPolygon;

public class Main {
    public static void main(String[] args) {
        Polygon newPolygon = new PolygonFactory().getPolygon(5);

        System.out.println(newPolygon.getType());
        System.out.println(newPolygon.getClass()); // As you can see this creates a new Pentagon object without explicitly declaring a pentagon
    }
}
