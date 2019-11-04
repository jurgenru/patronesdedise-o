package decoratorEjer1;

public class Cliente {
	public static void main(String[] args) {
		Cuenta c = new bancoBasica(100, "Jurgen");
		bancoBasica b = new bancoBasica(200, "Nicolas");
		c = new DecoratorbancoBasica(c);
		c.bancaPorInternet(false);
		c.seguroDeLaCuenta(10);
		c.promocion();
		b.bancaPorInternet(true);
		b.promocion();
		b.seguroDeLaCuenta(10);
	}
}
