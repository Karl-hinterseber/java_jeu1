package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Eclair h�rite de la classe Sort </b>
 */
public class Eclair extends Sort{
	private String nom;
	private int force;
	
	/**
	 * constructeur par d�faut dont le nom et la force sont d�finit � l'int�rieur
	 */
	public Eclair() {
		this.nom = "Eclair";
		this.force = 2;
	}
	
	/**
	 * @param nomEclair c'est le nom de l'�clair
	 * @param forceEclair c'est la force de l'�clair
	 */
	public Eclair(String nomEclair, int forceEclair) {
		this.nom = nomEclair;
		this.force = forceEclair;
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
		return "Eclair [nom=" + nom + ", force=" + force + "]";
	}

	/**
	 * m�thode h�rit� de la classe Case
	 * si le personnage est un Magicien
	 * alors on rajoute la force de cet Eclair � son Atk de base (voir dans class Personnage)
	 */

	@Override
	public void action(Personnage p, Game game) {
		if (p instanceof Magicien) {
			((Magicien)p).setSort(this);
		} else {
			System.out.println("Dommage, l'�clair ne peut �tre � vous");
		}	
		
	}
}
