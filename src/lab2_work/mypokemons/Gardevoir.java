package lab2_work.mypokemons;

import lab2_work.attack.EnergyBall;

public class Gardevoir extends Kirlia{
    public Gardevoir(String name, int lvl) {
        super(name, lvl);
        setStats(68, 65, 65, 125, 115, 80);
        addMove(new EnergyBall());
    }
}
