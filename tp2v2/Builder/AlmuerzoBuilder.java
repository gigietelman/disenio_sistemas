package Builder;

//STEP 6
//Creamos la clase AlmuerzoBuilder, es la clase responsable de crear objetos de tipo Almuerzo
public class AlmuerzoBuilder {
	
	private Almuerzo almuerzo;
	
	public AlmuerzoBuilder() {
		almuerzo = new Almuerzo();
	}
	
	public AlmuerzoBuilder addHamburguesa(Hamburguesa hamburguesa) {
		almuerzo.addItem(hamburguesa);
		almuerzo.addItem(new PapasFritas());
		return this;
	}
	
	public AlmuerzoBuilder addBebidaFria(BebidaFria bebidaFria) {
		almuerzo.addItem(bebidaFria);
		return this;
	}
	
	public Almuerzo build() {
		return almuerzo;
	}
    
}
