package lab2_work.attack;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

//атака Sableye
public class NightShade extends SpecialMove {
    public NightShade(double lvl) {
        super(Type.GHOST, lvl, 100);
    }
    @Override
    protected String describe() {
        return "использует Night Shade";
    }
}
