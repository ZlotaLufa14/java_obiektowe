public class Program {
    void main() {
        Konto k1 = new Konto("Gustaw", "Zima", 5000.00, 5.3, true);
        Konto k2 = new Konto("Ignacy", "Zima", 1.5, false);
        Konto k3 = new Konto("Damian", "Mrówka", 10.7);
        System.out.print(k1);
        System.out.print(k2);
        System.out.print(k3);
    }
}
