package Clase03TransferenciasTemplateMethod;

public class CuentaCorriente extends Cuenta {

	float comision=0.10F;
	@Override
	public float calcularComision(float monto) {
		// TODO Auto-generated method stub
		return monto*comision;
	}

}
