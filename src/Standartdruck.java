public class Standartdruck implements Druckbar{

    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        System.out.println("Name: " + mitarbeiter.getName() + "\tID: " + mitarbeiter.getID() +
                "\nEmail: " + mitarbeiter.getEmail() + "\tPosition: " + mitarbeiter.getPosition());
    }
}
