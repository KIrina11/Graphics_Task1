package ru.vsu.cs.kislova_i_v.graphics;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(800, 600);
        mainWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
