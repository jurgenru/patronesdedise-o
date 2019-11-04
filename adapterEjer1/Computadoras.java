package adapterEjer1;

public class Computadoras implements IEmpresa {

	@Override
	public void precio() {
		System.out.println("La computadora tiene un precio de 1800$");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("La computadora tiene un tiempo de vida regular de 15 años");
	}

}
