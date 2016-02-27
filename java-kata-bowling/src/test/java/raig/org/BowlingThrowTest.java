package raig.org;

import org.junit.Test;
import raig.org.bowling.domain.BowlingThrow;

import static junit.framework.TestCase.assertEquals;

public class BowlingThrowTest {

  @Test
  public void shouldReturnThePoints(){

    BowlingThrow bowlingTrhow = new BowlingThrow(4);
    assertEquals(bowlingTrhow.getPoints(),4);

  }
}
