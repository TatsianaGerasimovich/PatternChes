package chess;

public class Chess {

    private String name;
    private String king;//король
    private String queen;//ферзь
    private String rook;//ладья
    private String bishop;//слон
    private String knight;//конь
    private String pawn;//пешка

    public void setName(String value) {
        name = value;
    }

    public void setKing(String value) {
        king = value;
    }

    public void setQueen(String value) {
        queen = value;
    }

    public void setRook(String value) {
        rook = value;
    }

    public void setBishop(String value) {
        bishop = value;
    }

    public void setKnight(String value) {
        knight = value;
    }

    public void setPawn(String value) {
        pawn = value;
    }

    public void production() {
        System.out.println("Производство:" + name);
    }

    public void productionKing() {
        System.out.println("Производство короля:" + king);
    }

    public void productionQueen() {
        System.out.println("Производство ферзя:" + queen);
    }

    public void productionRook() {
        System.out.println("Производство ладьи х2:" + rook);
    }

    public void productionBishop() {
        System.out.println("Производство слона х2:" + bishop);
    }

    public void productionKnight() {
        System.out.println("Производство коня х2:" + knight);
    }

    public void productionPawn() {
        System.out.println("Производство пешки х8:" + pawn);
    }

    public String getName() {
        return name;
    }
}
