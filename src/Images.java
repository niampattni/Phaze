import javax.swing.*;

/**
 * The images class contains not only the images in the colouring book and their
 * info, but other information shared by all 3 levels in the game.
 * <p>
 * <b>Instance Variables: </b>
 * <p>
 * <b>names </b> Array of String objects containing the Strng names for all images.
 * <p>
 * <b>completion <b> Array of integers containing the colourable sections of each
 * respective image.
 * <p>
 * <b>level </b> Integer representing the current level being played.
 * <p>
 * <b>current </b> The current index number of the picture the user is on.
 * <p>
 * <b>panel </b> JPanel which everything is added to before being added to the
 * main panel.
 * <p>
 * <btimer </b> Creates an instance of the GameTimer class which is imperative
 * for the game to run correctly.
 * @author Phaze Inc.
 * @version FINAL - June 10, 2016
 */
public class Images {
  public static String[] names = {"TeddyBear", "CandyCane", "Cake", "Balloons", "Tree", "Elephant", "Flower", "Hearts", "Snail", "Duck", "Turkey", "Star"};
  public static int[] completion = {20, 18, 15, 7, 6, 17, 5, 9, 6, 7, 24, 7};
  public static int level = 0;
  public static int current = -1;
  public static JPanel panel = new JPanel();
  public static GameTimer timer;
}