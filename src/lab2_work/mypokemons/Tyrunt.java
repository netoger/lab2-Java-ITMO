package lab2_work.mypokemons;

import lab2_work.attack.Crunch;
import lab2_work.attack.DragonClaw;
import lab2_work.attack.TailWhip;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrunt extends Pokemon {
    public Tyrunt(String name, int lvl) {
        super(name, lvl);
        setStats(58, 89, 77, 45, 45, 48);
        setType(Type.ROCK, Type.DRAGON);
        setMove(new DragonClaw(), new Crunch(), new TailWhip());
    }
}
