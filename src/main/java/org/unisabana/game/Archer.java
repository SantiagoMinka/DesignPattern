package org.unisabana.game;

public class Archer extends Hero {
    private int attackPoints;

    public Archer(String name, int level, int skillPoints, int experience, int defensePoints) {
        super(name, level, skillPoints, experience, defensePoints, "defaultArcherSkin.jpg");
        this.attackPoints = 40;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void shootArrow() {
        System.out.println(this.getName()+" Shooting an arrow");
        this.attackPoints -= 3;
    }

    @Override
    public String toString() {
        return super.toString() + " Archer{" +
                "attackPoints=" + attackPoints +
                '}';
    }
}
