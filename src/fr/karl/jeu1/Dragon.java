package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Dragon h�rite de la class Ennemies </b>
 */
public class Dragon extends Ennemies {

	private String Nom;
	private int Vie;
	private int Atk;

	/**
	 *   constructeur par d�faut dont le nom, la vie et l'attaque sont d�finit � l'int�rieur
	 */
	public Dragon() {
		this.Nom = "Dragon";
		this.Vie = 15;
		this.Atk = 4;
	}

	/**
	 * @param nomDragon c'est le nom du dragon
	 * @param vieDragon c'est la vie du dragon
	 * @param atkDragon c'est l'attaque du dragon
	 */
	public Dragon(String nomDragon, int vieDragon, int atkDragon) {
		this.Nom = nomDragon;
		this.Vie = vieDragon;
		this.Atk = atkDragon;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getVie() {
		return Vie;
	}

	public void setVie(int vie) {
		Vie = vie;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	@Override
	public String toString() {
		return "Dragon [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	/**
	 * m�thode h�rit� de la classe Case
	 * cette m�thode permet le combat entre le personnage et le dragon
	 */
	@Override
	public void action(Personnage p) {
		this.setVie(this.Vie - p.getAtk()); // fait que le niveau de vie du dragon soit persistant
		int resultPersoAtk = getVie();
		p.setVie(p.getVie() - Atk);
		int resultDragonAtk = p.getVie();
		System.out.println("Combat contre un dragon");
		System.out.println(toString());
		System.out.println("personnage attaque");
		if (resultPersoAtk > 0) {
			System.out.println("le dragon vient de passer � " + resultPersoAtk + " de vie");
			System.out.println("le dragon contre-attaque");
		} else {
			System.out.println("Vous avez tu� le dragon");
		}
		if (resultDragonAtk > 0) {
			System.out.println("Vous �tes � " + resultDragonAtk + " de vie");
			System.out.println("IL S'ENFUIT!!!!!!");
		} else {
			System.out.println("Vous �tes mort");
		}
	}
}
