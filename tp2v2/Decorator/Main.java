package Decorator;

public class Main {

	public static void main(String[] args) {
		Torta torta1 = new Torta();
		LemonPie lemonPie = new LemonPie(torta1, 120);
		lemonPie.getTorta().setNumeroCapas(1);
		lemonPie.agregarMerengue(30);
		System.out.println(lemonPie);
		
		Torta torta2 = new Torta();
		SelvaNegra selvaNegra = new SelvaNegra(torta2, 250);
		selvaNegra.getTorta().setNumeroCapas(3);
		selvaNegra.agregarChocolate(10);
		System.out.println(selvaNegra);
	}
}
