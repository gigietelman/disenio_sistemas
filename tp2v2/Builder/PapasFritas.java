package Builder;

public class PapasFritas implements Item {

	@Override
	public String name() {
		return "Papas Fritas";
	}

	@Override
	public Empaquetado packing() {
		return new Caja();
	}

	@Override
	public float price() {
		return 1.5f;
	}

}
