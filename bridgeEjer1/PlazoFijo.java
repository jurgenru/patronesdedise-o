package bridgeEjer1;

public class PlazoFijo implements ICuenta {
	double interes = 0.5;
	private int ahorros;
	double a = ahorros * 6.96;
	double a1 = ahorros * 7.01;

	@Override
	public void Dolar() {
		System.out.println("Su cuenta es de " + ahorros + "y esta en dolares en bolivianos seria " + a
				+ " y con un interes de 0.2 tiene " + a * interes);
	}

	@Override
	public void Euro() {
		System.out.println("Su cuenta es de " + ahorros + "y esta en euros en bolivianos seria " + a1
				+ " y con un interes de 0.2 tiene " + a1 * interes);
	}

	@Override
	public void Boliviano() {
		System.out.println("Su cuenta es de " + ahorros + "en bolivianos y con un interes de 5% tiene " + a * interes);

	}

	public void setAhorros(int ahorros) {
		this.ahorros = ahorros;
	}

}
