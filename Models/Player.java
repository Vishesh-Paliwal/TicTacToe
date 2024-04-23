package Models;

public class Player{
    private String name;
    Symbol symbol;
    PlayerType typeOfPlayer;

    public Player(String name , Symbol sym ,PlayerType type){
        this.name = name;
        this.typeOfPlayer = type;
    }
    public Player(){
        
    }
}