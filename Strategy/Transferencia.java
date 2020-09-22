package Clase03TransferenciaStrategy;

public interface Transferencia {

//define los metodos que deben implementar las clases concretas	
	public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto);
}
