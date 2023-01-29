package Tp;

public class Etudiant {
	private String nom;
	private String promotion;
	private String matricule;
	private String age;
	private String etatcivil;
	public Etudiant(String nom, String promotion, String matricule, String age, String etatcivil) {
		super();
		this.nom = nom;
		this.promotion = promotion;
		this.matricule = matricule;
		this.age = age;
		this.etatcivil = etatcivil;
	}
	public Etudiant() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPromotion() {
		return promotion;
	}
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEtatcivil() {
		return etatcivil;
	}
	public void setEtatcivil(String etatcivil) {
		this.etatcivil = etatcivil;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", promotion=" + promotion + ", matricule=" + matricule + ", age=" + age
				+ ", etatcivil=" + etatcivil + "]";
	}
	
	
}
