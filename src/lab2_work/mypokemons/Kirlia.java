package lab2_work.mypokemons;

import lab2_work.attack.Charm;

public class Kirlia extends Ralts{
    public Kirlia(String name, int lvl) {
        super(name, lvl);
        setStats(38, 35, 35, 65, 55, 50);
        addMove(new Charm());
    }
}
