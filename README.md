# Final Project
Objective:
Be the wealthiest player by purchasing properties, collecting rent, 
and managing your money wisely. The last player with money remaining 
(or the player with the highest net worth after a set number of turns) wins!

Setup:
4 players take turns automatically in a loop.
Each player begins at the "GO" tile and starts with a set amount of money (e.g., $1500).

The game board consists of tiles, including:
Properties (can be bought and generate rent),
Railroads and Utilities:
Railroads: (add $50 for every railroad you own to the money you earn everytime you pass go)
Utilities: (player roll 2 dices and earn the amount on the dices times 20)
On Your Turn:
Roll the Dice:
Click a button for the dice roll (2 dice, random numbers from 1–6).
The sum determines how many spaces your player moves clockwise on the board.

Land on a Tile:
The game calls the landOn() method for that tile.
If it's an unowned property, you may choose to buy it (your balance decreases, and it’s added to your owned properties).
If the property is already owned by another player, you must pay rent to that player.
If you pass the "GO" tile:
You receive a money bonus (e.g., $200), and
All rents on properties you own increase by 10%.

End of Turn:
The turn ends automatically, and the next player goes.

Special Rules:
Rent Increases:
Every time a player passes "GO", the rent for each property they own increases by 10%. Rent values are stored as doubles to support this change.

Ownership Tracking:
Each player has a list of the properties they own, which helps the game manage rent payments and upgrades.

 Winning the Game:
The game continues in rounds.

A player is eliminated if their balance reaches zero or lower.

You win by being the last player with money left, or the richest player when the game ends after a set number of rounds or turns.


