package fr.karl.jeu1;

import java.util.Scanner;

/**
 * @author karlo <b>la classe Sorcier h�rite de la class Ennemies </b>
 */
public class Sorcier extends Ennemies {
	private Scanner clavier = new Scanner(System.in);

	private String Nom;
	private int Vie;
	private int Atk;

	/**
	 * constructeur par d�faut dont le nom, la vie et l'attaque sont d�finit �
	 * l'int�rieur
	 */
	public Sorcier() {
		this.Nom = "Sorcier";
		this.Vie = 9;
		this.Atk = 2;
	}

	/**
	 * @param nomSorcier c'est le nom du sorcier
	 * @param vieSorcier c'est la vie du sorcier
	 * @param atkSorcier c'est l'attaque du sorcier
	 */
	public Sorcier(String nomSorcier, int vieSorcier, int atkSorcier) {
		this.Nom = nomSorcier;
		this.Vie = vieSorcier;
		this.Atk = atkSorcier;
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
		return "Sorcier [Nom=" + Nom + ", Vie=" + Vie + ", Atk=" + Atk + "]";
	}

	/**
	 * m�thode h�rit� de la classe Case cette m�thode permet le combat entre le
	 * personnage et le sorcier
	 */
	@Override
	public void action(Personnage p, Game game) {
		int choix = 1;
		System.out.println("Combat contre un sorcier");
		System.out.println(toString());
		System.out.println("1�re attaque");
		while (choix == 1 && (getVie() > 0 && p.getVie() > 0)) {
			this.setVie(this.getVie() - p.getAtk()); // fait que le niveau de vie du sorcier soit persistant
			
			if (this.getVie() > 0) {
				System.out.println("le sorcier vient de passer � " + this.getVie() + " de vie");
				System.out.println("le sorcier contre-attaque");
			} else {
				System.out.println("Vous avez tu� le sorcier");
				break;
			}
			if (p.getVie() > 0) {
				p.setVie(p.getVie() - Atk);
				System.out.println("Vous �tes � " + p.getVie() + " de vie");
				System.out.println("Voulez-vous attaquer le dragon ou fuir?\n 1 pour attaquer\n 2 pour fuir");
				choix = clavier.nextInt();
			} else {
				System.out.println("Vous �tes mort");
				break;
			}
		}
		if (choix == 2) {
			System.out.println("Vous reculez � la case " + game.reculerJoueur() + " cases");
		} else {
			System.out.println("Fin du combat");
		}
	}
}
