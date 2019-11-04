package visitorEjer1;

public class ConcreteVeterinario implements IVeterinario {

	@Override
	public String visit(Perro p) {
		p.getEnfermedad1();
		return ("El veterinario esta yendo a revisar al perro");
	}

	@Override
	public String visit(Gato g) {
		g.getEnfermedad2();
		return ("El veterinario esta yendo a revisar al gato");
	}

	@Override
	public String visit(Caballo c) {
		c.getEnfermedad3();
		return ("El veterinario esta yendo a revisar al perro");
	}

}
