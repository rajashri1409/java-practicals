import java.util.*;

class GridManager {
    private int[][] grid;
    private int size;
    private Set<String> removedCells;

    public GridManager(int size) {
        this.size = size;
        this.grid = new int[size][size];
        this.removedCells = new HashSet<>();
        generateGrid();
    }

    private void generateGrid() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            List<Integer> availableNumbers = new ArrayList<>();
            for (int num = 1; num <= size; num++) {
                availableNumbers.add(num);
            }
            Collections.shuffle(availableNumbers);
            
            for (int j = 0; j < size; j++) {
                int num = availableNumbers.remove(0);
                if (!isValidColumn(j, num, i)) {
                    i = -1; 
                    break;
                }
                grid[i][j] = num;
            }
        }
    }

    private boolean isValidColumn(int col, int num, int upToRow) {
        for (int row = 0; row < upToRow; row++) {
            if (grid[row][col] == num) return false;
        }
        return true;
    }

    public void removeNumbers(int difficulty) {
        int removeCount = switch (difficulty) {
            case 1 -> (size * size) / 3; // Easy
            case 2 -> (size * size) / 2; // Medium
            case 3 -> (size * size * 3) / 4; // Hard
            default -> 0;
        };

        Random rand = new Random();
        while (removedCells.size() < removeCount) {
            int row = rand.nextInt(size);
            int col = rand.nextInt(size);
            String key = row + "," + col;
            if (!removedCells.contains(key)) {
                removedCells.add(key);
                grid[row][col] = 0; 
            }
        }
    }

    public void displayGrid() {
        System.out.println("\nGame Grid:");
        for (int row = 0; row < (size * 2) + 1; row++) {
            for (int col = 0; col < (size * 2) + 1; col++) {
                if (row % 2 == 0) {
                    if (col % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("__");
                    }
                } else {
                    if (col % 2 == 0) {
                        System.out.print("|");
                    } else {
                        int value = grid[row / 2][col / 2];
                        if (value == 0) {
                            System.out.print("  ");
                        } else {
                            System.out.print(" " + value);
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return removedCells.contains(row + "," + col);
    }

    public boolean setUserInput(int row, int col, int value) {
        if (value < 1 || value > size) return false;
        grid[row][col] = value;
        return true;
    }

    public boolean checkSolution() {
        for (int i = 0; i < size; i++) {
            Set<Integer> rowSet = new HashSet<>();
            Set<Integer> colSet = new HashSet<>();
            for (int j = 0; j < size; j++) {
                if (rowSet.contains(grid[i][j]) || colSet.contains(grid[j][i])) return false;
                rowSet.add(grid[i][j]);
                colSet.add(grid[j][i]);
            }
        }
        return true;
    }
}

public class Practical11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grid size: ");
        int size = scanner.nextInt();

        GridManager gridManager = new GridManager(size);
        System.out.println("Select difficulty:\n1. Easy\n2. Medium\n3. Hard");
        int difficulty = scanner.nextInt();
        gridManager.removeNumbers(difficulty);
        gridManager.displayGrid();

        while (true) {
            System.out.print("Enter row (1-" + size + "), column (1-" + size + ") and value, or -1 to check: ");
            int row = scanner.nextInt();
            if (row == -1) break;
            
            int col = scanner.nextInt();
            int value = scanner.nextInt();
            
            if (gridManager.isCellEmpty(row - 1, col - 1) && gridManager.setUserInput(row - 1, col - 1, value)) {
                gridManager.displayGrid();
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }

        if (gridManager.checkSolution()) {
            System.out.println("Congratulations! You solved the puzzle!");
        } else {
            System.out.println(" your solution is wrong !... try Again .. ");
        }

        scanner.close();
    }
}

