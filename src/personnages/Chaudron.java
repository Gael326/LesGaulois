package personnages;

public class Chaudron {
	int quantitePotion;
	int forcePotion;
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public int getQuantitePotion() {
		return quantitePotion;
	}

	public void setQuantitePotion(int quantitePotion) {
		this.quantitePotion = quantitePotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}

	@Override
	public String toString() {
		return "Chaudron [quantitePotion=" + quantitePotion + ", forcePotion=" + forcePotion + "]";
	}
	
	public void remplirChaudron(int quantite, int ForcePotion) {
		quantitePotion+=quantite;
		forcePotion+=ForcePotion;
	}

	public boolean resterPotion(){
		return quantitePotion>0;
	}
	
	public boolean contientPotion() {
		return resterPotion();
	}
	
	public void prendreLouche() {
		if (resterPotion()) {
			setQuantitePotion(quantitePotion-=1);
		}else {
			setForcePotion(0);
		}
	}
	
}
