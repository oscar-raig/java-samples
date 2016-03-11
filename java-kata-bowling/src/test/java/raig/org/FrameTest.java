package raig.org;

import org.junit.Test;
import raig.org.bowling.domain.BowlingThrow;
import raig.org.bowling.domain.Frame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FrameTest {

  @Test
  public void whenAddOneThrowShouldReturnTheTotalPoints() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(3);
    frame.add(bowlingThrow);
    assertEquals(frame.getPoints(),3);
  }

  @Test
  public void whenAddTWOThrowShouldReturnTheTotalPoints() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(3);
    frame.add(bowlingThrow);
    frame.add(bowlingThrow);
    assertEquals(frame.getPoints(),6);
  }

  @Test (expected=Exception.class)
  public void generateExceptionWhenMoreThanThreeThrowsAreAdded() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(3);
    frame.add(bowlingThrow);
    frame.add(bowlingThrow);
    frame.add(bowlingThrow);
    frame.add(bowlingThrow);
  }

  // Number Of pins on Every Throw
  @Test
  public void whenOneThrowHowMaxPinsRemainInTheThrow() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(3);
    frame.add(bowlingThrow);

    assertEquals(frame.getRemainsPins(1),7);

  }


  // There was a strike or a spare
  // Number Of pins on Every Throw
  @Test
  public void whenOneThrowAndIsNotStrikeNeitherSpareIsNone() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(3);
    frame.add(bowlingThrow);

    assertEquals(frame.getTypeOfFrame(),Frame.TypeOfFrame.NONE);

  }


  @Test
  public void whenOneThrowAndIsStrike() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrow = new BowlingThrow(10);
    frame.add(bowlingThrow);

    assertEquals(frame.getTypeOfFrame(),Frame.TypeOfFrame.STRIKE);

  }

  @Test
  public void whenTwoThrowAndIsStrike() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrowNone = new BowlingThrow(0);
    frame.add(bowlingThrowNone);

    BowlingThrow bowlingThrowStrike = new BowlingThrow(10);
    frame.add(bowlingThrowStrike);

    assertEquals(frame.getTypeOfFrame(),Frame.TypeOfFrame.STRIKE);

  }

  @Test
  public void whenTwoThrowAndIsSpare() throws Exception {
    Frame frame = new Frame();
    BowlingThrow bowlingThrowNone = new BowlingThrow(3);
    frame.add(bowlingThrowNone);

    BowlingThrow bowlingThrowStrike = new BowlingThrow(7);
    frame.add(bowlingThrowStrike);

    assertEquals(frame.getTypeOfFrame(),Frame.TypeOfFrame.SPARE);

  }
}
