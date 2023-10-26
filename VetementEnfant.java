package ds2020;

public class VetementEnfant extends Vetement{
	private float age;
	
	
public VetementEnfant(String lib, float pht, String code, String c,float age) {
	super(lib,pht,code,c);
	this.age=age;
}

public void setAge(float Age){
	if(Age > 0.4) {
		this.age=Age;
	}else {
		System.out.println("Age invalide");
	}
}
@Override
public String toString() {
	return super.toString()+" pour Age ="+age;
}

public float prixTTC (int remise) {
	if(remise>=50) {
		System.out.println("elle n’est pas comptabilisée");
	}
	return super.prixTTC(remise);
}
	
}
