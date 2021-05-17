package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe BatonGuerrier h�rite de la classe Arme </b>
 */
public class BatonGuerrier extends Arme{
	private String nom;
	private int force;
	
	/**
	 * constructeur par d�faut dont le nom et la force sont d�finit � l'int�rieur
	 */
	public BatonGuerrier() {
		this.nom = "Baton";
		this.force = 0;
	}
	
	/**
	 * @param nomBatonGuerrier c'est le nom du BatonGuerrier
	 * @param forceBatonGuerrier c'est la force du BatonGuerrier
	 */
	public BatonGuerrier(String nomBatonGuerrier, int forceBatonGuerrier) {
		nom = nomBatonGuerrier;
		force = forceBatonGuerrier;		
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
		return "BatonGuerrier [nom=" + nom + ", force=" + force + "]";
	}

	@Override
	public void action(Personnage p) { //m�thode h�rit� de la classe Case
		// TODO Auto-generated method stub
		
	}

}
