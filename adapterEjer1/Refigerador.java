package adapterEjer1;

public class Refigerador implements IEmpresa2 {

	@Override
	public void costo() {
		System.out.println("El refrigerador tiene un precio de 600$");
	}

	@Override
	public void tiempoDeGarantia() {
		System.out.println("Tiene un garantia de 3 años");
	}

}
