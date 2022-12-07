package lab2_work;
import lab2_work.mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class batlle {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Sableye("Очки", 1);
        Pokemon p2 = new Tyrunt("Крекс", 1);
        Pokemon p3 = new Tyrantrum("Крекс старший", 1);
        Pokemon p4 = new Ralts("Крыса", 1);
        Pokemon p5 = new Kirlia("Девочка", 1);
        Pokemon p6 = new Gardevoir("ААААА призрак", 1);
        b.addAlly(p4);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(p6);
        b.addFoe(p3);
        b.addFoe(p5);
        b.go();
    }
}
