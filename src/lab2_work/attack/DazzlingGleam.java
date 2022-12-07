package lab2_work.attack;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

// атака Ralt, Kirlia и Gardevoir
public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam() {
        super(Type.FAIRY, 80, 100);
    }
    @Override
    protected String describe() {
        return "Использует Dazzling Gleam";
    }
}
