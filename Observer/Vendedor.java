package Clase04SubastaObserver;
import java.util.List;

public class Vendedor {

	List<Oferente> oferentes;
	
	public void vender(Subasta subasta) {
		while(subasta.hayGanador() == false) {
			for(Oferente oferente: oferentes) {
				//aca le notificamos a los observadores(los oferentes) que cambio el estado de la subasta
				float oferta=oferente.ofertar(subasta.obtenerPrecioActual());
				subasta.recibirOferta(oferta, oferente );
				
				if(subasta.hayGanador()== true) {
					break;
				}
			}
		}
	}
	
	public void addOFerente(Oferente oferente){
		oferentes.add(oferente);
	}
	
}
