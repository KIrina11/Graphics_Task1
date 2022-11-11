package ru.vsu.cs.kislova_i_v.graphics;

import java.awt.*;

public class Butterfly {
    private int x;
    private int y;
    private int rLowerWing;
    private int rHigherWing;
    private Color colorWings;

    public Butterfly(int x, int y, Color colorWings) {
        this.x = x;
        this.y = y;
        this.rLowerWing = 10;
        this.rHigherWing = 15;
        this.colorWings = colorWings;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRLowerWing() {
        return rLowerWing;
    }

    public int getRHigherWing() {
        return rHigherWing;
    }

    public Color getColorWings() {
        return colorWings;
    }

    public void setRLowerWing(int rLowerWing) {
        this.rLowerWing = rLowerWing;
    }

    public void setRHigherWing(int rHigherWing) {
        this.rHigherWing = rHigherWing;
    }

    public void setColorWings(Color colorWings) {
        this.colorWings = colorWings;
    }

    void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        //lower wings
        graphics.setColor(this.colorWings);
        graphics.fillOval(x, y, 2*rLowerWing, 2*rLowerWing);
        graphics.fillOval(x + 2 * rLowerWing, y, 2*rLowerWing, 2*rLowerWing);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y, 2*rLowerWing, 2*rLowerWing);
        graphics.drawOval(x + 2 * rLowerWing, y, 2*rLowerWing, 2*rLowerWing);

        //higher wings
        graphics.setColor(this.colorWings);
        graphics.fillOval(x - rLowerWing, y - 3 * rLowerWing, 2*rHigherWing, 2*rHigherWing);
        graphics.fillOval(x + 2 * rHigherWing - rLowerWing, y - 3 * rLowerWing,
                2*rHigherWing, 2*rHigherWing);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x - rLowerWing, y - 3 * rLowerWing,
                2*rHigherWing, 2*rHigherWing);
        graphics.drawOval(x + 2 * rHigherWing - rLowerWing, y - 3 * rLowerWing,
                2*rHigherWing, 2*rHigherWing);

        //body
        graphics.setColor(new Color(54,40,29));
        graphics.fillOval(x + rHigherWing, y - 3 * rLowerWing, rLowerWing, 2 * (rLowerWing + rHigherWing));

        //whiskers
        graphics.setColor(new Color(54,40,29));
        graphics.drawLine(x + rHigherWing + rLowerWing / 2, y - 3 * rLowerWing, x, y - 6 * rLowerWing);
        graphics.drawLine(x + rHigherWing + rLowerWing / 2, y - 3 * rLowerWing,
                x + 2 * (rHigherWing + rLowerWing/2), y - 6 * rLowerWing);
    }
}
