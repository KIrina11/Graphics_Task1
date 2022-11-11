package ru.vsu.cs.kislova_i_v.graphics;

import java.awt.*;

public class Sun {
    private int x;
    private int y;
    private int radius;
    private int l;
    private int n;
    private Color color;

    public Sun(int x, int y, int radius, int l, int n) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.l = l;
        this.n = n;
        this.color = new Color(255, 244, 125);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x - radius, y - radius, 2*radius, 2*radius);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = Math.cos(a) * radius + x;
            double y1 = Math.sin(a) * radius + y;
            double x2 = Math.cos(a) * (radius + l) + x;
            double y2 = Math.sin(a) * (radius + l) + x;
            graphics.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
    }
}
