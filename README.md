# sudoku-solver
### Description
A text-based sudoku solver that utilizes a recursive backtracking algorithm to find a valid solution.

Currently can only solve 9x9 puzzles.

### Input
Input a puzzle file from the puzzles folder. For example: ```puzzles\puzz06```

```
puzzle from: http://www.telegraph.co.uk/news/science/science-news/9359579/Worlds-hardest-sudoku-can-you-crack-it.html
8 . . . . . . . .
. . 3 6 . . . . .
. 7 . . 9 . 2 . .
. 5 . . . 7 . . .
. . . . 4 5 7 . .
. . . 1 . . . 3 .
. . 1 . . . . 6 8
. . 8 5 . . . 1 .
. 9 . . . . 4 . .
```

### Output
The program will print the initial puzzle, solve it using the recursive backtracker, and then print the solution.

```
Initial Puzzle:

 8 . .  . . .  . . . 
 . . 3  6 . .  . . . 
 . 7 .  . 9 .  2 . . 

 . 5 .  . . 7  . . . 
 . . .  . 4 5  7 . . 
 . . .  1 . .  . 3 . 

 . . 1  . . .  . 6 8 
 . . 8  5 . .  . 1 . 
 . 9 .  . . .  4 . . 

Puzzle Solution:

 8 1 2  7 5 3  6 4 9 
 9 4 3  6 8 2  1 7 5 
 6 7 5  4 9 1  2 8 3 

 1 5 4  2 3 7  8 9 6 
 3 6 9  8 4 5  7 2 1 
 2 8 7  1 6 9  5 3 4 

 5 2 1  9 7 4  3 6 8 
 4 3 8  5 2 6  9 1 7 
 7 9 6  3 1 8  4 5 2 
```
