package DoubleDispatch;

public enum Resultado {
	GANASTE("Ganaste, felicitaciones!"), 
	EMPATASTE("Empate"), 
	PERDISTE("Perdiste, suerte la próxima!");

	private String mensaje;

	Resultado(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
}
