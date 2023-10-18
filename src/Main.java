public class Main {
    public static void main(String[] args) {

        Mitarbeiter mitarbeiter = new Mitarbeiter(16413264, "Stefan Pohl", "spohl@tsn.at", Mitarbeiter.Position.Mitarbeiter);
        Druckbar druckbar = new Namensschilderdruck();

        Visitenkartendruck vkd = new Visitenkartendruck(mitarbeiter, druckbar);

        vkd.drucken();
        vkd.setDrucker(Visitenkartendruck.rahmen);
        System.out.print("\n\n");
        vkd.drucken();
        vkd.setDrucker(Visitenkartendruck.standart);
        System.out.print("\n\n");
        vkd.drucken();
        vkd.setDrucker(Visitenkartendruck.farbe);
        vkd.drucken();
    }
}