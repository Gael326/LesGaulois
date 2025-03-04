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
	

	public void fabriquerPotion(Chaudron chaudron ,int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté "+quantite+" doses de potion magique. Elle a une force de "+forcePotion+"." );
		
	}
	
	public void booster(Gaulois gaulois, Chaudron chaudron){
		if(chaudron.contientPotion()) {
			if (gaulois.getNom()=="Obelix") {
				parler("Non "+gaulois.getNom()+" Non!... et tu le sais très bien !");
			}else {
				chaudron.prendreLouche();
				gaulois.boirePotion(chaudron.getForcePotion());
				parler("Tiens "+gaulois.getNom()+" un peu de potion magique.");
			}
	}else {
		parler("Désolé"+gaulois.getNom()+"il n'y a plus une seule goutte de potion");
	}
	
	
	}
	}
