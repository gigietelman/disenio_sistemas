package Clase04State;

public class Auto {

	private Estado estado = new EstadoAvanzar();
	
	public void cambiarEstado (Estado estado) {
		this.estado=estado;
	}
	
	public void Avanzar() {
		estado.Avanzar();
	}
	
}
