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
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
			
			JFrame janela = new JFrame();
			JPanel painelAdd = new JPanel();
			JPanel painelExcluir = new JPanel();
			
			painelAdd.setLayout(null);
	        painelAdd.setBounds(10, 40, 380, 80);
	        painelAdd.setVisible(false);
	        
	        painelExcluir.setLayout(null);
	        painelExcluir.setBounds(10, 40, 380, 80);
	        painelExcluir.setVisible(false);

			List<String> listaNomes = new ArrayList<>();
			List<String> listaNumeros = new ArrayList<>();
			
			JList<String> listaContato = new JList<>(listaNomes.toArray(new String[0]));
			
			FuncionalidadeAdicionar funcionalidadeAdicionar = new FuncionalidadeAdicionar(painelAdd, painelExcluir, listaNomes, listaNumeros, listaContato);
			 
	        JButton botaoAdicionar = new JButton("Adicionar");
	        botaoAdicionar.addActionListener(funcionalidadeAdicionar);
	        
			JButton botaoExcluir = new JButton("Excluir");
			botaoExcluir.addActionListener(new BotaoExcluir(painelExcluir, painelAdd));
			
			botaoAdicionar.setBounds(10, 10, 100,30);
			botaoExcluir.setBounds(110, 10, 100,30);
			
			JScrollPane listaScroll = new JScrollPane(listaContato);
			
			listaScroll.setBounds(10, 120, 360, 400);
			
			janela.getContentPane().add(painelAdd);
			janela.getContentPane().add(painelExcluir);
			janela.getContentPane().add(listaScroll);
			janela.add(botaoExcluir);
			janela.add(botaoAdicionar);
			janela.setLayout(null);
			janela.setBounds(0, 0, 400, 600);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setVisible(true);
			
	}
	
}
class FuncionalidadeAdicionar implements ActionListener{

	private JPanel painelAtivar, painelDesativar;
	private JTextField textoNome, textoNumero;
	private List<String> listaNomes, listaNumeros;
	private JList<String> listaContato;
	
	public FuncionalidadeAdicionar(JPanel painelAtivar, JPanel painelDesativar, List<String> listaNomes, List<String> listaNumeros, JList<String> listaContato) {
		this.painelAtivar = painelAtivar;
		this.painelDesativar = painelDesativar;
		this.listaNomes = listaNomes;
        this.listaNumeros = listaNumeros;
        this.listaContato = listaContato;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		painelAtivar.setVisible(true);
		painelAtivar.setEnabled(true);
		painelDesativar.setVisible(false);
		painelDesativar.setEnabled(false);
		
		JButton botaoConfirmar =  new JButton("Add");
		botaoConfirmar.setBounds(300, 40, 59, 29);
				
		JTextField textoNome = new JTextField();
		JTextField textoNumero = new JTextField();
		textoNome.setBounds(0, 40, 150, 30);
		textoNumero.setBounds(150, 40, 150, 30);
		this.textoNome = textoNome;
		this.textoNumero = textoNumero;
		
		JLabel nomeLabel = new JLabel("Nome: ");
		JLabel numeroLabel = new JLabel("Número: ");
		nomeLabel.setBounds(0, 10, 150, 30);
		numeroLabel.setBounds(160, 10, 150, 30);
		
		botaoConfirmar.addActionListener(e1 -> {
			String nome = textoNome.getText();
			String numero = textoNumero.getText();
			
			textoNome.setText("");
			textoNumero.setText("");
			
			listaNomes.add(nome);
			listaNumeros.add(numero);
			listaContato.setListData(listaNomes.toArray(new String[0]));
			painelAtivar.setVisible(false);
            painelAtivar.setEnabled(false);
            
            
		});
		
		painelAtivar.add(botaoConfirmar);
		painelAtivar.add(numeroLabel);
		painelAtivar.add(textoNumero);
		painelAtivar.add(nomeLabel);
		painelAtivar.add(textoNome);
		painelAtivar.revalidate();
		painelAtivar.repaint();
	
	}


}

class BotaoExcluir implements ActionListener{
	
	private JPanel painelAtivar, painelDesativar;
	
	public BotaoExcluir(JPanel painelAtivar, JPanel painelDesativar) {
		this.painelAtivar = painelAtivar;
		this.painelDesativar = painelDesativar;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		painelAtivar.setVisible(true);
		painelAtivar.setEnabled(true);
		painelDesativar.setVisible(false);
		painelDesativar.setEnabled(false);
		
		JButton botaoConfirmar =  new JButton("Deletar");
		botaoConfirmar.setBounds(250, 40, 109, 29);
		
		JTextField textoNome = new JTextField();
		textoNome.setBounds(0, 40, 250, 30);
		
		JLabel nomeLabel = new JLabel("Confirme o nome para excluir: ");
		nomeLabel.setBounds(0, 10, 250, 30);
		
		painelAtivar.add(botaoConfirmar);
		painelAtivar.add(nomeLabel);
		painelAtivar.add(textoNome);
		painelAtivar.revalidate();
		painelAtivar.repaint();
	}
}
