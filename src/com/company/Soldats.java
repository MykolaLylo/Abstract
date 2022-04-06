package com.company;

public abstract class Soldats {
    private String name;
    private int hp;
    private String weapon;
    private int damage;

    public Soldats (String name, int hp, String weapon, int damage){
     this.name = name;
     this.hp = hp;
     this.weapon = weapon;
     this.damage = damage;
    }
    public Soldats(){

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage (int damage) {
        this.damage = damage;
    }

    public abstract void getInfoSoldat();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Soldats " +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                ' ';
    }
}
