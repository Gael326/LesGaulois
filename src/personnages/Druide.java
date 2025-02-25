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
		System.out.println(prendreParole()+"/"+texte+"/");
	}
	
	private String prendreParole() {
		return "Le druide "+nom+" : ";
	}
	

	public void fabriquerPotion(int quantite, int forcePotion) {
		Chaudron.remplirChaudron(quantite, forcePotion);
		
	}
	
	public void booster(Gaulois gaulois) {
		
	}
}
