package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois Asterix = new Gaulois("Asterix",8);
		Gaulois Obelix = new Gaulois("Obelix",16);
		Asterix.parler("bonjour Obelix");
		Obelix.parler("bonjour Asterix . ca te dirai d'aller chasser des sanglier ?");
		Asterix.parler("Oui très bonne idée.");
		System.out.println(Asterix);
		Romain minus = new Romain("minus", 6);
		System.out.println("Dans la foret " + Asterix.toString()+" et " + Obelix.toString()+
		" tombe nez a nez sur le romain " + minus.getNom());
		for(int i=0; i<3; i++) {
			Asterix.frapper(minus);
		}
	}

}
