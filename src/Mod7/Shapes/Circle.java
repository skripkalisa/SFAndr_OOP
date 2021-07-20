package Mod7.Shapes;

public class Circle extends Figure implements IShape
{
    private double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    @Override
    public double getSquare()
    {
        this.calculateSquare();
        return this.square;
    }

    @Override
    public void calculateSquare()
    {
        this.square = Math.PI * Math.sqrt(_radius);
    }

    @Override
    public double getPerimeter()
    {
        calculatePerimeter();
        return this.perimeter;
    }

    @Override
    public void calculatePerimeter()
    {
        this.perimeter = 2 * Math.PI * _radius;
    }

    @Override
    public String toString()
    {
        return "Parameters for this circle: Square = " + this.square + ", Perimeter = " + this.perimeter;
    }
}
