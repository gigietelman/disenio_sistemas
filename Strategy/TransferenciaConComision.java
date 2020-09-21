package Clase03TransferenciaStrategy;

public class TransferenciaConComision implements Transferencia {

	public float comision;

	public TransferenciaConComision(float comision) {
		this.comision = comision;
	}

	@Override
	public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto) {

		float montoComision = monto * comision;

		if (cuentaOrigen.obtenerSaldo() >= monto + montoComision) {
			cuentaDestino.agregarSaldo(monto);
			cuentaOrigen.descontarSaldo(monto + montoComision);
		}
	}
}
