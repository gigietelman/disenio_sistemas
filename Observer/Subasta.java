package Clase04SubastaObserver;

public class Subasta {

	float precioInicial, precioFinal, precioActual;
	Oferente ganador;

	public Subasta(float precioInicial, float precioFinal) {
		this.precioInicial = precioInicial;
		this.precioFinal = precioFinal;
		this.precioActual = precioInicial;
	}

	public boolean hayGanador() {

		if (ganador == null) {

			return false;

		} else {

			return true;
		}
	}

	public void establecerGanador(Oferente oferente) {
		this.ganador=oferente;
	}

	public float obtenerPrecioActual() {

		return precioActual;
	}

	public void recibirOferta(float oferta, Oferente oferente) {

		if(oferta>=precioActual) {
			precioActual=oferta;
		}

		if(oferta>=precioFinal) {
			this.ganador=oferente;
		}
	}
}
