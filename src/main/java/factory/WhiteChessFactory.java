package factory;

import chess.Chess;
import chess.WhiteMiniSizeChess;
import chess.WhiteStandardSizeChess;
import factory.ChessFactory;

public class WhiteChessFactory extends ChessFactory {

    private static WhiteChessFactory instance;

    private WhiteChessFactory() {
    }

    public static WhiteChessFactory getInstance() {
        if (instance == null) {
            instance = new WhiteChessFactory();
        }
        return instance;
    }

    public Chess createChess(String type) {
        Size request = Size.getType(type);
        switch (request) {  //через enum
            case STANDART:
                return new WhiteStandardSizeChess();
            case MINI:
                return new WhiteMiniSizeChess();
            default:
                return null;
        }
    }
}
