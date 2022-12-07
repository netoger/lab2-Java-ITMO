package lab2_work.mypokemons;

import lab2_work.attack.DazzlingGleam;
import lab2_work.attack.DrainingKiss;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int lvl) {
        super(name, lvl);
        setStats(28, 25, 25, 45, 35, 40);
        setType(Type.FAIRY, Type.PSYCHIC);
        setMove(new DrainingKiss(), new DazzlingGleam());
    }
}
