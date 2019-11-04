package adapterEjer1;

public class Televisores implements IEmpresa2 {

	@Override
	public void costo() {
		System.out.println("El televisor tiene un precio de 520$");
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("Tiene un garantia de 5 años");
	}

}
