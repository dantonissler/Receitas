package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Ingrediente;
import model.Receita;

public class ReceitaService {

	Scanner ent = new Scanner(System.in);
	public ArrayList<Receita> receitas = new ArrayList<Receita>();

	public void cadastrarReceita() {
		Receita novaReceita = new Receita();
//		SimpleDateFormat gemid = new SimpleDateFormat("MMddHHmmss");
//		int id = Integer.parseInt(gemid.format(new Date()));

		novaReceita.setCodigo(receitas.size() + 1);

		System.out.println("Qual o nome da receita? ");
		novaReceita.setNome(ent.next());

		int loop1 = 0;
		do {
			if (loop1 > 0)
				System.out.println("Tipo não encontrado.");
			System.out.println("Qual o tipo da receita? digite D para doce ou S para salgada!");
			novaReceita.setTipo("N".charAt(0));
			String tipo = ent.next().toUpperCase();
			if (tipo.length() > 1)
				continue;
			novaReceita.setTipo(tipo.charAt(0));
		} while (!(novaReceita.getTipo().equals('S') || novaReceita.getTipo().equals('D')));

		System.out.println("Tempo de preparo? ");
		novaReceita.setTempoPreparo(ent.nextDouble());

		System.out.println("Qual o modo de fazer? ");
		novaReceita.setModoDeFazer(ent.next());

		System.out.println("Qual o valor basico? ");
		novaReceita.setValorBasico(ent.nextDouble());

		int loop2 = 0;
		int array = 0;
		do {
			if (loop2 > 0)
				System.out.println("Digite um quantidade! ");
			System.out.println("Qual a quantidade de ingredientes para a receita? ");
			array = ent.nextInt();
		} while (!(array > 0));

		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

		for (int i = 0; i < array; i++) {
			Ingrediente novoIngrediente = new Ingrediente();

			if (i == 0)
				System.out.println("Iniciando o cadastro de ingredientes!");

			System.out.println("Qual o nome do " + (i + 1) + "º ingrediente? ");
			novoIngrediente.setNome(ent.next());

			int loop3 = 0;
			do {
				if (loop3 > 0)
					System.out.println("unidade de medida não encontrado.");
				System.out.println("Qual a unidade de medida? Aceita apenas quilograma ou litro");
				String unimed = ent.next().toLowerCase();
				novoIngrediente.setUnidadeMedida(unimed);
			} while (!("quilograma".equals(novoIngrediente.getUnidadeMedida()) || "litro".equals(novoIngrediente.getUnidadeMedida())));

			System.out.println("Qual a quantidade? ");
			novoIngrediente.setQuantidade(ent.nextDouble());

			ingredientes.add(novoIngrediente);
		}
		novaReceita.setIngredientes(ingredientes);
		receitas.add(novaReceita);
		System.out.println(receitas.toString());
	}

	public void alterarTempoPreparoReceita() {
		System.out.println("Qual o código da receita? ");
		int codigo = ent.nextInt() - 1;

		Receita receita = receitas.get(codigo);
		System.out.println("Qual o novo tempo de preparo da receita? ");
		receita.setTempoPreparo(ent.nextDouble());

		receitas.remove(codigo);
		receitas.add(codigo, receita);
		System.out.println("Tempo de preparo alterado com sucesso!");

	}

	public void mostrarValorFinalReceita() {
		System.out.println("Qual o código da receita? ");
		int codigo = ent.nextInt() - 1;
		Receita receita = receitas.get(codigo);
		int qtd = 0;
		for (Ingrediente ing : receita.getIngredientes()) {
			qtd += ing.getQuantidade();
		}

		double vlFim = ((qtd * 0.02)+1) * receita.getValorBasico();
		System.out.println("Nome: " + receita.getNome() + " Quantidade de ingredientes: " + qtd + " Valor Final: " + vlFim + "R$");
	}
}
