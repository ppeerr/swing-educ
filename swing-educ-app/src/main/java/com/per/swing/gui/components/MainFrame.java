package com.per.swing.gui.components;

import com.per.swing.controller.Controller;
import com.per.swing.gui.components.form.FormPanel;
import com.per.swing.gui.filter.PersonFileFilter;
import com.per.swing.model.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Custom frame
 * <p>
 * Created by PER on 02.07.2017.
 */
public class MainFrame extends JFrame {

    private Controller controller = new Controller();

    private TextPanel textPanel = new TextPanel();
    private Toolbar toolbar = new Toolbar();

    private FormPanel formPanel = new FormPanel();

    private JFileChooser fileChooser = new JFileChooser();

    private JButton btn = new JButton("Start");


    public MainFrame() {

        super("Fuck yeah!");
        setLayout(new BorderLayout()); //TODO what for?

        setJMenuBar(createMenuBar());
        initToolbar();
        initTextPanel();
        initFormPanel();
        initBtn();

        setSize(700, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }


    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        fileChooser.addChoosableFileFilter(new PersonFileFilter());

        JMenuItem exportDataItem = new JMenuItem("Export Data...");
        exportDataItem.addActionListener(e -> fileChooser.showSaveDialog(this));
        fileMenu.add(exportDataItem);

        JMenuItem importDataItem = new JMenuItem("Import Data...");
        importDataItem.addActionListener(e -> {
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                System.out.print(fileChooser.getSelectedFile());
            }
        });
        fileMenu.add(importDataItem);

        fileMenu.addSeparator();
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> {
            int userAction = JOptionPane.showConfirmDialog(
                    this,
                    "Do you really want to exit?",
                    "Confirm Exit",
                    JOptionPane.YES_NO_OPTION
            );
            if (userAction == JOptionPane.OK_OPTION) {
                System.exit(0);
            }
        });
        exitItem.setMnemonic(KeyEvent.VK_X);
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
        fileMenu.add(exitItem);
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");

        JCheckBoxMenuItem showPersonItem = new JCheckBoxMenuItem("Show Person");
        showPersonItem.setSelected(true);
        showPersonItem.addActionListener(e -> {
            JCheckBoxMenuItem checkBox = (JCheckBoxMenuItem)e.getSource();

            formPanel.setVisible(checkBox.isSelected());
        });
        showMenu.add(showPersonItem);

        windowMenu.add(showMenu);
        menuBar.add(windowMenu);

        return menuBar;
    }

    private void initToolbar() {
        add(toolbar, BorderLayout.NORTH);
        toolbar.setStringListener(text -> textPanel.appendText(text));
    }

    private void initTextPanel() {
        add(textPanel, BorderLayout.CENTER);
    }

    private void initFormPanel() {
        add(formPanel, BorderLayout.WEST);

        formPanel.setFormListener(event -> {
            //controller.addPerson(event);
            Person.checkPersons(new Person(), new Person(), new Person());
        });
    }

    private void initBtn() {
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(e -> textPanel.appendText("Fuck off!\n"));
    }

}
