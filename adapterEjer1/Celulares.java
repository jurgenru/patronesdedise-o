package adapterEjer1;

public class Celulares implements IEmpresa {

	@Override
	public void precio() {
		System.out.println("El celular tiene un precio de 500$");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("El celular tiene un tiempo de vida regular de 10 años");
	}

}
