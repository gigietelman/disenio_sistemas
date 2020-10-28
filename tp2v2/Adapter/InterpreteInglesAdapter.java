package Adapter;

public class InterpreteInglesAdapter extends Espanol {

	public String interpretarTexto(String texto) {
		if ("Hello".equals(texto)) {
			return super.interpretarTexto("Hola");
		}
		return "No entiendo";
	}
	
}
