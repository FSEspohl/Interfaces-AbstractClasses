public class Mitarbeiter extends Person {
    private String email;
    private Position position;


    Mitarbeiter(long ID, String name, String email, Position position){
        super(ID, name);
        this.email = email;
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    // eine Enumeration für die Einteilung eines Mitarbeiters
    public enum Position {
        Abteilungsleiter,
        CEO,
        Mitarbeiter}
}
