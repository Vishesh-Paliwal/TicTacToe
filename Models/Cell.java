package Models;

public class Cell {
    private int row;
    private int col;
    Player player;
    CellState stateOfCell;

    public Cell(){

    }
    public Cell(int row , int col , Player player , CellState state){
        this.row = row;
        this.col = col;
        this.player = player;
        this.stateOfCell = state;
    }
}
