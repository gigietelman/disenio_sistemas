package Clase04State;

public class Semaforo {

	String color;
	Auto auto;

	public Semaforo(Auto auto) {
		this.auto = auto;
	}

	public void cambiarColor(String color) {
		this.color = color;

		if (color.equalsIgnoreCase("rojo")) {

			auto.cambiarEstado(new EstadoDetener());

		} else if (color.equalsIgnoreCase("verde")) {

			auto.cambiarEstado(new EstadoAvanzar());
		}

	}

}
