package bridgeEjer1;

public class ConcreteAbstraction implements IAbstraction{
	private ICuenta cuenta;
	
	public ConcreteAbstraction(ICuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public void ahorro() {
		System.out.println("Su cuenta esta en dolares");
		this.cuenta.Dolar();
	}

	@Override
	public void plazofijo() {
		System.out.println("Su cuenta esta en euros");
		this.cuenta.Euro();
	}

	@Override
	public void credito() {
		System.out.println("Su cuenta esta en bolivianos");
		this.cuenta.Boliviano();
	}

}
