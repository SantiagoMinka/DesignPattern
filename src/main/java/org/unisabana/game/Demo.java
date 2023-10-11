package org.unisabana.game;

public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Warrior firstWarrior = new Warrior("Warrior 1", 1, 20, 0, 50);
		Warrior secondWarrior = (Warrior) firstWarrior.clone();
		firstWarrior.setSkin("customSkin.jpg");
		secondWarrior.setName("Warrior 2");
		secondWarrior.setDefensePoints(20);
		secondWarrior.setLevel(10);

		firstWarrior.performAttack();
		secondWarrior.performAttack();

		System.out.println(firstWarrior.toString());
		System.out.println(secondWarrior.toString());

		Wizard firstWizard = new Wizard("Wizard 1", 20, 500, 20, 10);
		Wizard secondWizard = (Wizard) firstWizard.clone();
		secondWizard.setName("Wizard 2");
		secondWizard.setMagicPoints(500);
		secondWizard.setSkin("skinFromInternet.jpg");

		firstWizard.throwSpell();
		secondWizard.throwSpell();

		System.out.println(firstWizard.toString());
		System.out.println(secondWizard.toString());

		Archer firstArcher = new Archer("Archer 1", 15, 300, 24, 17);
		Archer secondArcher = (Archer) firstArcher.clone();
		Archer thirdArcher = (Archer) firstArcher.clone();
		secondArcher.setName("Archer 2");
		secondArcher.setAttackPoints(17);
		thirdArcher.setName("Archer 3");
		thirdArcher.setAttackPoints(10);
		thirdArcher.setLevel(20);

		firstArcher.shootArrow();
		secondArcher.shootArrow();
		thirdArcher.shootArrow();

		System.out.println(firstArcher.toString());
		System.out.println(secondArcher.toString());
		System.out.println(thirdArcher.toString());

	}
}
