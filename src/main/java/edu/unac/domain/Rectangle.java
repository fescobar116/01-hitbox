package edu.unac.domain;

public class Rectangle {
    private int xCoord;
    private int yCoord;
    private int width;
    private int height;

    public Rectangle(int xCoord, int yCoord, int width, int height) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.width = width;
        this.height = height;
    }

    private double getMinX(){
        return xCoord - (double) width/2;
    }

    private double getMaxX(){
        return xCoord + (double) width/2;
    }

    private double getMinY(){
        return yCoord - (double) height/2;
    }

    private double getMaxY(){
        return yCoord + (double) height/2;
    }

    private boolean contain(double x, double y){
        return getMinX() <= x && x <= getMaxX() &&
            getMinY() <= y && y <= getMaxY();
    }

    public boolean collision(Rectangle rectangle){
        if (rectangle == null)
            throw new IllegalArgumentException("Rectangle is required");

        return this.contain(rectangle.getMinX() , rectangle.getMaxY()) ||
                this.contain(rectangle.getMaxX() , rectangle.getMaxY()) ||
                this.contain(rectangle.getMinX() , rectangle.getMinY()) ||
                this.contain(rectangle.getMaxX() , rectangle.getMinY());
    }
}
