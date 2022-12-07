package lab2_work.mypokemons;
import lab2_work.attack.BrutalSwing;


public class Tyrantrum extends Tyrunt {
    public Tyrantrum(String name, int lvl) {
        super(name, lvl);
        setStats(82, 121, 119, 69, 59, 71);
        addMove(new BrutalSwing());
    }
}