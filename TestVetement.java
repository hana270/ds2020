package ds2020;

public class TestVetement {

	public static void main(String[] args) {
		Boutique b = new Boutique("Pour Vous",50);
        VetementEnfant a1 = new VetementEnfant("Robe", 29.9f, "R100", "Rouge", 0.5f);
        Vetement a2 = new Vetement("Manteau", 169.9f, "M200", "Gris");
        b.ajoutVetement(a1);
        b.ajoutVetement(a2);
        
        /*************
        for (int i = 0; i < b.tabVet.length; i++) {
            if (b.tabVet[i] != null) {
                System.out.println(b.tabVet[i].toString());
            }
        }
        ***************/
        
        a2.setQte(a2.getQte() - 5);
        b.afficheStock(60);
		
	}

}