package Abstraction;

public  class Circle extends Shape {
    protected double radius = 5.2;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle(" + super.toString() + ", radius=" + radius + ")";
    }
}

