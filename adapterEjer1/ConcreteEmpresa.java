package adapterEjer1;

public class ConcreteEmpresa implements IEmpresa {
	private IEmpresa2 emp2;

	public ConcreteEmpresa(IEmpresa2 emp2) {
		this.emp2 = emp2;
	}

	@Override
	public void precio() {
		emp2.costo();
	}

	@Override
	public void tiempoDeVida() {
		emp2.tiempoDeGarantia();
	}

}
