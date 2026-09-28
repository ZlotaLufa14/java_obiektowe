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

    public void zasil(double kwota) {
        if(this.czyAktywne == false) {
            throw new RuntimeException("Nie aktywowano konta");
        }

        if(kwota < 0) {
            throw new RuntimeException("Kwota mniejsza od zera");
        }

        this.saldo += kwota;
    }

    public void wyplac(double kwota) {
        if(this.czyAktywne == false) {
            throw new RuntimeException("Nie aktywowano konta");
        }

        if(kwota < 0) {
            throw new RuntimeException("Kwota mniejsza od zera");
        }

        if(this.saldo-kwota <= 0) {
            throw new RuntimeException("Zbyt duża kwota");
        }

        this.saldo -= kwota;
    }

    public void naliczOprocentowanie() {
        if(this.czyAktywne == false) {
            throw new RuntimeException("Nie aktywowano konta");
        }

        this.saldo += this.saldo*(this.oprocentowanie/100);
    }
}
