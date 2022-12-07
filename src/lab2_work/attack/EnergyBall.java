package lab2_work.attack;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

// атака Gardevoir
public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использует EnergyBall";
    }
}

