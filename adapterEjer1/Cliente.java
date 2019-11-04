package adapterEjer1;

public class Cliente {

	public static void main(String[] args) {
		Televisores te = new Televisores();
		Refigerador r = new Refigerador();
		Lavadora l = new Lavadora();
		// Celulares c = new Celulares();
		// Tablet t = new Tablet();
		// Computadoras co = new Computadoras();

		ConcreteEmpresa ce = new ConcreteEmpresa(te);
		ConcreteEmpresa ce1 = new ConcreteEmpresa(r);
		ConcreteEmpresa ce2 = new ConcreteEmpresa(l);

		ce.precio();
		ce1.tiempoDeVida();
		ce2.precio();

	}

}
