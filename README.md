# Chess_Bot
A Chess program that creates a bot to play against a player in a game of chess

The program will be created utilizing two different packages Game and Bot.

# _Game_
This package will focus on creating a game of chess using Object Oriented
Programming.

<h3>_Structure_</h3>

The game will prompt the player to start a new game. In its basic form, 
the game will operate for two players but should still ask the player if 
they would like to play against another person or against the bot. Next, the
game should prompt the Player, to choose their piece, this is for later groundwork.
Each player, starting with white, will alternate turns until the game ends in either a 
draw or a win. During a Player's turn, they should be able to move a Piece 
as long as the move is valid. Upon completion of the move, the board should 
update accordingly. However, the player may end the game prematurely by 
resigning. Upon completion of the game, the game should announce the winner.


<h3>_States_</h3>
There are a total of 4 states that game may enter:
- PLAYING - a player is currently taking their turn
- BLACK_WON - Black won the game
- WHITE_WON - White won the game
- STALEMATE - Neither player won the game, no legal moves available

# _Bot_
TBA