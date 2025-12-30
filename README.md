# Tic Tac Toe Game

A classic implementation of the Tic Tac Toe game.

## Description

This project implements a traditional Tic Tac Toe game where two players take turns marking spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

## Features

- Two-player gameplay
- Clean user interface
- Win detection
- Draw/tie detection
- Game reset functionality

## Installation

```bash
git clone https://github.com/yourusername/TicTacToeGame.git
cd TicTacToeGame
```

## Usage

Instructions for running the game will be added based on your implementation.

## How to Play

1. Player 1 (X) and Player 2 (O) take turns
2. Click/select a cell to place your mark
3. First player to get three in a row wins
4. If all cells are filled with no winner, the game is a draw

## Examples

### Board Layout

The game board uses a 0-based indexing system:

```
 0 | 1 | 2
-----------
 3 | 4 | 5
-----------
 6 | 7 | 8
```

### Sample Game Flow

**Turn 1:** Player X selects position 4 (center)
```
    |   |  
-----------
    | X |  
-----------
    |   |  
```

**Turn 2:** Player O selects position 0 (top-left)
```
 O |   |  
-----------
    | X |  
-----------
    |   |  
```

**Turn 3:** Player X selects position 8 (bottom-right)
```
 O |   |  
-----------
    | X |  
-----------
    |   | X
```

**Winning Example:** Player X wins with positions 0, 4, and 8 (diagonal)
```
 X |   | O
-----------
 O | X | O
-----------
    |   | X
```

## Technologies Used

- Java

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

Niharika Adepu

## Contact

For questions or feedback, please open an issue in the repository.
