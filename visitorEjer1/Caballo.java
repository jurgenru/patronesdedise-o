package visitorEjer1;

public class Caballo implements IAnimal {
	private String enfermedad3;

	public String getEnfermedad3() {
		return enfermedad3;
	}

	public void setEnfermedad3(String enfermedad3) {
		this.enfermedad3 = enfermedad3;
	}

	@Override
	public String receta(IVeterinario vet) {
		return vet.visit(this);
	}
}
