package bridgeEjer1;

public class Cliente {
	public static void main(String[] args) {
		
		Ahorro a = new Ahorro();
		a.setAhorros(100);
		ConcreteAbstraction ca = new ConcreteAbstraction(a);
		ca.ahorro();
		ca.credito();
		ca.credito();
	}
}
