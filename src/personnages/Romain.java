package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	public Romain(String nom, int force) {
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
		System.out.println(prendreParole()+"\""+texte+"\"");
		}

	private String prendreParole() {
		return "Le romain "+ nom + " : ";
	}

	public void recevoirCoup(int coup) {
		if(force>0) {
		force-=coup;
		System.out.println("Aïe");
		}else {
			parler("J'abandonne ! ");
		}
		
		}
	
	
}
