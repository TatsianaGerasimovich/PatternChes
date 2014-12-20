package factory;

import chess.BlackMiniSizeChess;
import chess.BlackStandardSizeChess;
import chess.Chess;
import factory.ChessFactory;

enum Size {

    STANDART("стандартные"),
    MINI("мини");

    private String typeValue;

    private Size(String type) {
        typeValue = type;
    }

    static public Size getType(String pType) {
        for (Size type : Size.values()) {
            if (type.getTypeValue().equals(pType)) {
                return type;
            }
        }
        throw new RuntimeException("unknown type");
    }

    public String getTypeValue() {
        return typeValue;
    }
}

public class BlackChessFactory extends ChessFactory {

    private static BlackChessFactory instance;

    private BlackChessFactory() {
    }

    public static BlackChessFactory getInstance() {
        if (instance == null) {
            instance = new BlackChessFactory();
        }
        return instance;
    }

    public Chess createChess(String type) {
        Size request = Size.getType(type);
        switch (request) {  //через enum
            case STANDART:
                return new BlackStandardSizeChess();

            case MINI:
                return new BlackMiniSizeChess();
            default:
                return null;
        }
    }
}
