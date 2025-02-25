package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;
import personnages.Chaudron;

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
		System.out.println("------------------------------------------------------------");
		Romain brutus = new Romain("brutus", 14);
		Druide Panoramix = new Druide("Panoramix",2);
		Chaudron chaudron = new Chaudron(0, 0);
		Panoramix.fabriquerPotion(chaudron, 4, 3);
		Panoramix.booster(Obelix, chaudron);
		Panoramix.booster(Asterix, chaudron);
		for(int j=0; j<3; j++) {
			Asterix.frapper(brutus);
		}
		}
	}


