
package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		BebidasFactory mainFactory = new BebidasFactory();
		BebidaColaAbs bebidaCola = null;
		BebidaDeLimonAbs bebidaLimon = null;
		AbstractFactory factory = null;
		
		factory = mainFactory.crearCocaColaFactory();
		bebidaCola = factory.crearBebidaCola();
		bebidaCola.preparar();
		
		bebidaLimon =  factory.crearBebidaLimon();
		bebidaLimon.preparar();
		
		factory = mainFactory.creaPepsiColaFactory();
		bebidaCola = factory.crearBebidaCola();
		bebidaCola.preparar();
		
		bebidaLimon =  factory.crearBebidaLimon();
		bebidaLimon.preparar();
		
		
	}
	
}
