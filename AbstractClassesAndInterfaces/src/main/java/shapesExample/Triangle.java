package shapesExample;

public class Triangle extends Shape{
    private double baseWidth;
    private double height;


    public Triangle(double baseWidth, double height){
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return (baseWidth/2) * height;
    }
}
