package com.company;

public class Soldat3 extends Soldats{

    public Soldat3 ( String name, int hp, String weapon, int damage){
        super( name, hp, weapon, damage);

    }
    public Soldat3(){

    }


    @Override
    public void getInfoSoldat() {
        System.out.println(super.toString() );
    }

}

