package com.csc205.project2;

public class Cylinder implements ThreeDimensionalShape {
    private double height;

    private double radius;

    public Cylinder(){
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cylinder(double h, double r){
        super();
        this.height = h;
        this.radius = r;
    }

    public double getHeight(){
       return height;
    }

    public double getRadius(){
      return radius;
    }

    public void setHeight(double height){
     this.height = height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }


/* MY CODE BEFORE AI GENERATION
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) + height;
    }
*/

    // AI CODE
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // AI CODE
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }





}
