package Models;
import java.util.*;

public class Board {
    private long size;
    private ArrayList<ArrayList<Cell>> listOfCell;

    public Board(){

    }
    public Board(long size, ArrayList<ArrayList<Cell>> listOfCell){
        this.size = size;
        this.listOfCell = listOfCell;
    }
}
