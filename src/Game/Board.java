/**
 * <h1>Board.java</h1>
 * Function: Creates and supports functionality for the Board class object
 *
 * Currently missing functionality for adding pieces to starting board and unit testing
 *
 *
 * @author   Jacob Warner - @jacwarner
 * @verision 1.0
 * @since    2021-04-09
 */
package Game;

public class Board {
    Spot[][] spaces;

    /**
     * Board Constructor
     */
    public Board(){
        this.resetBoard();
    }

    /**
     * Returns a space on the board
     * @param x int value representing x-intercept on the board
     * @param y int value representing y-intercept on the board
     * @return a Spot object at the X and Y values provided
     * @throws Exception Index is beyond the bounds of the array
     */
    public Spot getSpace(int x, int y) throws Exception {
        if(x < 0 || x > 7 || y < 0 || y > 7)
            throw new Exception("Index out of bounds");

        return spaces[x][y];
    }

    /**
     * Resets the state of the board to the start of the game
     */
    public void resetBoard(){
        //Creates a blank board
        for(int i = 0; i < 8; i++){
            for(int k = 0; k < 8; k++){
                if(i % 2 == 0 && k % 2 == 0) {
                    spaces[i][k] = new Spot(i, k, null, 0);
                }
                else{
                    spaces[i][k] = new Spot(i, k, null, 1);
                }
            }
        }

        //Adds the pieces to the board
        //TODO
    }
}
