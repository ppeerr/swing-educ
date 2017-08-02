package com.per.swing;

import com.per.swing.gui.components.MainFrame;

import javax.swing.*;

/**
 * Test swing app
 *
 * Created by PER on 01.07.2017.
 */
public class App {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(MainFrame::new);

    }

}
