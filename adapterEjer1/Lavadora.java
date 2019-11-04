package adapterEjer1;

public class Lavadora implements IEmpresa2 {

	@Override
	public void costo() {
		System.out.println("La lavadora tiene un precio de 460$");
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("Tiene un garantia de 2 años");
	}

}
