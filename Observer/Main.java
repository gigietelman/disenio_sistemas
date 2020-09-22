package Clase04SubastaObserver;

public class Main {

	public static void main(String[] args) {

		Subasta subasta = new Subasta(10, 1000);
		
		Vendedor vendedor=new Vendedor();
		
		OferenteSuma oferenteSuma=new OferenteSuma("Pedro");
		OferenteProducto oferenteProducto=new OferenteProducto("Juan");
		
		vendedor.addOFerente(oferenteSuma);
		vendedor.addOFerente(oferenteProducto);
		
		vendedor.vender(subasta);
	}

}
