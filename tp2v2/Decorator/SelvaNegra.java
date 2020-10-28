package Decorator;

public class SelvaNegra extends DecoradorTorta {

private int gramosChocolate;
	
	public SelvaNegra(Torta torta, int gramosChocolate) {
		super(torta);
		this.gramosChocolate = gramosChocolate;
	}
	
	public void agregarChocolate(int gramos) {
		gramosChocolate += gramos;
	}
	
	public int getGramosChocolate() {
		return gramosChocolate;
	}
	
	@Override
	public String toString() {
		return String.format("Selva Negra de %d capas y %d gramos de chocolate", getTorta().getNumeroCapas(), gramosChocolate); 
	}
}
