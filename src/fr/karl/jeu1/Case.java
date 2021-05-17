package fr.karl.jeu1;

/**
 * @author karlo
 * <b> class Case est parent de la classe Arme, class Sort et class Ennemies </b>
 */
public abstract class Case {
	/**
	 * @param p c'est le personnage typ� par la class Personnage
	 */
	public abstract void action(Personnage p); // cette m�thode sera utilis�e pour les interactions du personnage avec les armes, potions ou ennemis		
}
