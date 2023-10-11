package org.unisabana.game;

public class Warrior extends Hero {
	private int attackPoints;

	public Warrior(String name, int level, int skillPoints, int experience, int defensePoints) {
		super(name, level, skillPoints, experience, defensePoints, "defaultWarriorSkin.jpg");
		this.attackPoints = 50;
	}

	public void performAttack() {
		System.out.println(this.getName() + " Attacking!");
		this.attackPoints -= 5;
	}

	@Override
	public String toString() {
		return super.toString() + " Warrior{" + "attackPoints=" + attackPoints + '}';
	}

	public int getAttackPoints() {
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints) {
		this.attackPoints = attackPoints;
	}
}
