package proxyEjer1;

public class Cliente {

	public static void main(String[] args) {
		IPeticiones p = new Proxy("hola");
		p.descargar();
	}

}
