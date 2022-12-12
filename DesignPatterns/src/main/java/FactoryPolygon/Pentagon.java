package FactoryPolygon;

public class Pentagon implements Polygon{
    @Override
    public String toString() {
        return "This is a pentagon";
    }

    public String onlyPentagons(){
        return "Only pentagons can do this";
    }
}