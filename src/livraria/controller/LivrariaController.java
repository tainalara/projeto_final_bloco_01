package livraria.controller;

import java.util.ArrayList;

import livraria.model.Obras;
import livraria.repository.LivrariaRepository;

public class LivrariaController implements LivrariaRepository {

	private ArrayList<Obras> listaObras = new ArrayList<Obras>();
	int numero = 0;

	@Override
	public void cadastrar(Obras livro) {
		listaObras.add(livro);
		System.out.println("\nO Livro " + livro.getNome() + " foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(int numero, String nome2, String autor, String categoria, int paginas, int tipoComercio, float precoCompra) {
		var obras = buscarNaCollection(numero);

		if (obras != null) {
			
			obras.setNome(nome2);
			obras.setAutor(autor);
			obras.setCategoria(categoria);
			obras.setPaginas(paginas);
			obras.setTipoComercio(tipoComercio);
			obras.setPrecoCompra (precoCompra);
			
			System.out.println("\nO Livro: " + nome2 + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO Livro " + numero + " não foi encontrado!");
	}

	@Override
	public void deletar(int numero) {
		var obras = buscarNaCollection(numero);

		if (obras != null) {
			String nome = obras.getNome();
			System.out.println("\nO Livro: " + nome + " foi deletado com sucesso!");
		} else
			System.out.println("\nO Livro " + numero + " não foi encontrado!");

	}

	@Override
	public void listarTodos() {
		for (var obras : listaObras) {
			obras.visualizar();
		}
	}

	public int gerarNumero() {
		return ++numero;
	}

	public Obras buscarNaCollection(int numero) {
		for (var obras : listaObras) {
			if (obras.getNumero() == numero) {
				return obras;
			}
		}
		return null;
	}

	}

