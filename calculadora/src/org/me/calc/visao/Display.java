package org.me.calc.visao;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import modelo.Memoria;
import modelo.MemoriaObservador;

import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;

public class Display extends JPanel implements MemoriaObservador{

    private final JLabel label;
    
    public Display() {

        Memoria.getInstancia().registrarObservador(this);

        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new FontUIResource("courier", Font.PLAIN, 30));
        
        setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        
        label.setText(novoValor);
    }
}
