package start;

import chess.Chess;
import factory.WhiteChessFactory;
import factory.BlackChessFactory;
import factory.ChessFactory;
import java.util.Random;

public class Production {
    
    public static void main(String[] args) {
        Random rand = new Random();
        Boolean a;
        a = rand.nextBoolean();
        BlackChessFactory getSingletonBlack = null;
        WhiteChessFactory getSingletonWhite = null;
        if (a) {
            ChessFactory black = getSingletonBlack.getInstance();
            Chess Chess1 = black.orderChess("стандартные");
            ChessFactory white = getSingletonWhite.getInstance();
            Chess Chess2 = white.orderChess("стандартные");
            System.out.println("Производство завершено!");
            System.out.println("Вы получили " + Chess1.getName() + " и " + Chess2.getName());
        } else {
            ChessFactory black = getSingletonBlack.getInstance();
            Chess Chess1 = black.orderChess("мини");
            ChessFactory white = getSingletonWhite.getInstance();
            Chess Chess2 = white.orderChess("мини");
            System.out.println("Производство завершено!");
            System.out.println("Вы получили " + Chess1.getName() + " и " + Chess2.getName());

        }

    }
}
