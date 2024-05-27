package modell;

import modell.Sarkany;

// �r�k�l?dik
public class JegSarkany extends Sarkany{
    private boolean fagyasztasKepesseg;

    // �j konstruktor bevezet�se + eredetiek
    public JegSarkany() {
        super();    // megh�vjuk a sz�l?oszt�ly konstruktor�t
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

    // Fel�l�r�s
    @Override
    public void adatokMegjelenitese() {
        System.out.println("J�gs�rk�ny [Fagyaszt�s k�pess�g =" + fagyasztasKepesseg + "]");
    }
    
    // �jat met�dust vezet�nk be
    public void vizKeszletBefagy(){
        if(fagyasztasKepesseg == true){
            System.out.println("A j�gs�rk�ny befagyasztotta a v�zk�szletet!");
        } else {
            System.out.println("A j�gs�rk�ny nem volt k�pes befagyasztani a v�zk�szletet!");
        }
    }
}
