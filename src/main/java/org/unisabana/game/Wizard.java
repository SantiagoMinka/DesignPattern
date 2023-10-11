package org.unisabana.game;

public class Wizard extends Hero {
	private int magicPoints;

	public Wizard(String name, int level, int skillPoints, int experience, int defensePoints) {
		super(name, level, skillPoints, experience, defensePoints, "defaultWizardSkin.jpg");
		this.magicPoints = 50;
	}

	public void throwSpell() {
		System.out.println(this.getName() + " Throwing a spell!");
		this.magicPoints -= 10;
	}

	public int getMagicPoints() {
		return magicPoints;
	}

	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}

	@Override
	public String toString() {
		return super.toString() + " Wizard{" + "magicPoints=" + magicPoints + '}';
	}
}
