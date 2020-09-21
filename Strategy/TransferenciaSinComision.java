package Clase03TransferenciaStrategy;

public class TransferenciaSinComision implements Transferencia {

	@Override
	public void transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto) {
		
		if(cuentaOrigen.obtenerSaldo()>=monto) {
		cuentaDestino.agregarSaldo(monto);
		cuentaOrigen.descontarSaldo(monto);
		}
		
	}

}
