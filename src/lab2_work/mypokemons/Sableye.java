package lab2_work.mypokemons;

import lab2_work.attack.FoulPlay;
import lab2_work.attack.Leer;
import lab2_work.attack.NightShade;
import lab2_work.attack.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sableye extends Pokemon {
    public Sableye(String name, int lvl) {
        super(name, lvl);
        setStats(50, 75, 75, 65, 65, 50);
        setType(Type.DARK, Type.GHOST);
        setMove(new FoulPlay(), new RockTomb(), new Leer(), new NightShade(lvl));
    }

    public Sableye() {
    }
}
