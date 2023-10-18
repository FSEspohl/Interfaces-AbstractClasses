public class Rahmendruck implements Druckbar{

    @Override
    public void drucken(Mitarbeiter mitarbeiter) {
        //print
        lineprint();
        System.out.println("\n|Name: " + mitarbeiter.getName() + "    |\n|ID: " +
                mitarbeiter.getID() + "         |\n|Email: " + mitarbeiter.getEmail() +
                "  |\n|Position: " + mitarbeiter.getPosition() + "|");
        lineprint();
    }

    //Methode zum bestimmen, wie lang der Druck sein soll
    public void lineprint(){
        String longestString = "Position: Mitarbeiter";
        int length = longestString.length() + 2;
        for(int i = 0; i < length; i++){
            System.out.print("_");
        }
    }
}
