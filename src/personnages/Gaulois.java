package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];

	public Gaulois(String nom, int force) {
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
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	
//	}
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	@Override
	public String toString() {
		return nom;
	}

//	public void frapper(Romain romain){
//		System.out.println(nom + "envoie un grand coup dans la machoire de " + 
//		romain.getNom());
//		romain.recevoirCoup((force*effetPotion) / 3);
//		effetPotion = 1;
//	}

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix",8);
		System.out.println(Asterix);
		
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
			nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}

		
	}

}
