package bridgeEjer1;

public class Credito implements ICuenta{

	@Override
	public void Dolar() {
		System.out.println("Su cuenta de credito esta en dolares");
	}

	@Override
	public void Euro() {
		System.out.println("Su cuenta de credito esta en euros");
	}

	@Override
	public void Boliviano() {
		System.out.println("Su cuenta de credito esta en bolivianos");
	}

}
