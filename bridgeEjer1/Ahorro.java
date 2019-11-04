package bridgeEjer1;

public class Ahorro implements ICuenta {
	double interes = 0.2;
	private int ahorros;
	double a = ahorros * 6.96;

	@Override
	public void Dolar() {
		System.out.println("Su cuenta es de " + ahorros + "y esta en dolares en bolivianos seria " + a
				+ " y con un interes de 0.2 tiene " + a * interes);
	}

	@Override
	public void Euro() {
		System.out.println("Su cuenta es de " + ahorros + "y esta en euros en bolivianos seria " + a
				+ " y con un interes de 0.2 tiene " + a * interes);
	}

	@Override
	public void Boliviano() {
		System.out.println("Su cuenta es de " + ahorros + "en bolivianos y con un interes de 0.2 tiene " + a * interes);

	}

	public void setAhorros(int ahorros) {
		this.ahorros = ahorros;
	}

}
