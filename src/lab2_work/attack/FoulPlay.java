package lab2_work.attack;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

//атака Sableye
public class FoulPlay extends PhysicalMove {
    public FoulPlay() {
        super(Type.DARK, 95, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, 0);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "использует Foul Play";
    }
}
// нужно реализовать то, что Attack атакующего покемона меняется на атак защищающегося
/*    protected void applySelfEffect(Pokemon p, Pokemon def) {
        double atakDef = def.getStat(Stat.ATTACK);
        int atakDefi = (int) atakDef;
        Effect eff = new Effect().turns(0).stat(Stat.ATTACK, atakDefi);
        p.addEffect(eff);
    }*/
//p.setStats(p.getStat(Stat.HP), def.getStat(Stat.ATTACK), p.getStat(Stat.DEFENSE), p.getStat(Stat.SPECIAL_ATTACK), p.getStat(Stat.SPECIAL_DEFENSE), p.getStat(Stat.SPEED));

