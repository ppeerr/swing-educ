package com.per.swing.gui.components;

import javax.swing.*;
import java.awt.*;

/**
 * Custom text panel
 *
 * Created by PER on 02.07.2017.
 */
public class TextPanel extends JPanel {

    private JTextArea textArea = new JTextArea();


    public TextPanel() {
        setLayout(new BorderLayout());//TODO what for?

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    public void appendText(String text) {
        textArea.append(text);
    }

}
