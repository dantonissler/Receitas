package launcher;

import java.util.Scanner;

import service.ReceitaService;

public class Main {

	public static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		ReceitaService receita = new ReceitaService();
		int opcao;
		do {
			opcao = mostrarMenu();
			switch (opcao) {
			case 1:
				receita.cadastrarReceita();
				break;
			case 2:
				receita.alterarTempoPreparoReceita();
				break;
			case 3:
				receita.mostrarValorFinalReceita();
				break;
			default:
				System.out.println("Opção invalida. Digite novamente");
			}
		} while (opcao != 7);

	}

	public static int mostrarMenu() {
		int opcao;
		System.out.println("\n1- Cadastrar receita");
		System.out.println("\n2- Alterar o tempo de preparo de uma receita");
		System.out.println("\n3- Mostrar valor final de cada receita");
		opcao = e.nextInt();
		return opcao;
	}
}
