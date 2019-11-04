package compositeEjer1;

public class Contenedores extends Computadora {

	public Contenedores(int precio, int cantidad) {
		super(precio, cantidad);
	}

	@Override
	public void operation() {
		if (this.getCantidad()>50) {
			System.out.println("\t Laboratorio: " + this.getPrecio());
		}
	}

	@Override
	public void add(Computadora c) {
		System.out.println("No aplicable en laboratorio");
	}

	@Override
	public void remove(Computadora c) {
		System.out.println("No aplicable en laboratorio");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Laboratorio: " + this.getPrecio());
	}

}
