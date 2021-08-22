package org.me.calc.visao;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

public class Display extends JPanel{

    private final JLabel label;
    
    public Display() {

        setBackground(new Color(46, 49, 50));
        label = new JLabel("1234,56");
        label.setForeground(Color.WHITE);
        label.setFont(new FontUIResource("courier", Font.PLAIN, 30));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));

        add(label);
    }
}
