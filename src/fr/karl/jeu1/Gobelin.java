package fr.karl.jeu1;

/**
 * @author karlo
 * <b>la classe Gobelin h�rite de la class Ennemies </b>
 */
public class Gobelin extends Ennemies {
	private String Nom;
	private int Vie;
	private int Atk;

	/**
	 *   constructeur par d�faut dont le nom, la vie et l'attaque sont d�finit � l'int�rieur
	 */
	public Gobelin() {
		this.Nom = "Gobelin";
		this.Vie = 6;
		this.Atk = 1;
	}

	/**
	 * @param nomGobelin c'est le nom du gobelin
	 * @param vieGobelin c'est le vie du gobelin
	 * @param atkGobelin c'est l'attaque du gobelin
	 */
	public Gobelin(String nomGobelin, int vieGobelin, int atkGobelin) {
		this.Nom = nomGobelin;
		this.Vie = vieGobelin;
		this.Atk = atkGobelin;
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
		return "Gobelin [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	/**
	 * m�thode h�rit� de la classe Case
	 * cette m�thode permet le combat entre le personnage et le gobelin
	 */
	@Override
	public void action(Personnage p) {
		this.setVie(Vie - p.getAtk()); // change la vie du gobelin pour que le niveau de vie soit persistant
		int resultPersoAtk = getVie();
		p.setVie(p.getVie() - Atk);
		int resultGobelinAtk = p.getVie();
		System.out.println("Combat contre un gobelin");
		System.out.println(toString());
		System.out.println("personnage attaque");
		if (resultPersoAtk > 0) {
			System.out.println("le gobelin vient de passer � " + resultPersoAtk + " de vie");
			System.out.println("le gobelin contre-attaque");
		} else {
			System.out.println("Vous avez tu� le gobelin");
		}
		if (resultGobelinAtk > 0) {
			System.out.println("Vous �tes � " + resultGobelinAtk + " de vie");
			System.out.println("IL S'ENFUIT!!!!!!");
		} else {
			System.out.println("Vous �tes mort");
		}
	}
}
