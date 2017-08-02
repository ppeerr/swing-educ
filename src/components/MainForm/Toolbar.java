package components.MainForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Custom panel
 *
 * Created by PER on 02.07.2017.
 */
public class Toolbar extends JPanel implements ActionListener{

    private JButton pingButton = new JButton("Ping");
    private JButton pongButton = new JButton("Pong");

    private StringListener listener;

    public Toolbar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));//TODO what for?

        setBorder(BorderFactory.createEtchedBorder());

        add(pingButton);
        add(pongButton);

        pingButton.addActionListener(this);
        pongButton.addActionListener(this);
    }


    public void setStringListener(StringListener listener) {
        this.listener = listener;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if (clicked == pingButton) {
            listener.textDriven("PING!\n");
        } else if (clicked == pongButton) {
            listener.textDriven("PONG!\n");
        }

    }
}
