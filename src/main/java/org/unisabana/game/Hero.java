package org.unisabana.game;

public abstract class Hero implements Cloneable {
    private String name;
    private int level;
    private int skillPoints;
    private int experience;
    private int defensePoints;
    private String skin;

    public Hero(String name, int level, int skillPoints, int experience, int defensePoints, String skin) {
        this.name = name;
        this.level = level;
        this.skillPoints = skillPoints;
        this.experience = experience;
        this.defensePoints = defensePoints;
        this.skin = skin;
    }

    public Hero clone() throws CloneNotSupportedException {
        return (Hero) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = skillPoints;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", skillPoints=" + skillPoints +
                ", experience=" + experience +
                ", defensePoints=" + defensePoints +
                ", skin=" + skin +
                '}';
    }
}
