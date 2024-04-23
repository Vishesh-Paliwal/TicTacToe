package Models;

public class Bot extends Player{
    DifficultyLevel dificulty;

    public Bot(String name , Symbol symbol , PlayerType type , DifficultyLevel level){
        super(name,symbol,type);
        this.dificulty = level;
    }
    public Bot(){
        
    }
}
