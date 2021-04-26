package Game.Model;

public abstract class Piece {
    private boolean alive = true;
    private boolean iswhite = true;

    public Piece(boolean iswhite){
        this.setIsWhite(iswhite);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getIsWhite() {
        return iswhite;
    }

    public void setIsWhite(boolean iswhite) {
        this.iswhite = iswhite;
    }

    public abstract boolean viableMove(Board board, Spot start, Spot end);

}
