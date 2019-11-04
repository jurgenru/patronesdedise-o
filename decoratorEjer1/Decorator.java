package decoratorEjer1;

public abstract class Decorator implements Cuenta {
	private Cuenta c;

	public Decorator(Cuenta c) {
		this.c = c;
	}
	
	public void operation(){
		c.bancaPorInternet(true);
		c.promocion();
		c.seguroDeLaCuenta(10);
	}
}
