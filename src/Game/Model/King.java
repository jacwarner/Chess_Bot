package Game.Model;

public class King extends Piece{
    private boolean hasCastled = false;
    private boolean inCheck = false;

    public King(boolean iswhite) {
        super(iswhite);
    }

    public boolean isHasCastled() {
        return hasCastled;
    }

    public void setHasCastled(boolean hasCastled) {
        this.hasCastled = hasCastled;
    }

    public boolean isInCheck() {
        return inCheck;
    }

    public void setInCheck(boolean inCheck) {
        this.inCheck = inCheck;
    }

    @Override
    public boolean viableMove(Board board, Spot start, Spot end) {
        //Can't move piece to a Spot object that already contains a piece with the same color
        if (end.getPiece().getIsWhite() == this.getIsWhite()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getX() - end.getX());
        if (x <= 1 && y <= 1) {
            return !isChecked();
        }
        else {
            return this.isValidCastling(board, start, end);
        }
    }

    private boolean isValidCastling(Board board, Spot start, Spot end) {
        if(this.isHasCastled()){return false;}
        //TODO
        return false;
    }

    public boolean isCastlingMove(Spot start, Spot end){
        return false;
    }

    public boolean isChecked(){
        //TODO
        //Check straight lines
        //Check diagonals
        //Check pawns
        //Check kings
        //Check knights
        return true;
    }
}
