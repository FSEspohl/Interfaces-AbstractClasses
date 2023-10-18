public class Visitenkartendruck {
    private Mitarbeiter mitarbeiter;
    private Druckbar drucker;

    public static final int standart = 0;
    public static final int rahmen = 1;
    public static final int namensschild = 2;
    public static final int farbe = 3;

    public Visitenkartendruck(Mitarbeiter mitarbeiter, Druckbar drucker) {
        setMitarbeiter(mitarbeiter);
        this.drucker = drucker;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        if (mitarbeiter == null) {
            throw new IllegalStateException("Datenfeld 'mitarbeiter' darf nicht NULL sein!");
        }
        this.mitarbeiter = mitarbeiter;
    }

    public void setDrucker(Druckbar drucker) {
        this.drucker = drucker;
    }

    public void setDrucker(int drucker) {
        // darf nicht außerhalb von den Konstanten mitgegeben werden
        if (drucker != 0 && drucker != 1 && drucker != 2 && drucker != 3) {
            return;
        }
        setDrucker((drucker == 0) ? new Standartdruck() : (drucker == 1) ? new Rahmendruck() : (drucker == 2) ? new Namensschilderdruck() : new Farbdruck());
    }

    public void drucken(){
        this.drucker.drucken(this.mitarbeiter);
    }
}
