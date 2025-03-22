package application;
	
//import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {//extends Application {
	
/*public void start(Stage primaryStage) throws IOException {
		
		Pane root = FXMLLoader.load(getClass().getResource("FXMLTela.fxml"));
		
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
*/
	
	public static void main(String[] args) {
		
		ArrayList<Contato> listaContatos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int comando = 0;
		
		System.out.println("|======================================|\n|========== Lista Telefonica ==========|\n|Digite 1: Para adicionar um contato   |\n|Digite 2: Para excluir um contato     |\n|Digite 3: Para ver a lista de contatos|\n|======================================|");

		while(comando != 4) {
			System.out.print("Digite o comando: ");
			comando = scanner.nextInt();
			scanner.nextLine();
			
			switch(comando) {
				
				case 1: Contato novoContato = new Contato();
					
						System.out.print("Digite o nome do contato: ");
						novoContato.setNome(scanner.nextLine());
						
						System.out.println("Digite o sobrenome do contato: ");
						novoContato.setSobrenome(scanner.nextLine());
						
						System.out.println("Digite o número de telefone do contato: ");
						novoContato.setNumeroTelefone(scanner.nextLine());
						
						listaContatos.add(novoContato);
				break;
				
				case 2: String nome, sobrenome;
						
						System.out.print("Digite o nome do contato que deseja excluir: ");
						nome = scanner.nextLine();
						
						System.out.print("Agora digite o sobrenome do contato: ");
						sobrenome = scanner.nextLine();
						
						for(int i = 0; i < listaContatos.size(); i ++) {
							Contato contato = listaContatos.get(i);
							
							if(nome.equals(contato.getNome()) && sobrenome.equals(contato.getSobrenome())) {
								listaContatos.remove(contato);
								System.out.println("Contato removido com sucesso!");
							}else {
								System.out.println(nome + " " + sobrenome + " não encontrado na sua lista!");
							}
						}
				break;
						
				case 3: if(listaContatos.isEmpty()) {
						System.out.println("Não existem contatos na sua lista, adicione para poder usar esta opção!");
						}else {
							for(Contato contato : listaContatos) {
								System.out.println("-----------------------\nNome: " + contato.getNome() + "\nSobrenome: " + contato.getSobrenome() + "\nNúmero: " + contato.getNumeroTelefone());
							} 
						}

				break;
				
				default: System.out.print("Comando inválido, digite novamente: ");
						comando = scanner.nextInt();
						scanner.nextLine();
				break;
						
			}
			
			
		}
		
		scanner.close();
	}
}
