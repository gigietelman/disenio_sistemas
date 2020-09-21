package Clase03TransferenciaStrategy;

//clase abstracta
public class Cuenta{

	float saldo;

	public float obtenerSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public void agregarSaldo(float monto) {
		saldo=saldo+monto;		
	}

	public void descontarSaldo(float monto) {
		saldo=saldo-monto;
		
	}
	
	

}
