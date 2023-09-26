package com.csc205.project2;

public class Cube implements ThreeDimensionalShape {

    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double w) {
        super();
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    // MY CODE BEFORE AI GENERATION
    /*
    public double surfaceArea() {
        return 6.0 * Math.pow(width, 2);
    }

    public double volume() {
        return  Math.pow(width, 3);
    }
*/

    // AI CODE
    public double volume() {
        return Math.pow(width, 3);
    }

    // AI CODE
    public double surfaceArea() {
        return 6 * Math.pow(width, 2);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("radius=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
