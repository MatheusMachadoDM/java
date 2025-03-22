package aula001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {
		JFrame janela = new JFrame(); //Criando o objeto janela

		// --- Label ---
		JLabel labelUsuario = new JLabel("Usuário: "); //Criando objeto de texto
		labelUsuario.setBounds(50, 75, 100, 30);
		
		JLabel labelSenha = new JLabel("Senha: "); //Criando objeto de texto
		labelSenha.setBounds(50, 135, 100, 30);
		
		// --- Text Field ---
		JTextField campoUsuario = new JTextField();
		campoUsuario.setBounds(50, 105, 190, 30);
				
		// --- Password Field
		JPasswordField campoSenha = new JPasswordField();
		campoSenha.setBounds(50, 165, 190, 30);
				
		// --- Botao ---
		JButton botaoLogar = new JButton("Logar"); //Criando o objeto botão
		botaoLogar.setBounds(50, 225, 190, 30);//Definindo posição inicial, comprimento e largura
		
			//Adicionando evento
		botaoLogar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String usuario = campoUsuario.getText();
				String senha = new String(campoSenha.getPassword());
				
				System.out.println("Você está fazendo o login com: \n" + usuario + "\n" + senha);
				campoUsuario.setText("");
				campoSenha.setText("");
				
			}	
		});
		
		
		
		// --- Janela ---
		janela.add(labelSenha);
		janela.add(campoSenha);
		janela.add(campoUsuario);
		janela.add(labelUsuario);
		janela.add(botaoLogar);//Adicionando botão na janela
		janela.setLayout(null); //Remove o gerenciador de layout para podermos arrumar a posição do botão manualmente
		
			//Definindo tamanho e visibilidade da janela
		janela.setBounds(0, 0, 300, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Fazendo a aplicação fechar ao clicar no X
		janela.setVisible(true);
	}
}
