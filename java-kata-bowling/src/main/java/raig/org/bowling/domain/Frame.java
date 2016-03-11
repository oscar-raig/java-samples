package raig.org.bowling.domain;

public class Frame {

  public enum TypeOfFrame {
    SPARE, STRIKE, NONE
  }
  private static final int MAX_NUMBER_THROWS = 3 ;
  private static final int NUMBER_OF_PINS = 10;
  private  int points;
  private int numberOfThrows;
  private TypeOfFrame typOfFrame;
  BowlingThrow[] listOfBowlingThrows;

  public Frame(){
    listOfBowlingThrows = new BowlingThrow[MAX_NUMBER_THROWS];
    typOfFrame = TypeOfFrame.NONE;
  }
  public void add(BowlingThrow bowlingThrow) throws Exception {
    if ( numberOfThrows >= MAX_NUMBER_THROWS)
      throw new Exception("Maximum number of Throws");

    points += bowlingThrow.getPoints();

    listOfBowlingThrows[numberOfThrows] = bowlingThrow;
    numberOfThrows++;

    calculateTypeOfFrame(bowlingThrow);

  }

  private void calculateTypeOfFrame(BowlingThrow bowlingThrow) {
    if( bowlingThrow.getPoints() == 10 )
      typOfFrame = TypeOfFrame.STRIKE;
    else if(getRemainsPins(numberOfThrows) == 0)
      typOfFrame = TypeOfFrame.SPARE;
  }

  public int getPoints() {

    return points;
  }

  public int getRemainsPins(int numberOfThrow) {

    int NumberOfRemainsPins = NUMBER_OF_PINS;
    for ( int i = 0; i < numberOfThrow; i++){
      NumberOfRemainsPins = NumberOfRemainsPins - listOfBowlingThrows[i].getPoints();
    }
    return NumberOfRemainsPins;
  }

  public TypeOfFrame getTypeOfFrame() {
    return typOfFrame;
  }
}
