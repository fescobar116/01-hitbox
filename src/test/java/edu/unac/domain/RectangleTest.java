package edu.unac.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    void simpleCollisionTest(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(6,7, 2, 2);
        assertTrue(rectangleA.collision(rectangleB));
    }

    @Test
    void noCollisionTest(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(10,5, 2,2);
        assertFalse(rectangleA.collision(rectangleB));
    }

    @Test
    void sideCollisionTest(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(1,5, 2,2);
        assertTrue(rectangleA.collision(rectangleB));
    }

    @Test
    void cornerCollisionTest() {
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(8, 2, 4, 2);
        assertTrue(rectangleA.collision(rectangleB));
    }

    @Test
    void containCollisionTest(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Rectangle rectangleB = new Rectangle(4,5,2,2);
        assertTrue(rectangleA.collision(rectangleB));
    }

    @Test
    void rectangleIsRequiredTest(){
        Rectangle rectangleA = new Rectangle(4,5, 4, 4);
        Exception ex = assertThrows( IllegalArgumentException.class  ,
                () -> rectangleA.collision(null) );

        String message = ex.getMessage();
        assertEquals("Rectangle is required", message);
    }
}