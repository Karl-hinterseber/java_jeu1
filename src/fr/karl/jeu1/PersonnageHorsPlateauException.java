package fr.karl.jeu1;

/**
 * @author karlo
 * <b> la class PersonnageHorsPlateauException h�rite de la class Exception </b>
 */
public class PersonnageHorsPlateauException extends Exception {
	/**
	 * constructeur par d�fault qui renvoit l'exeption
	 */
	public PersonnageHorsPlateauException() {
		super("hors plateau");
	}
}
