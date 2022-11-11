package ru.vsu.cs.kislova_i_v.graphics;

import java.awt.*;

public class Flower {
    private int x;
    private int y;
    private int radius;
    private Color colorFlowerPetal;

    public Flower(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = 15;
        this.colorFlowerPetal = new Color(255, 192, 144);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.colorFlowerPetal = colorFlowerPetal;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public Color getColorFlowerPetal() {
        return colorFlowerPetal;
    }

    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        //petal 1
        graphics.setColor(this.colorFlowerPetal);
        graphics.fillOval(x + radius, y, 4*radius, 2*radius);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x + radius, y, 4*radius, 2*radius);

        //petal 2
        graphics.setColor(this.colorFlowerPetal);
        graphics.fillOval(x - 3*radius, y, 4*radius, 2*radius);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x - 3*radius, y, 4*radius, 2*radius);

        //petal 3
        graphics.setColor(this.colorFlowerPetal);
        graphics.fillOval(x, y + radius, 2*radius, 4*radius);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y + radius, 2*radius, 4*radius);

        //petal 4
        graphics.setColor(this.colorFlowerPetal);
        graphics.fillOval(x, y - 3*radius, 2*radius, 4*radius);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y - 3*radius, 2*radius, 4*radius);

        //middle
        graphics.setColor(new Color(255, 239, 130));
        graphics.fillOval(x, y, 2*radius, 2*radius);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y, 2*radius, 2*radius);
    }
}
