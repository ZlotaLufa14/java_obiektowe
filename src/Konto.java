public class Konto {
    private static int nr = 1;
    private int nrKonta;
    private String imie;
    private String nazwisko;
    private double saldo;
    private double oprocentowanie;
    private boolean czyAktywne;

    public Konto(String imie, String nazwisko, double saldo, double oprocentowanie, boolean czyAktywne) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = saldo;
        this.oprocentowanie = oprocentowanie;
        this.czyAktywne = czyAktywne;
        this.nrKonta = nr;
        nr++;
    }

    public Konto(String imie, String nazwisko, double oprocentowanie, boolean czyAktywne) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = 0;
        this.oprocentowanie = oprocentowanie;
        this.czyAktywne = czyAktywne;
        this.nrKonta = nr;
        nr++;
    }

    public Konto(String imie, String nazwisko, double oprocentowanie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.saldo = 0;
        this.oprocentowanie = oprocentowanie;
        this.czyAktywne = true;
        this.nrKonta = nr++;
    }

    public String toString() {
        return this.nrKonta + ". " + this.imie + " " + this.nazwisko + ", " + this.saldo + ", " + this.oprocentowanie + "%, " + (czyAktywne ? "tak" : "nie") + "\n";
    }
}
