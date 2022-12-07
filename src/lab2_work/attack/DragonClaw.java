package lab2_work.attack;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

// атака Tyrunt и Tyrantrum
public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        super(Type.DRAGON, 80, 100);
    }
    @Override
    protected String describe() {
        return "использует Dragon Claw";
    }
}
