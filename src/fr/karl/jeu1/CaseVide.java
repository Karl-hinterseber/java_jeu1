package fr.karl.jeu1;

/**
 * @author karlo
 * <b> class CaseVide h�rite de la class Case </b>
 * elle contient un seul attribut
 */
public class CaseVide extends Case {
	String Reponse = "Vous �tes sur une case vide";
	
	/**
	 * constructeur par d�faut
	 */
	public CaseVide() {
	}
	
	/**
	 * @param reponse renvoie un String
	 */
	public CaseVide(String reponse) {
		Reponse = reponse;
	}

	public String getReponse() {
		return Reponse;
	}

	public void setReponse(String reponse) {
		Reponse = reponse;
	}

	@Override
	public String toString() {
		return "CaseVide [Reponse=" + Reponse + "]";
	}

	@Override
	public void action(Personnage p) { //m�thode h�rit� de la classe Case
		System.out.println("Il ne reste plus rien sur cette case"); // quand le personnage tombe sur cette case il ne se passe rien
	}	
}
