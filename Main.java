package de.mat2095.my_slither;

import javax.swing.*;

/**
 * Class contains the Main
 * Enables running of program
 */

public final class Main {

    public static void main(String[] args) {

        System.setProperty("sun.java2d.opengl", "true");

        // workaround to fix issue on linux: https://github.com/bulenkov/Darcula/issues/29
        UIManager.getFont("Label.font");
        try {
            UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        new MySlitherJFrame().setVisible(true);

    }
}
