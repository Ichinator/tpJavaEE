package tpJavaEE;

import java.util.*;

public class Famille {
	private List<Personne> membres = new ArrayList<>();
	private String name;

	
	public Famille(String name) {
		this.name = name;
	}

	public List<Personne> getMembres() {
		return membres;
	}
	
	public void setMembres(List<Personne> membres) {
		this.membres = membres;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMembres (Personne p) {
		membres.add(p);
	}
	
}
