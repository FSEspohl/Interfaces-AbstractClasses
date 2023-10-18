public class Namensschilderdruck implements Druckbar{

    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        System.out.println("Name: " + mitarbeiter.getName() + "\tID: " + mitarbeiter.getID());
        switch (mitarbeiter.getPosition()){
            case Mitarbeiter -> System.out.print("*");
            case Abteilungsleiter -> System.out.print("***");
            case CEO -> System.out.print("*****");
        }
    }
}
