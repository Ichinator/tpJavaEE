package tpJavaEE;

public class Frere extends Enfant{

	public Frere(String firstname) {
		super(firstname);
	}

	@Override
	public String toString() {
		return "Le frère s'appelle " + getFirstname();
	}
}
