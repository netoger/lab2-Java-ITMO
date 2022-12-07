package lab2_work.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

// атака Kirlia и Gardevoir
public class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -2);
    }
    @Override
    protected String describe() {
        return "очаровывает";
    }
}
