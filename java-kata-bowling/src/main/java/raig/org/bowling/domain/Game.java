package raig.org.bowling.domain;

public class Game {
  private static final int MAX_NUMBER_FRAMES = 10;
  private int points;
  private int numberOfFrames;

  public int getPoints() {
    return points;
  }

  public void add(Frame frame) throws Exception {
    if (numberOfFrames >= MAX_NUMBER_FRAMES)
      throw new Exception("Maximum number of Frames");
    points += frame.getPoints();
    numberOfFrames++;
  }
}
