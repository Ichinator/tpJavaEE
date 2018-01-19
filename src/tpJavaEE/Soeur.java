package tpJavaEE;

public class Soeur extends Enfant{

	public Soeur(String firstname) {
		super(firstname);
	}

	@Override
	public String toString() {
		return "La soeur s'appelle " + getFirstname();
	}
}
