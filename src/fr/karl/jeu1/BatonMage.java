package fr.karl.jeu1;

/**
 * @author karlo
 * <b>le BatonMage initialise l'arme � zero </b>
 */
public class BatonMage extends Sort {
	private String nom;
	private int force;
	
	/**
	 * constructeur par d�faut dont le nom et la force sont d�finit � l'int�rieur
	 */
	public BatonMage() {
		this.nom = "Baton";
		this.force = 0;
	}
	
	/**
	 * @param nomBatonMage c'est le nom du BatonMage
	 * @param forceBatonMage c'est la force du BatonMage
	 */
	public BatonMage(String nomBatonMage, int forceBatonMage) {
		nom = nomBatonMage;
		force = forceBatonMage;		
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	@Override
	public String toString() {
		return "BatonMage [nom=" + nom + ", force=" + force + "]";
	}

	public void action(Personnage p, Game game) {
		// TODO Auto-generated method stub
		
	}

}
