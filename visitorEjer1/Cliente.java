package visitorEjer1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Perro p = new Perro();
		Gato g = new Gato();
		Caballo c = new Caballo();

		ConcreteVeterinario cv = new ConcreteVeterinario();

		System.out.println(p.receta(cv) + "\n El veterinario le dio su receta a las " + hourFormat.format(date)
				+ " a la fecha de " + dateFormat.format(date));
		System.out.println(g.receta(cv) + "\n El veterinario le dio su receta a las " + hourFormat.format(date)
				+ " a la fecha de " + dateFormat.format(date));
		System.out.println(c.receta(cv) + "\n El veterinario le dio su receta a las " + hourFormat.format(date)
				+ " a la fecha de " + dateFormat.format(date));

	}

}
