package Adapter;

public class Espanol {

	public String interpretarTexto(String texto) {
		if (texto.equals("Hola")) {
			return "Cómo estas?";
		}
		return "No entiendo";
	}
}
