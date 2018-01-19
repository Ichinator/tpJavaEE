package tpJavaEE;

public abstract class Personne {
	private String firstname;

	public Personne(String firstname) {
		super();
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
}
