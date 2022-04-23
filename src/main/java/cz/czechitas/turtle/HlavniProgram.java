package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {

    private void nakresliCtverec(Turtle zelva, double delkaStrany) {

        for (int i = 0; i < 4; i++) {
            zelva.move(delkaStrany);
            zelva.turnRight(90);
        }
    }

    private void nakresliKruh(Turtle zelva, double delkaStrany, int pocetStran) {

        double uhel = 360.0 / pocetStran;

        for (int i = 0; i < pocetStran; i++) {
            zelva.move(delkaStrany);
            zelva.turnRight(uhel);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle zelva, double delkaStrany, int pocetStran) {

        double uhel = 360.0 / pocetStran;

        for (int i = 0; i < pocetStran; i++) {
            zelva.move(delkaStrany);
            zelva.turnRight(uhel);
        }
    }

    private void nakresliObdelnik(Turtle zelva, double delkaStranyA, double delkaStranyB) {

        for (int i = 0; i < 2; i++) {
            zelva.move(delkaStranyA);
            zelva.turnRight(90);
            zelva.move(delkaStranyB);
            zelva.turnRight(90);
        }
    }

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliCtverec(zofka, 50.0);

        zofka.setLocation(200.0, 200.0);

        zofka.setLocation(100.0, 100.0);

        nakresliKruh(zofka, 20.0, 24);

        zofka.setLocation(300.0, 100.0);

        nakresliRovnostrannyTrojuhelnik(zofka, 50, 3);

        zofka.setLocation(250.0, 200.0);

        nakresliObdelnik(zofka, 50.0, 100);
    }
}
