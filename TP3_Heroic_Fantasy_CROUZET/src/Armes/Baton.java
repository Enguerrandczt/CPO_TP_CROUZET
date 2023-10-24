/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author engue
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String nom, int niveau) {
        super(nom,niveau);
    }
    
    public Baton( String nom, int niveau,int age) {
        super(nom, niveau);
                if (age <= 100) {
            this.age = age;
        } else {
            this.age = 100;
        }
    }

}
