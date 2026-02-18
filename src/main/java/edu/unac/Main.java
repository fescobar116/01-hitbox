package edu.unac;

import edu.unac.domain.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //simple collision works
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(6,7, 2, 2);
        assertTrue(rectangleA.collision(rectangleB), "Simple collision");

        //No collision works
        rectangleB = new Rectangle(10,5, 2,2);
        assertTrue(!rectangleA.collision(rectangleB), "No collision");

        //side collision works
        rectangleB = new Rectangle(1,5, 2,2);
        assertTrue(rectangleA.collision(rectangleB), "Side collision");

        //corner collision works
        rectangleB = new Rectangle(8, 2, 4, 2);
        assertTrue(rectangleA.collision(rectangleB), "Corner collision");

        //contain collision works
        rectangleB = new Rectangle(4,5,2,2);
        assertTrue(rectangleA.collision(rectangleB), "Contain collision");
    }

    private static void assertTrue(boolean expression, String testCase){
        if (expression)
            System.out.println(testCase + "works");
        else
            throw new RuntimeException("ERROR!!!!!" + testCase);
    }
}
