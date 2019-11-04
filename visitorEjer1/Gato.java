package visitorEjer1;

public class Gato implements IAnimal {
	private String enfermedad2;

	public String getEnfermedad2() {
		return enfermedad2;
	}

	public void setEnfermedad2(String enfermedad2) {
		this.enfermedad2 = enfermedad2;
	}

	@Override
	public String receta(IVeterinario vet) {
		return vet.visit(this);
	}

}
