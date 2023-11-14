package main;


import java.util.Scanner;

import control.ClienteController;
import control.VeiculoController;

public class Principal {
    public static void main(String[] args) {

		ClienteController clienteController = new ClienteController();
		VeiculoController veiculoController = new VeiculoController();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;       //-1 pois o 0 é para sair do sistema
		int idCliente = 0;
		int idVeiculo = 0;
		while (opcao != 0) {
			System.out.println("\n __________________________ ");
			System.out.println("|                          |");
			System.out.println("|      Menu de opções      |");
			System.out.println("|__________________________|");
			System.out.println("|                          |");
			System.out.println("|  1. Adicionar cliente    |");
			System.out.println("|  2. Adicionar veículo    |");
			System.out.println("|  3. Listar clientes      |");
			System.out.println("|  4. Listar veículos      |");
			System.out.println("|  5. Remover cliente      |");
			System.out.println("|  6. Remover veículo      |");
			System.out.println("|  0. Sair                 |");
			System.out.println("|__________________________|");
			System.out.println("");
			System.out.print("Escolha uma opção: ");
			/*
			 *  Estrutura try-catch
			 *  No bloco try, colocamos o trecho de código que pode lançar uma exceção,
			 *  em outras palavras, colocomos o trecho do código que pode dar algum problema (bug).
			 *  Exemplo: ler um número inteiro "scanner.nextInt()", porém o usuário digita uma letra.
			 *  Nesse momento, o sistema tentará converter uma letra (string) em número inteiro. 
			 */
			try {
				opcao = scanner.nextInt();
				switch (opcao) {
				case 1:
					idCliente++;
					System.out.println("");
					System.out.print("Digite o nome do cliente " +idCliente+ ": ");
					scanner.nextLine();
					String nome = scanner.nextLine();
					System.out.print("Digite o CPF do cliente " +nome+ ": ");
					String cpf = scanner.nextLine();
					System.out.print("Digite o telefone do cliente " +nome+ ": ");
					String telefone = scanner.nextLine();
					System.out.print("Digite o endereço do cliente " +nome+ ": ");
					String endereco = scanner.nextLine();
					System.out.print("Digite o email do cliente " +nome+ ": ");
					String email = scanner.nextLine();
					clienteController.adicionarCliente(idCliente, nome, cpf, telefone, endereco, email);
					System.out.print("Cliente adicionado!");
					System.out.print("\n");
					break;

				case 2:
					try {
						idVeiculo++;
						System.out.println("");
						System.out.print("Digite o fabricante do veículo " +idVeiculo+ ": ");
						scanner.nextLine();
						String fabricante = scanner.nextLine();
						System.out.print("Digite o modelo do veículo da " +fabricante+ ": ");
						String modelo = scanner.nextLine();
						System.out.print("Digite a placa do veículo " +fabricante+ " " +modelo+ ": ");
						String placa = scanner.nextLine();
						System.out.print("Digite a cor do veículo " +fabricante+ " " +modelo+ ": ");
						String cor = scanner.nextLine();
						System.out.print("Digite o ano do veículo " +fabricante+ " " +modelo+ ": ");
						int ano = scanner.nextInt();
						veiculoController.adicionarVeiculo(idVeiculo, placa, fabricante, modelo, cor, ano);
						System.out.print("Veículo adicionado!");
						System.out.print("\n");
					}
					catch (java.util.InputMismatchException e) {
						idVeiculo--;
						System.out.println("");
						System.out.println("Ano digitado incorretamente.");
		                scanner.nextLine(); // Limpa o buffer do scanner
					}
					break;

				case 3:
					clienteController.exibirListaClientes(null);
					break;

				case 4:
					veiculoController.exibirListaVeiculos(null);
					break;
					
				case 5:
					System.out.println("");
					System.out.println("Digite o CPF do Cliente a ser removido: ");
					scanner.nextLine();
					String cpfClienteRemover = scanner.nextLine();
					System.out.println("O Cliente contendo o CPF " +cpfClienteRemover+ "será removido");
					clienteController.removerCliente(cpfClienteRemover);
					break;
					
				case 6:
					System.out.println("");
					System.out.println("Digite a PLACA do Veiculo a ser removido: ");
					scanner.nextLine();
					String placaVeiculoRemover = scanner.nextLine();
					System.out.println("O Veículo contendo a PLACA " +placaVeiculoRemover+ "será removido");
					veiculoController.removerVeiculo(placaVeiculoRemover);
					break;
	
				case 0:
					System.out.println("");
					System.out.println("Saindo...");
					System.out.println("Sistema finalizado");
					break;
	
				default:
					System.out.println("");
					System.out.println("Opção inválida.");
					break;
				}
			} 
			/*
			 * Estrutura try-catch
			 * No bloco catch colocamos o tratamento da exceção.
			 * Em outras palavras, quando algum erro (exceção) acontecer dentro do bloco try,
			 * o sistema automaticamente para a execução normal, e executa o bloco catch.
			 * Exemplo: na conversão de uma string em número inteiro, o sistema já executa o catch
			 * e escreve no console "Opção inválida..."
			 */
			catch (java.util.InputMismatchException e) {
				System.out.println("");
				System.out.println("Opção inválida. Por favor, digite um número inteiro válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
			}
		}	
	scanner.close();
	}
}
