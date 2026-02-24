package edu.unac.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void SimpleCollisionTests(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(6,7, 2, 2);
        Assertions.assertTrue(rectangleA.collision(rectangleB));
    }

    @Test
    void NoCollisionTests(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(10,5, 2,2);
        Assertions.assertFalse(rectangleA.collision(rectangleB));
    }
}