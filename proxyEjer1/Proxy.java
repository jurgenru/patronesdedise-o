package proxyEjer1;

public class Proxy implements IPeticiones {
	private String archivo;
	private Servidor ser;

	public Proxy(String archivo) {
		this.archivo = archivo;
		ser = new Servidor(archivo);
	}

	@Override
	public void descargar() {
		if (archivo.contains(".rar") || archivo.contains(".zip")) {
			this.ser.descargar();
		} else {
			System.out.println("Su archivo no es compatible con rar o zip");
		}
	}

	@Override
	public void cargar() {
		if (archivo.contains(".rar") || archivo.contains(".zip")) {
			this.ser.cargar();
		} else {
			System.out.println("Su archivo no es compatible con rar o zip");
		}
	}

}
