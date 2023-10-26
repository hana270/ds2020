package ds2020;

public class Vetement {
protected String code;
protected String libelle;
protected String couleur;
protected double qte;
protected float prixht;
protected final float tva=0.18f;

public Vetement (String lib, float pht, String code, String c) {
	this.code=code;
	this.libelle=lib;
	this.prixht=pht;
	this.couleur=c;
}

public double getQte() {
	return this.qte;
}
public void setQte(double qte) {
	this.qte=qte;
}

@Override
public String toString() {
	return " "+this.code+" "+this.libelle+" "+couleur+" : prixHT=" +this.prixht+" DT et qté = "+this.qte;
}

public float prixTTC () {
	 float p = 0;
	if(this.prixht !=0) {
		p=this.prixht*(1+ this.tva/100);
	}
	return p;
}
public float prixTTC (int remise) {
	return this.prixTTC()*(1-remise/100);
	
}

}
