//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");


        int hoehe = 5; // Höhe des Tannenbaums

        for (int i = 1; i <= hoehe; i++) {
            // Leerzeichen für die richtige Ausrichtung
            for (int j = hoehe - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Sterne für die aktuelle Ebene
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Neue Zeile nach jeder Ebene
            System.out.println();
        }

        // Stamm des Tannenbaums
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < hoehe - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}