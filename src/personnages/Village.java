package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois villageois[];
	private int nbvillageoismax;
	
	
	
	public Village(String nom,
		int nbvillageoismax) {
		this.nom = nom;
		this.nbvillageoismax = nbvillageoismax;
		this.villageois = new Gaulois[nbvillageoismax];
		
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	public void setChef(Gaulois chef) {
		this.chef = chef;
	}
	
	public Gaulois[] getVillageois() {
		return villageois;
	}
	public void setVillageois(Gaulois[] villageois) {
		this.villageois = villageois;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}
	
	public  void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	public Gaulois trouverVillageois(int nb) {
		if(nb>villageois.length) {
			System.out.println("il n'y a pas autant d'habitants dans le village");
			return null;
		}else {
			return villageois[nb-1];
		}
		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village "+nom+" du chef "+chef.getNom());
		System.out.println("vivent les legendaires gaulois : ");
		for(int i = 0; i<nbVillageois;i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		
		Village village = new Village("Village des irréductibles", 30);
		Gaulois Abraracourcix =new Gaulois("Abraracourcix",6);
		village.setChef(Abraracourcix);
		Gaulois Asterix =new Gaulois("Asterix",8);
		village.ajouterVillageois(Asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois); 
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		Gaulois Obelix = new Gaulois("Obeleix", 25);
		village.ajouterVillageois(Obelix);
		village.afficherVillageois();
		
	
	
	}

	
}
