package decoratorEjer1;

public class DecoratorbancoBasica extends Decorator {

	public DecoratorbancoBasica(Cuenta c) {
		super(c);
	}

	@Override
	public void bancaPorInternet(boolean enable) {
		System.out.println("A�adiendo decorador en la banca por internet ");
		
	}

	@Override
	public void seguroDeLaCuenta(int x) {
		System.out.println("A�adiendo decorador en el seguro de la cuenta");
	}

	@Override
	public void promocion() {
		System.out.println("A�adiendo decorador en la promocion");
	}

}
