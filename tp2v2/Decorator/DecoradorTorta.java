package Decorator;
 
public abstract class DecoradorTorta extends Torta {
	
	private Torta torta;

	public DecoradorTorta(Torta torta) {
		this.torta = torta;
	}
	
	public Torta getTorta() {
		return torta;
	}
	
	public void getTorta(Torta torta) {
		this.torta = torta;
	}
	
}
