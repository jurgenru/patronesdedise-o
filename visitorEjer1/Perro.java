package visitorEjer1;

public class Perro implements IAnimal {
	private String enfermedad1;

	public String getEnfermedad1() {
		return enfermedad1;
	}

	public void setEnfermedad1(String enfermedad1) {
		this.enfermedad1 = enfermedad1;
	}

	@Override
	public String receta(IVeterinario vet) {
		return vet.visit(this);
	}

}
