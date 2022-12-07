package lab2_work.attack;

import ru.ifmo.se.pokemon.*;

// атака Tyrunt и Tyrantrum
public class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2) {
            p.setMod(Stat.DEFENSE, -1);
        }
    }
    @Override
    protected String describe() {
        return "использует Crunch";
    }
}
