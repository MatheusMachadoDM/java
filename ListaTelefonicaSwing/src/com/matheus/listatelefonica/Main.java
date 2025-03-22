package com.matheus.listatelefonica;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class BotaoAdicionar implements ActionListener{

	private JFrame janela;
	private JPanel painel;
	
	public BotaoAdicionar(JFrame janela, JPanel painel) {
		this.janela = janela;
		this.painel = painel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		painel.setVisible(true);
		
		JButton botaoConfirmar =  new JButton("Add");
		botaoConfirmar.setBounds(310, 70, 60, 29);
				
		JTextField textoNome = new JTextField();
		JTextField textoNumero = new JTextField();
		textoNome.setBounds(10, 70, 150, 30);
		textoNumero.setBounds(160, 70, 150, 30);
		
		JLabel nomeLabel = new JLabel("Nome: ");
		JLabel numeroLabel = new JLabel("Número: ");
		nomeLabel.setBounds(10, 40, 150, 30);
		numeroLabel.setBounds(160, 40, 150, 30);
		
		painel.add(botaoConfirmar);
		painel.add(numeroLabel);
		painel.add(textoNumero);
		painel.add(nomeLabel);
		painel.add(textoNome);
		painel.revalidate();
        painel.repaint();
		
	}
	
}

class BotaoExcluir implements ActionListener{
	
	private JFrame janela;
	
	public BotaoExcluir(JFrame janela) {
		this.janela = janela;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoConfirmar =  new JButton("Deletar");
		botaoConfirmar.setBounds(260, 70, 110, 29);
		
		JTextField textoNome = new JTextField();
		textoNome.setBounds(10, 70, 250, 30);
		
		JLabel nomeLabel = new JLabel("Confirme o nome para excluir: ");
		nomeLabel.setBounds(10, 40, 250, 30);
		
		janela.add(botaoConfirmar);
		janela.add(nomeLabel);
		janela.add(textoNome);
		janela.revalidate();
        janela.repaint();
	}
}

public class Main {
public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		JPanel painel = new JPanel();
		
		painel.setLayout(null);
        painel.setBounds(10, 50, 380, 150);
        painel.setVisible(false);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.addActionListener(new BotaoAdicionar(janela, painel));
		JButton botaoExcluir = new JButton("Excluir");
		botaoExcluir.addActionListener(new BotaoExcluir(janela));
		
		botaoAdicionar.setBounds(10, 10, 100,30);
		botaoExcluir.setBounds(110, 10, 100,30);
		
		String[] lista = {"ana", "Jose"};
		
		JList<String> listaContato = new JList<>(lista);
		JScrollPane listaScroll = new JScrollPane(listaContato);
		
		listaScroll.setBounds(10, 120, 360, 400);
		
		janela.getContentPane().add(painel);
		janela.getContentPane().add(listaScroll);
		janela.add(botaoExcluir);
		janela.add(botaoAdicionar);
		janela.setLayout(null);
		janela.setBounds(0, 0, 400, 600);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		
		
		
		
		
	}

}
