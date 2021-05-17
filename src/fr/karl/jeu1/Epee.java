package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Epee h�rite de la classe Arme </b>
 */
public class Epee extends Arme{
	private String nom;
	private int force;
	
	/**
	 * constructeur par d�faut dont le nom et la force sont d�finit � l'int�rieur
	 */
	public Epee() {
		this.nom = "Ep�e";
		this.force = 5;
	}
	
	/**
	 * @param nomEpee c'est le nom de l'�p�e
	 * @param forceEpee c'est la force de l'�p�e
	 */
	public Epee(String nomEpee, int forceEpee) {
		this.nom = nomEpee;
		this.force = forceEpee;		
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
		return "Epee [nom=" + nom + ", force=" + force + "]";
	}
	
	/**
	 * m�thode h�rit� de la classe Case
	 * si le personnage est un Guerrier
	 * alors on rajoute la force de cette Epee � son Atk de base (voir dans class Personnage)
	 */
	@Override
	public void action(Personnage p) {
		if (p instanceof Guerrier) {
			((Guerrier)p).setArme(this);
		} else {
			System.out.println("Dommage, l'�p�e ne peut �tre � vous");
		}
	}
}
