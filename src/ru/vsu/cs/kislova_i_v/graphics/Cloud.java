package ru.vsu.cs.kislova_i_v.graphics;

import java.awt.*;

public class Cloud {
    private Color color;
    private int width;
    private int height;
    private int x;
    private int y;

    public Cloud(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 25;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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

    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics.setColor(new Color(236,240,241));
        graphics.fillOval(x, y, 2*width, 2*height);
        graphics.fillOval(x+25, y-15, 2*(width-10),2*height);
        graphics.fillOval(x+50, y, 2*width, 2*height);
    }
}
