package livraria;

import java.util.Scanner;

import livraria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************************");
			System.out.println("                                                         ");
			System.out.println("                 LIVRARIA MACHADO DE ASSIS               ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("             1 - Cadastrar Novo Livro                    ");
			System.out.println("             2 - Listar Todos Os Livros do Estoque       ");
			System.out.println("             3 - Atualizar Dados do Livro                ");
			System.out.println("             4 - Apagar Livro do Estoque                 ");
			System.out.println("             9 - Sair                                    ");
			System.out.println("                                                         ");
			System.out.println("*********************************************************");
			System.out.println("                                                         ");
			System.out.println("Entre Com A Opção Desejada:                              ");
			System.out.println("                                                         " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println(
						Cores.TEXT_WHITE_BOLD + "\nLivraria Machado de Assis agradece seu interesse pela leitura!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar Novo Livro \n\n");
				break;

			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar Todos Os Livros \n\n");
				break;

			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar Dados do Livro \n\n");
				break;

			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar Livro do Estoque\n\n");
				break;

			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nEssa opção não existe // Escolha um número válido! \n" + Cores.TEXT_RESET);
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("\nProjeto Desenvolvido por: Tainá Lara");
		System.out.println("Contato: tainalara.dev@gmail.com");
		System.out.println("https://github.com/tainalara");
		System.out.println("\n*********************************************************");
	}

}
