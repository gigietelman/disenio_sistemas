package Clase03TransferenciasTemplateMethod;

//clase abstracta
public abstract class Cuenta implements Transferible {

	float saldo;

	@Override 
	public void Transferir(float monto, Cuenta cuenta) {

		float comision=calcularComision(monto);

		if(monto+comision<=saldo) {
			saldo=saldo-monto-comision;

			cuenta.agregarSaldo(monto);
		}
	}

	public void agregarSaldo(float monto) {
		saldo = saldo + monto;
	}

	public abstract float calcularComision(float monto);
	// esto cambia dependiendo la implementacion
}
