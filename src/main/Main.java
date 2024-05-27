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
        vegyesSarkany.adatokMegjelenitese(); // meghívja a felülírt metódust a Jegsarkany osztályban

        // A 'vizKeszletBefagy()' metódus nem érhet? el a Sarkany referencián keresztül
         // vegyessarkany.vizKeszletBefagy(); // Ez fordítási idej? hibát okozna

         // A 'vizKeszletBefagy()' hívásához vissza kell adni a hivatkozást a JegSarkanyra
        if (vegyesSarkany instanceof JegSarkany) {
            ((JegSarkany) vegyesSarkany).vizKeszletBefagy();
        }
    }
}