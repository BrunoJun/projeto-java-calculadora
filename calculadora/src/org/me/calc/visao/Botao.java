package org.me.calc.visao;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.awt.Color;

public class Botao extends JButton{
    
    public Botao(String texto, Color cor) {
        
        setText(texto);
        setForeground(Color.WHITE);
        setFont(new FontUIResource("courier", Font.PLAIN, 15));
        setOpaque(true);
        setBackground(cor);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
