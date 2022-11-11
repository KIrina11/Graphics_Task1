package ru.vsu.cs.kislova_i_v.graphics;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private int PANEL_WIDTH;
    private int PANEL_HEIGHT;
    private java.util.List<Butterfly> butterflies;
    private java.util.List<Flower> flowers;
    private java.util.List<Cloud> clouds;
    private Sun sun;

    public DrawPanel(final int width, final int height) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        butterflies = new ArrayList<>();
        flowers = new ArrayList<>();
        clouds = new ArrayList<>();
        this.sun = new Sun(40, 30, 50, 50, 20);
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    @Override
    public void paint(final Graphics graphics) {
        super.paint(graphics);

        //sky
        setBackground(new Color(171, 217, 255));
        sun.draw(graphics);

        //grass
        graphics.setColor(new Color(169, 197, 47));
        graphics.drawRect(0, 350, 10000, 600);
        graphics.fillRect(0,350,10000,600);

        //clouds
        int k = 100;
        for (int i = 0; i < 4; i++) {
            Cloud cloud = new Cloud(k + rnd(-50, 50), rnd(30, 130));
            clouds.add(cloud);
            k += 200;
        }
        for (int j = 0; j < 4; j++) {
            clouds.get(j).draw(graphics);
        }

        //flowers
        int n = 50;
        for (int i = 0; i < 15; i++) {
            if (i < 4) {
                Flower flower = new Flower(n + rnd(-50, 50), 370 + rnd(-40, 40));
                flowers.add(flower);
                n += 150;
            } else {
                if (i < 9) {
                    Flower flower = new Flower(n + rnd(-50, 50), 450 + rnd(-40, 40));
                    flowers.add(flower);
                    n -= 150;
                } else {
                    Flower flower = new Flower(n + rnd(-50, 50), 530 + rnd(-40, 40));
                    flowers.add(flower);
                    n += 150;
                }
            }
        }
        for (int j = 0; j < 15; j++) {
            flowers.get(j).draw(graphics);
        }

        //butterflies
        ArrayList<Color> colors = new ArrayList<>();
        for (int z = 0; z < 4; z++) {
            colors.add(new Color(rnd(150, 250), rnd(150, 250), rnd(150, 250)));
        }
        int c = 150;
        for (int i = 0; i < 4; i++) {
            Butterfly butterfly = new Butterfly(c + rnd(-30, 30), rnd(300, 400), colors.get(i));
            butterflies.add(butterfly);
            c += 150;
        }
        for (int j = 0; j < 4; j++) {
            butterflies.get(j).draw(graphics);
        }

        //string
        graphics.setColor(new Color(236,240,241));
        graphics.fillRoundRect(550, 450, 170, 100, 10, 10);
        graphics.setColor(Color.BLACK);
        graphics.drawRoundRect(550, 450, 170, 100, 10, 10);
        graphics.drawString("Физминутка", 590, 470);
        graphics.drawString("Утром бабочка проснулась", 560, 485);
        graphics.drawString("Улыбнулась, потянулась.", 560, 495);
        graphics.drawString("Раз - росой она умылась,", 560, 505);
        graphics.drawString("Два - изящно покружилась,", 560, 515);
        graphics.drawString("Три - тихонечко присела,", 560, 525);
        graphics.drawString("На четыре улетела.", 560, 535);
    }
}
