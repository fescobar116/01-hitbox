package edu.unac.domain;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    private double getMinX(){
        return x - (double) width/2;
    }

    private double getMaxX(){
        return x + (double) width/2;
    }

    private double getMinY(){
        return y - (double) height/2;
    }

    private double getMaxY(){
        return y + (double) height/2;
    }

    private boolean contain(double x, double y){
        return getMinX() <= x && x <= getMaxX() &&
            getMinY() <= y && y <= getMaxY();
    }

    public boolean collision(Rectangle rectangle){
        return this.contain(rectangle.getMinX() , rectangle.getMaxY()) ||
                this.contain(rectangle.getMaxX() , rectangle.getMaxY()) ||
                this.contain(rectangle.getMinX() , rectangle.getMinY()) ||
                this.contain(rectangle.getMaxX() , rectangle.getMinY());
    }
}
