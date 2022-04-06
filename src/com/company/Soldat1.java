package com.company;

public class Soldat1 extends Soldats {


    public Soldat1(String name, int hp, String weapon, int damage) {
        super(name, hp, weapon, damage);
    }

    public Soldat1() {

    }


    @Override
    public void getInfoSoldat() {
        System.out.println(super.toString());
    }




}
