package personnages;

public class Druide {
	String nom;
	int force;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
	
	public void parler(String texte) {
		
	}
	
	private String prendreParole() {
		return "blabla";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		
	}
	
	public void booster(Gaulois gaulois) {
		
	}
}
