package ds2020;

public class Boutique {
Vetement tabVet[];
private String nom;
private int nbVet;

public Boutique (String n, int taille) {
	this.nom=n;
	
	tabVet = new Vetement[taille];
}
	
public void ajoutVetement (Vetement v) {
	
	if(tabVet.length>nbVet) {
		tabVet[nbVet] = v;
        nbVet++;
		
	}else {
		System.out.println(" Boutique pleine ");
	}
}
public void afficheStock (int remise) {
	for(int i=0;i<nbVet;i++) {
		if(tabVet[i].getQte()!=0) {
			System.out.println(tabVet[i].toString()+" --> Prix TTC aprés remise = "+tabVet[i].prixTTC(remise));
		}
	}
}
}
