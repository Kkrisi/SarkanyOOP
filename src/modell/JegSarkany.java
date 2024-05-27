package modell;

import modell.Sarkany;

// Örököl?dik
public class JegSarkany extends Sarkany{
    private boolean fagyasztasKepesseg;

    // Új konstruktor bevezetése + eredetiek
    public JegSarkany() {
        super();    // meghívjuk a szül?osztály konstruktorát
        this.fagyasztasKepesseg = false;
    }

    public JegSarkany(String nev, int tuzokadasEro, int repulesiSebesseg, int teherCipeles, boolean fagyasztasKepesseg) {
        super(nev, tuzokadasEro, repulesiSebesseg,  teherCipeles);
        this.fagyasztasKepesseg = fagyasztasKepesseg;
    }

    public boolean getFagyasztasKepesseg() {
        return fagyasztasKepesseg;
    }

    public void setFagyasztasKepesseg(boolean fagyasztasKepesseg) {
        this.fagyasztasKepesseg = fagyasztasKepesseg;
    }

    // Felülírás
    @Override
    public void adatokMegjelenitese() {
        System.out.println("Jégsárkány [Fagyasztás képesség =" + fagyasztasKepesseg + "]");
    }
    
    // Újat metódust vezetünk be
    public void vizKeszletBefagy(){
        if(fagyasztasKepesseg == true){
            System.out.println("A jégsárkány befagyasztotta a vízkészletet!");
        } else {
            System.out.println("A jégsárkány nem volt képes befagyasztani a vízkészletet!");
        }
    }
}
