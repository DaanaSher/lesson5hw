package com.company.HomeWork5;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setDefenceType("Physical");
        System.out.println(boss.getInfo());
        //
    }
}
