public class Score{
  private int score;
  private String name,level;
  public Score(int score, String name,String level){
    this.score=score;
    this.name=name;
    this.level=level;
  }
  public int getScore(){
    return score;
  }
  public String getName(){
    return name;
  }
  public String getLevel(){
    return level;
  }
  public String toString(){
    return name+" "+level+" "+score;
  }
}