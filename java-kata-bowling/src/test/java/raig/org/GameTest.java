package raig.org;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;
import raig.org.bowling.domain.Frame;
import raig.org.bowling.domain.Game;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

public class GameTest {

  @Test
  public void whenOneFrameIsPlayedShouldReturnPointOfTheFrame() throws Exception {
    Frame frame = Mockito.mock(Frame.class);
    when(frame.getPoints()).thenReturn(5);

    Game game = new Game();
    game.add(frame);

    assertEquals(5,game.getPoints());

  }

  @Test( expected = Exception.class)
  public void whenMoreThanTenFramesAreAddedShouldGenerateAException() throws Exception {
    Frame frame = Mockito.mock(Frame.class);
    when(frame.getPoints()).thenReturn(5);

    Game game = new Game();
    game.add(frame); //1
    game.add(frame);
    game.add(frame);
    game.add(frame);
    game.add(frame);//5
    game.add(frame);
    game.add(frame);
    game.add(frame);
    game.add(frame);
    game.add(frame); //10
    game.add(frame);


  }
}
