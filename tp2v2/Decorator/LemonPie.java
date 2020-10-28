package Decorator;

public class LemonPie extends DecoradorTorta {

	private int gramosMerengue;
	
	public LemonPie(Torta torta, int gramosMerengue) {
		super(torta);
		this.gramosMerengue = gramosMerengue;
	}
	
	public void agregarMerengue(int gramos) {
		gramosMerengue += gramos;
	}
	
	public int getGramosMerengue() {
		return gramosMerengue;
	}
	
	@Override
	public String toString() {
		return String.format("Lemon Pie de %d capas y %d gramos de merengue", getTorta().getNumeroCapas(), gramosMerengue); 
	}

}
