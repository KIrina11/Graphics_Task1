package ru.vsu.cs.kislova_i_v.graphics;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private DrawPanel panel;

    public MainWindow(int width, int height) throws HeadlessException {
        this.setSize(width, height);
        panel = new DrawPanel(width, height);
        this.add(panel);
    }
}
