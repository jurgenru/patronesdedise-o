package decoratorEjer1;

public class bancoBasica implements Cuenta {
	private int monto;
	private String nombre;

	public bancoBasica(int monto, String nombre) {
		this.monto = monto;
		this.setNombre(nombre);
	}

	@Override
	public void bancaPorInternet(boolean enable) {
		enable = false;
		if (enable == true) {
			System.out.println("La cuenta esta activada para pagar por internet");
		} else {
			System.out.println("La cuenta no esta activada todavia");
		}

	}

	@Override
	public void seguroDeLaCuenta(int x) {
		int montoS = monto;
		int a = montoS - 10;
		System.out.println("El seguro de la cuenta tiene un valor de 10 Bs en su cuenta tiene " + monto
				+ " con el valor del seguro tendria " + a
				);
	}

	@Override
	public void promocion() {
		int a1 = (int) (Math.random() * monto);
		System.out
				.println("Usted acaba de ganar la promocion antes en su cuenta tenia " + monto + " ahora tiene " + a1);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
