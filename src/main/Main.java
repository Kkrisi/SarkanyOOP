package main;

import modell.Sarkany;
import modell.JegSarkany;


public class Main {
    public static void main(String[] args) {
        Sarkany simaSarkany = new Sarkany("Smaug", 90, 80, 70);
        JegSarkany fagyosSarkany = new JegSarkany("Fafnir", 60, 100, 60, true);

        simaSarkany.adatokMegjelenitese();
        fagyosSarkany.adatokMegjelenitese();

        // Poliformizmus bemutatasa
        Sarkany vegyesSarkany = new JegSarkany("Tiamat", 500, 300, 95, true);
        vegyesSarkany.adatokMegjelenitese(); // megh�vja a fel�l�rt met�dust a Jegsarkany oszt�lyban

        // A 'vizKeszletBefagy()' met�dus nem �rhet? el a Sarkany referenci�n kereszt�l
         // vegyessarkany.vizKeszletBefagy(); // Ez ford�t�si idej? hib�t okozna

         // A 'vizKeszletBefagy()' h�v�s�hoz vissza kell adni a hivatkoz�st a JegSarkanyra
        if (vegyesSarkany instanceof JegSarkany) {
            ((JegSarkany) vegyesSarkany).vizKeszletBefagy();
        }
    }
}