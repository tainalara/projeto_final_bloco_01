package livraria.model;

public class LivrosCompra  extends Livros {
	
	//Atributo
	private float precoCompra;
	
	// Método Construtor	
	public LivrosCompra (String nome, String autor, String categoria, int paginas, int tipoComercio, float precoCompra) {
		
		super(nome, autor, categoria, paginas, tipoComercio);
		this.precoCompra = precoCompra;
		
	}

	//Métodos de Acesso

	public float getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println("Este Livro custa (R$): " + this.precoCompra + "para compra");
	}
	
	

}
