package tpJavaEE;

public class Main {

	public static void main(String[] args) {
		Personne p = new Pere("Pascal");
		p = new Mere("Caroline");
		
		System.out.println(p);
		
	}
}