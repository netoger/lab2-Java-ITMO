package lab2_work.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

//атака Sableye
public class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe() {
        return "использует Leer";
    }
}
