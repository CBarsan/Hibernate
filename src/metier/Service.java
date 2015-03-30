package metier;

public class Service {
	
	private int id;
	private String libelle;
	private String interlocuteur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getInterlocuteur() {
		return interlocuteur;
	}
	public void setInterlocuteur(String interlocuteur) {
		this.interlocuteur = interlocuteur;
	}
	public Service(int id, String libelle, String interlocuteur) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.interlocuteur = interlocuteur;
	}
	
	

}
