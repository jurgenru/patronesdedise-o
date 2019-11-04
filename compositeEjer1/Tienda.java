package compositeEjer1;

import java.util.ArrayList;

public class Tienda extends Computadora {

	private ArrayList<Computadora> list = new ArrayList<>();

	public Tienda(int precio, int cantidad) {
		super(precio, cantidad);
	}

	@Override
	public void operation() {
		for (Computadora co : list) {
			co.operation();
		}
	}

	@Override
	public void add(Computadora c) {
		list.add(c);
	}

	@Override
	public void remove(Computadora c) {
		list.remove(c);
	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position).getPrecio());
	}

}
