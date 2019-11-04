package compositeEjer1;

public class Cliente {

	public static void main(String[] args) {
		Tienda t = new Tienda(100, 2);
		t.add(new Laboratorio(100, 2));
		t.operation();
	}

}
