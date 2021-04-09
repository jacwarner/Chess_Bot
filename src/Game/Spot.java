/**
 * <h1>Spot.java</h1>
 * Function: Creates and supports functionality for the Spot class object
 * <p>
 * Currently missing unit tests
 *
 *
 * @author   Jacob Warner - @jacwarner
 * @verision 1.0
 * @since    2021-04-09
 */
package Game;

public class Spot {

    //Variables for Class Spot
    private Piece piece;
    private int x;
    private int y;

    /**
     * Constructor for Spot class object
     * @param x int object for x position on chess board
     * @param y int object for y position on chess board
     * @param piece Piece object that currently occupies the space
     */
    public Spot(int x, int y, Piece piece){
        setPiece(piece);
        setX(x);
        setY(y);
    }

    /**
     * Returns the piece associated with this Spot object
     * @return piece Piece object that currently occupies the space
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Sets the current piece associated with this Spot object
     * @param piece Piece object that currently occupies the space
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    /**
     * Returns the x-position on the board associated with this Spot object
     * @return x int object for x position on chess board
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-position on the board associated with this Spot object
     * @return y int object for y position on chess board
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-position for the Spot object associated with its position on the board
     * @param y int object for y position on chess board
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Sets the x-positon for the Spot object associated with its position on the board
     * @param x int object for x position on chess board
     */
    public void setX(int x){
        this.x = x;
    }
}
