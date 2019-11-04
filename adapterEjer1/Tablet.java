package adapterEjer1;

public class Tablet implements IEmpresa {

	@Override
	public void precio() {
		System.out.println("La tablet tiene un precio de 250$");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("La tablet tiene un tiempo de vida regular de 8 años");
	}

}
