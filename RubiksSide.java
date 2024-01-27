// 1 : red
// 2 : blue
// 3 : orange
// 4 : green
// 5 : white
// 6 : yellow

public class RubiksSide {
    private int size;
    private int[][] values;
    
    public RubiksSide(int size, int value) {
        this.size = size;
        this.values = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                this.values[i][j] = value;
            }
        }
    }
    public RubiksSide(int size, int[][] values) {
        this.size = size;
        this.values = values;
    }

    public int[][] getValues() {
        return this.values;
    }

    public int[] getRow(int row) {
        return this.values[row];
    }

    public int[] getColumn(int column) {
        int[] columnValues = new int[this.size];
        for(int i = 0; i < this.size; i++) {
            columnValues[i] = this.values[i][column];
        }
        return columnValues;
    }

    public void setRow(int row, int[] values) {
        this.values[row] = values;
    }

    public void setColumn(int column, int[] values) {
        for(int i = 0; i < this.size; i++) {
            this.values[i][column] = values[i];
        }
    }
    
    public void rotateClockwise(){
        int[][] newValues = new int[this.size][this.size];
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                newValues[j][this.size - 1 - i] = this.values[i][j];
            }
        }
        this.values = newValues;
    }

    public void rotateCounterClockwise(){
        int[][] newValues = new int[this.size][this.size];
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                newValues[this.size - 1 - j][i] = this.values[i][j];
            }
        }
        this.values = newValues;
    }

    public RubiksSide clonedReversed() {
        int[][] newValues = new int[this.size][this.size];
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                newValues[this.size - 1 - i][j] = this.values[i][j];
            }
        }
        return new RubiksSide(this.size, newValues);
    }    

    public void printSide() {
        for (int[] row : this.values) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}