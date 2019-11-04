package compositeEjer1;

public abstract class Computadora {
	private int precio = 100;
	private int cantidad;

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Computadora(int precio, int cantidad) {
		this.precio = precio;
		this.cantidad = cantidad;
		System.out.println("La computadora tiene precio de " + precio + " y son " + cantidad);
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getPrecio() {
		return this.precio;
	}

	public abstract void operation();

	public abstract void add(Computadora c);

	public abstract void remove(Computadora c);

	public abstract void getChild(int position);

}
