package factory;

import chess.Chess;

public abstract class ChessFactory {
    public Chess orderChess (String type) {
        Chess Chess;
        
        Chess = createChess(type);
        
        Chess.production();
        Chess.productionKing();
        Chess.productionQueen();
        Chess.productionRook();
        Chess.productionBishop();
        Chess.productionKnight();
        Chess.productionPawn();

        return Chess;
    }
    protected abstract Chess createChess (String type);
}
