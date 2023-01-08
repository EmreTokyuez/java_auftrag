import java.util.Scanner;

public class Sudoku {
    public static final int BoardSize = 9;
    public static final int SubGridSize = 3;
    int[][]grid=new int[][]{
    {7,0,0,0,0,0,2,0,0},
    {4,0,2,0,0,0,0,0,3},
    {0,0,0,2,0,1,0,0,0},
    {3,0,0,1,8,0,0,9,7},
    {0,0,9,0,7,0,6,0,0},
    {6,5,0,0,3,2,0,0,1},
    {0,0,0,4,0,9,0,0,0},
    {5,0,0,0,0,0,1,0,6},
    {0,0,6,0,0,0,0,0,8}
    };
    
        // Check if a number is valid in a given cell
        public boolean isValid(int row, int col, int num) {
            // Check if the number is already in the row
            for (int i = 0; i < 9; i++) {
                if (grid[row][i] == num) {
                    return false;
                }
            }
    
            // Check if the number is already in the column
            for (int i = 0; i < 9; i++) {
                if (grid[i][col] == num) {
                    return false;
                }
            }
    
            // Check if the number is already in the 3x3 subgrid
            int startRow = row - row % 3;
            int startCol = col - col % 3;
            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if (grid[i][j] == num) {
                        return false;
                    }
                }
            }
    
            // If the number is not in the row, column, or subgrid, it is valid
            return true;
        }
    
        // Print the grid to the console
        public void printGrid() {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    
        public void play() {
            Scanner scanner = new Scanner(System.in);
    
            while (true) {
                // Print the grid
                printGrid();
    
                // Prompt the user to enter a row, column, and number
                System.out.print("Enter row: ");
                int row = scanner.nextInt();
                System.out.print("Enter column: ");
                int col = scanner.nextInt();
                System.out.print("Enter number: ");
                int num = scanner.nextInt();
    
                // Check if the move is valid
                if (isValid(row, col, num)) {
                    // Update the grid with the new number
                    grid[row][col] = num;
                } else {
                    // Display an error message
                    System.out.println("Invalid move");
                }
            }
        }
    

    }

