public class Picture{
    private int difficulty, coloured;
    private String [] colours;
    
    public Picture(String [] colours, int coloured, int difficulty)
    {
     this.difficulty=difficulty;
     this.coloured=coloured;
     this.colours=colours;
    }
    
    private String [] getColours(){
        return this.colours;
    }
    
    private int getColoured(){
        return this.coloured;
    }
    
    private int getDifficulty(){
        return this.difficulty;
    }
    
    
}