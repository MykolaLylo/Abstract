package com.company;

public class Soldat2 extends Soldats {

        public Soldat2 ( String name, int hp, String weapon, int damage){
            super( name, hp, weapon, damage);
        }
        public Soldat2(){

        }


    @Override
        public void getInfoSoldat(){
            System.out.println(super.toString() );
        }

}

