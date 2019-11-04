package proxyEjer1;

public class Servidor implements IPeticiones {
	String archivo;
	
	public Servidor(String archivo) {
		this.archivo = archivo;
	}

	@Override
	public void descargar() {
		System.out.println("El archivo se esta descargando");
	}

	@Override
	public void cargar() {
		System.out.println("El archivo se esta cargando");
	}

}
