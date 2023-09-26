package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
    /*
    LINK TO AI CONVERSATION; " https://chat.openai.com/share/c89f0ce3-5baf-4be2-9a4d-976ce553247e"
    MY SENTENCES TO AI:
    First: I need the method codes for the volume and Surface area for 4 different 3d shapes, Sphere, Cube, Cylinder, and Cone. Sphere variables are radius.
            Cube variables are width. Cylinder variables are height and width. Cone variables are height and width. I don't need getters, setters, constructors, or any other bloat code.
             I just want the code containing the formulas for each.

    Then: Good, but change the volume and surface Area names in each to "volume" and surfaceArea". Also slantheight is just "height."
           repeat what you said last time with these changes.

    Then: Good, now just remove the "double varable name" from inside every ()

    Then: wrong, for instance remove the "double radius" from public double volume. but do that for everything.

    Then: good, now remove the word double from inside every ()

    Then: Wrong. For instance remove the "double, double" from public double volume(double, double) but for all of them.

    Then: Perfect


    Really struggled removing the doubles lol

     */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape cone = new Cone(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        //Sphere sphere = new Sphere(2.0);
        //System.out.println(sphere);

    }

}

