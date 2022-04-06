package com.company;

public class Main {

    public static void main(String[] args) {
        Soldat1 s1 = new Soldat1();
        s1.setName("Rick");
        s1.setHp(100);
        s1.setWeapon("Javelin");
        s1.setDamage(20);
        Soldat2 s2 = new Soldat2("Nick", 80, "Bayraktar", 30);
        Soldat3 s3 = new Soldat3("John", 50, "Starstreak", 50 );
        s1.getInfoSoldat();
        s2.getInfoSoldat();
        s3.getInfoSoldat();
        System.out.println();
        System.out.println("Start WAR!!!");
        System.out.println();
        int duel1 = s1.getHp()- s2.getDamage();
        System.out.println("Soldat2 shoot Soldat1");
        System.out.println("Soldat1 hp: "+duel1);

        int duel2 = s2.getHp()- s3.getDamage();
        System.out.println("Soldat3 shoot Soldat2");
        System.out.println("Soldat2 hp: "+duel2);

        int duel3 = s3.getHp()- s1.getDamage();
        System.out.println("Soldat1 shoot Soldat3");
        System.out.println("Soldat3 hp: "+duel3);

        int duel4 = duel2- s1.getDamage();
        System.out.println("Soldat1 shoot Soldat2");
        System.out.println("Soldat2 hp: "+duel4);

        int duel5 = duel1 - s3.getDamage();
        System.out.println("Soldat3 shoot Soldat1");
        System.out.println("Soldat1 hp: "+duel5);

        int duel6 = duel3- s2.getDamage();
        System.out.println("Soldat2 shoot Soldat3");
        System.out.println("Soldat1 hp: "+duel6);
        System.out.println("Soldat1 died");

        int duel7 = duel4 - s3.getDamage();
        System.out.println("Soldat3 shoot Soldat2");
        System.out.println("Soldat1 hp: "+duel7);
        System.out.println("Win Soldat3");
        }
    }
