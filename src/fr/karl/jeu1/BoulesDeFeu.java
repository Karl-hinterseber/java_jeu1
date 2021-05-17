package fr.karl.jeu1;

/**
 * @author karlo <b>la classe BoulesDeFeu h�rite de la classe Arme </b>
 */
public class BoulesDeFeu extends Sort {
	private String nom;
	private int force;

	/**
	 * constructeur par d�faut dont le nom et la force sont d�finit � l'int�rieur
	 */
	public BoulesDeFeu() {
		this.nom = "Boules de feu";
		this.force = 7;
	}

	/**
	 * @param nomBoulesDeFeu   c'est le nom de BoulesDeFeu
	 * @param forceBoulesDeFeu c'est la force de BoulesDeFeu
	 */
	public BoulesDeFeu(String nomBoulesDeFeu, int forceBoulesDeFeu) {
		nom = nomBoulesDeFeu;
		force = forceBoulesDeFeu;
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
		return "BoulesDeFeu [nom=" + nom + ", force=" + force + "]";
	}

	/**
	 * m�thode h�rit� de la classe Case si le personnage est un Magicien alors on
	 * rajoute la force de cette BoulesDeFeu � son Atk de base (voir dans class
	 * Personnage)
	 */

	@Override
	protected void action(Personnage p, Game game) {
		if (p instanceof Magicien) {
			((Magicien) p).setSort(this);
		} else {
			System.out.println("Dommage, les boules de feu ne peuvent �tre � vous");
		}
	}

}
