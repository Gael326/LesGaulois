package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois Asterix = new Gaulois("Asterix",8);
		Gaulois Obelix = new Gaulois("Obelix",16);
		Asterix.parler("bonjour Obelix");
		Obelix.parler("bonjour Asterix . ca te dirai d'aller chasser des sanglier ?");
		Asterix.parler("Oui très bonne idée.");
		System.out.println(Asterix);
	
	}

}
