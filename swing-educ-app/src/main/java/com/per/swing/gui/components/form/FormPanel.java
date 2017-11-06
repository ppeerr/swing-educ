package com.per.swing.gui.components.form;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FormPanel extends JPanel {

    private JLabel nameLabel = new JLabel("Name: ");
    private JTextField nameField = new JTextField(10);
    private JTextField occupationField = new JTextField(10);
    private JButton okButton = new JButton("Ok");
    private JList<AgeCategory> ageList = new JList<>();
    private JComboBox<String> empComboBox = new JComboBox<>();
    private JCheckBox ruCitizenCheckBox = new JCheckBox();
    private JTextField taxField = new JTextField(10);

    private JRadioButton maleRadio = new JRadioButton("male");
    private JRadioButton femaleRadio = new JRadioButton("female");
    private ButtonGroup genderGroup = new ButtonGroup();

    private FormListener formListener;

    public FormPanel() {
        setPreferredSize(new Dimension(250, (int) getPreferredSize().getHeight()));

        Border innerBorder = BorderFactory.createTitledBorder("Add person");
        Border outerBorder = BorderFactory.createLineBorder(Color.BLACK);
        setBorder(BorderFactory.createCompoundBorder(innerBorder, outerBorder));

        setLayout(new GridBagLayout());

        //// FIRST ROW /////
        add(nameLabel, new GridBagConstraints(
                0,0,
                1,1,
                1,0.1,
                GridBagConstraints.LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 5), 1 ,1
        ));
        nameLabel.setDisplayedMnemonic(KeyEvent.VK_N);
        nameLabel.setLabelFor(nameField);
        add(nameField, new GridBagConstraints(
                1,0,
                1,1,
                1,0.1,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));

        //// SECOND ROW /////
        add(new JLabel("Occupation: "), new GridBagConstraints(
                0,1,
                1,1,
                1,0.1,
                GridBagConstraints.LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 5), 1 ,1
        ));
        add(occupationField, new GridBagConstraints(
                1,1,
                1,1,
                1,0.1,
                GridBagConstraints.LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));

        //// THIRD ROW /////
        initAgeList();

        //// FOURTH ROW /////
        initEmploymentTypeComboBox();

        //// FIFTH ROW /////
        initRuCitizenCheckBox();

        //// SIXTH ROW /////
        initTaxTextField();

        //// SEVENTH ROW /////
        initGenderGroup();

        //// EIGHT ROW /////
        initOkButton();
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }

    private void initAgeList() {
        DefaultListModel<AgeCategory> listModel = new DefaultListModel<>();
        listModel.addElement(new AgeCategory(0,"CHILD"));
        listModel.addElement(new AgeCategory(1,"ADULT"));
        listModel.addElement(new AgeCategory(2,"SENIOR"));

        ageList.setModel(listModel);
        ageList.setPreferredSize(new Dimension(110, 70));
        ageList.setBorder(BorderFactory.createEtchedBorder());
        ageList.setSelectedIndex(0);

        add(ageList, new GridBagConstraints(
                1,2,
                1,1,
                1,0.1,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));
    }

    private void initEmploymentTypeComboBox() {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("EMPLOYED");
        comboBoxModel.addElement("SELF_EMPLOYED");
        comboBoxModel.addElement("UNEMPLOYED");
        comboBoxModel.addElement("OTHER");

        empComboBox.setModel(comboBoxModel);
        empComboBox.setBorder(BorderFactory.createEtchedBorder());
        empComboBox.setSelectedIndex(0);

        add(new JLabel("Employment: "), new GridBagConstraints(
                0,3,
                1,1,
                1,0.2,
                GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 5), 1 ,1
        ));
        add(empComboBox, new GridBagConstraints(
                1,3,
                1,1,
                1,0.2,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));
    }

    private void initRuCitizenCheckBox() {
        ruCitizenCheckBox.addActionListener(e -> taxField.setEnabled(ruCitizenCheckBox.isSelected()));
        ruCitizenCheckBox.setSelected(true);

        add(new JLabel("ruCitizen: "), new GridBagConstraints(
                0, 4,
                1, 1,
                1, 0.1,
                GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
        add(ruCitizenCheckBox, new GridBagConstraints(
                1, 4,
                1, 1,
                1, 0.1,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
    }

    private void initTaxTextField() {
        add(new JLabel("Tax: "), new GridBagConstraints(
                0, 5,
                1, 1,
                1, 0.1,
                GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
        add(taxField, new GridBagConstraints(
                1,5,
                1,1,
                1,0.1,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));
    }

    private void initGenderGroup() {
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        femaleRadio.setSelected(true);
        femaleRadio.setActionCommand("FEMALE");
        maleRadio.setActionCommand("MALE");

        add(new JLabel("Gender: "), new GridBagConstraints(
                0, 6,
                1, 1,
                1, 0.05,
                GridBagConstraints.FIRST_LINE_END, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
        add(maleRadio, new GridBagConstraints(
                1, 6,
                1, 1,
                1, 0.05,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
        add(femaleRadio, new GridBagConstraints(
                1, 7,
                1, 1,
                1, 0.1,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1, 1
        ));
    }

    private void initOkButton() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (formListener != null) {
                    formListener.formEventCatched(new FormEvent(
                            this,
                            nameField.getText(),
                            occupationField.getText(),
                            ageList.getSelectedValue().getText(),
                            (String) empComboBox.getSelectedItem(),
                            taxField.getText(),
                            genderGroup.getSelection().getActionCommand()
                    ));
                }
            }
        });
        okButton.setMnemonic(KeyEvent.VK_O);

        add(okButton, new GridBagConstraints(
                1,8,
                1,1,
                1,1.0,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.NONE,
                new Insets(0, 0, 0, 0), 1 ,1
        ));
    }


    private class AgeCategory {

        private int id;
        private String text;

        public AgeCategory(int id, String text) {
            this.id = id;
            this.text = text;
        }

        public String toString() {
            return this.text;
        }

        public int getId() {
            return id;
        }

        public String getText() {
            return text;
        }
    }

}
