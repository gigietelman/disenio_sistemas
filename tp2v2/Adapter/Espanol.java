package Adapter;

public class Espanol {

	public String interpretarTexto(String texto) {
		if (texto.equals("Hola")) {
			return "C�mo estas?";
		}
		return "No entiendo";
	}
}
