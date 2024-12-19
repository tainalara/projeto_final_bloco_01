package livraria.model;

public class Livro  extends Obras {
	
	//Atributo
	private float precoCompra;
	
	// Método Construtor	
	public Livro (int numero, String nome, String autor, String categoria, int paginas, int tipoComercio, float precoCompra) {
		
		super(numero, nome, autor, categoria, paginas, tipoComercio);
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
		System.out.println("Este Livro custa (R$): " + this.precoCompra + " para compra");
	}
	
	

}
