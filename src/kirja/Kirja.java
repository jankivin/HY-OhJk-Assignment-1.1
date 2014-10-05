
package kirja;

/**
 *
 * @author jankivin
 */
public class Kirja {

    // Kentät
    private String kirja_nimi;
    private String kirja_kirjoittaja;
    private int kirja_vuosi;
    
    // Konstruktorit
    public Kirja() {
        this.kirja_nimi = "";
        this.kirja_kirjoittaja = "";
        this.kirja_vuosi = 0;
    }
  
    public Kirja(String nimi, String kirjoittaja, int vuosi) {
        this.kirja_nimi = nimi;
        this.kirja_kirjoittaja = kirjoittaja;
        this.kirja_vuosi = vuosi;
    }
    
    // Mutaattorit
    public void setKirja_nimi(String nimi) {
        this.kirja_nimi = nimi;
    }
    
    public void setKirja_kirjoittaja(String kirjoittaja) {
        this.kirja_kirjoittaja = kirjoittaja;
    }
    
    public void setKirja_vuosi(int vuosi) {
        this.kirja_vuosi = vuosi;
    }
    
    // Aksessorit
    
    public String getKirja_nimi() {
        return this.kirja_nimi;
    }
    
    public String getKirja_kirjoittaja() {
        return this.kirja_kirjoittaja;
    }
    
    public int getKirja_vuosi() {
        return this.kirja_vuosi;
    }
    
    public String toString() {
        return this.kirja_nimi + ", " + this.kirja_kirjoittaja + " " + this.kirja_vuosi;
    }
    
    public static void main(String[] args) {
        
        // Testikoodi.
        Kirja seitsemanveljesta = new Kirja("Seitsemän veljestä", "Aleksis Kivi", 1870);
        System.out.println(seitsemanveljesta);
    }
    
}
