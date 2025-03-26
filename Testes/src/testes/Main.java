package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JList Seleção");
        
        List<String> modelo = new ArrayList<>();
        
        
        modelo.add("Item 1");
        modelo.add("Item 2");
        modelo.add("Item 3");
        
        JList<String> lista = new JList<>(modelo.toArray(new String[0]));
        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Seleção alterada: " + lista.getSelectedValue());
                }
            }
        });

        frame.add(new JScrollPane(lista));
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}