/**
 * The Score class scores a new score after the user completes a level. It stores
 * the level completed, the username, and the score of the user.
 * <p>
 * <b>Instance Variables: </b>
 * <p>
 * <b>score </b> Integer storing the score of the user.
 * <p>
 * <b>name </b> String object storing the user's username.
 * <p>
 * <b>level </b> String object storing the level completed by the user.
 * @author Phaze Inc.
 * @version FINAL - June 10, 2016
 */
public class Score{
  private int score;
  private String name,level;
  
  /**
   * The constructor sets the 3 private instance variables based on parameter
   * passes.
   * @param score The score of the user as an integer.
   * @param name The user's username as a Strng object.
   * @param level The level the user completed as a String object.
   */
  public Score(int score, String name,String level){
    this.score=score;
    this.name=name;
    this.level=level;
  }
  
  /**
   * Returns the score stored in the score variable.
   * @return int Score of the user in this instance.
   */
  public int getScore(){
    return score;
  }
  
  /**
   * Returns the name stored in the name variable.
   * @return String Username of the user in this instance.
   */
  public String getName(){
    return name;
  }
  
  /**
   * Returns the level stored in the level variable.
   * @return String Level completed by the user in this instance.
   */
  public String getLevel(){
    return level;
  }
  
  /**
   * The toString() method returns all 3 pieces of data stored in the format of 
   * name level score.
   * @return String String representation of all data.
   */
  public String toString(){
    return name+" "+level+" "+score;
  }
}