
package modell;


public class Sarkany {
    private String nev;
    private int tuzokadasEro;
    private int repulesiSebesseg;
    private int teherCipeles;
    
    private static boolean harag = false;
    private static int pusztitasiEro = 0;  // %-ban értve

    
    public Sarkany(){
        this("Sarkany",50,80,100);
    }
    
    public Sarkany(int tuzokadasEro){
        this("Sarkany",tuzokadasEro, 80, 100);
    }
    
    public Sarkany(String nev, int tuzokadasEro, int repulesiSebesseg, int teherCipeles){
        this.nev = nev;
        this.tuzokadasEro = tuzokadasEro;
        this.repulesiSebesseg = repulesiSebesseg;
        this.teherCipeles = teherCipeles;
    }
    
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public int getTuzokadasEro() {
        return tuzokadasEro;
    }

    public void setTuzokadasEro(int tuzokadasEro) {
        this.tuzokadasEro = tuzokadasEro;
    }
    
    public int getRepulesiSebesseg() {
        return repulesiSebesseg;
    }

    public void setRepulesiSebesseg(int repulesiSebesseg) {
        this.repulesiSebesseg = repulesiSebesseg;
    }

    
    public int pusztitas(){
        pusztitasiEro = tuzokadasEro * repulesiSebesseg;
        if(harag == true){
            pusztitasiEro *= 2;
        } else {
            pusztitasiEro *= 1.2;
        }
        return pusztitasiEro;
    }
    
    public void adatokMegjelenitese() {
        System.out.println("Sarkany: "+ nev +"  [Tuzokado ereje=" + tuzokadasEro + ", Repülési sebessége=" + repulesiSebesseg + ", Tehercipelési ereje=" + teherCipeles + "]");
    }
 
}
