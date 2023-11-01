package controle;

import modelo.Cliente;
import modelo.Veiculo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	Scanner ent = new Scanner(System.in);
        Cliente cliente1 = new Cliente("12345678901", "João Silva", "Rua A, 123", "123-456-7890", "joao@email.com");
        Veiculo veiculo1 = new Veiculo("ABC123", "Carro A", "Fabricante A", "Vermelho", 2020);

        System.out.println("Informações do Cliente 1:");
        System.out.println("");
        System.out.println("CPF: " + cliente1.getCPF());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("");
        System.out.println("");
        System.out.println("Informações do Veículo 1:");
        System.out.println("");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Fabricante: " + veiculo1.getFabricante());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("");
        System.out.println("");
        System.out.println("Insira as informações do Cliente 2:");
        System.out.println("Nome: ");
        String nome = ent.nextLine();
        System.out.println("CPF: ");
        String cpf = ent.nextLine(); 
        System.out.println("Telefone: ");
        String telefone = ent.nextLine();
        System.out.println("Email: ");
        String email = ent.nextLine();
        System.out.println("Endereço: ");
        String endereco = ent.nextLine();
        System.out.println("Insira as informações do Veiculo 2:");
        System.out.println("Fabricante: ");
        String fabricante = ent.nextLine();
        System.out.println("Modelo: ");
        String modelo = ent.nextLine(); 
        System.out.println("Cor: ");
        String cor = ent.nextLine();
        System.out.println("Ano: ");
        int ano = ent.nextInt();
        System.out.println("Placa: ");
        String placa = ent.nextLine();
        
        Cliente cliente2 = new Cliente(nome, cpf, endereco, telefone, email);
        Veiculo veiculo2 = new Veiculo(placa, modelo, fabricante, cor, ano); 

   
        System.out.println("Informações do Cliente 2:");
        System.out.println(cliente2.getCliente());      
        System.out.println("Informações do Veiculo 2:");
        System.out.println(veiculo2.getVeiculo());
        ent.close();
    }
}