package com.samsung.hw07112022.Vector2D;
import java.util.Locale;

public class Vector2D {
    private double vX, vY;
    public static int count = 0;
    
    public Vector2D(){
        this.vX = 1;
        this.vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY){
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D v){
        this.vX = v.vX;
        this.vY = v.vY;
        count++;
    }

    public void add(Vector2D v){
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v){
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor){
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public double length(){
        return Math.sqrt(this.vX * this.vX + this.vY * this.vY);
    }

    public void normalized(){
        double inv_length = (1 / length());
        vX *= inv_length;
        vY *= inv_length;
    }

    public double dotProduct(Vector2D v){
        return this.vX * v.vX + this.vY * v.vY;
    }

    public void print(){
        System.out.println("(" + String.format(Locale.US, "%.2f", vX)
                 + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }
}
