package dev.krishvora09;

//class SpecialGameAction extends GameAction {}
//class SpecialGameAction extends Weapon {}

import dev.krishvora09.game.GameConsole;
import dev.krishvora09.pirate.PirateGame;

//class SpecialGameConsole<T extends Game<? extends Player>>
//        extends GameConsole<Game<? extends Player>> {
//
//    SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {

    public static void main(String[] args) {

        GameConsole<PirateGame> game =
                new GameConsole<>(new PirateGame("Pirate Game"));

    }
}
