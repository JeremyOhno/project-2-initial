package com.csc205.project2;

public class Cone implements ThreeDimensionalShape{
    private double radius;
    private double height;

    public Cone() {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double h, double r) {
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight() {
        return height;

    }

    public double getRadius() {
        return radius;
    }

    // MY CODE BEFORE AI GENERATION
/*
    public double surfaceArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
*/

    // AI CODE
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // AI CODE
    public double surfaceArea() {
        return Math.PI * radius * (radius + height);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }

}
