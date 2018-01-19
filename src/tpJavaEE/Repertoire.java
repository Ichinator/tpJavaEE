package tpJavaEE;
import java.util.*;

public class Repertoire {
	private String nomRepertoire;
	private List<Contact> contacts;

	public String getNomRepertoire() {
		return nomRepertoire;
	}

	public void setNomRepertoire(String nomRepertoire) {
		this.nomRepertoire = nomRepertoire;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public Repertoire(String nomRepertoire) {
		contacts = new ArrayList<>();
				this.nomRepertoire = nomRepertoire;
	}
	
	public void addContact(Contact contact) {
		contacts.add(contact);
	}
}


